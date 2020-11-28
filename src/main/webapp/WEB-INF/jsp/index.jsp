<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado de Vendedores</title>
    <!-- CSS Bootstrap -->
	<spring:url value="/resources/css/bootstrap.min.css" var="bootstrapCSS" />
    <spring:url value="/resources/css/datatables.css" var="datatablesCSS"/>
    <spring:url value="/resources/css/dataTables.bootstrap4.css" var="datatablesbCSS"/>
    
    <link href="${bootstrapCSS}" rel="stylesheet" />
    <link href="${datatablesCSS}" rel="stylesheet" />
    <link href="${datatablesbCSS}" rel="stylesheet" />
    
    <!-- jQuery, datatable -->
    <spring:url value="/resources/js/jquery-3.5.1.min.js" var="jqueryJS" />
    <spring:url value="/resources/js/datatables.js" var="datatablesJS"/>
   	<spring:url value="/resources/js/jquery.dataTables.es.js" var="datatablesEsJS"/>
    
    <script src="${jqueryJS}"></script>
    <script src="${datatablesJS}"></script>
    <script src="${datatablesEsJS}"></script>
    
</head>
<body class="text-center" style="padding: 10px;">

	<h2>Gestión de Vendedores</h2>
	
	<form>
		<div class="container">
			<div class="row">
				<div class="form-group col">
					<label for="selectOfi">Oficina</label>
					<select class="form-control" id="selectOfi">
						<option items="${listofi}"></option>
					</select>
				</div>
				<div class="form-group col">
					<label for="selectmang">Sales Manager</label>
					<select class="form-control" id="selectmang">
						<option items="${listman}"></option>
					</select>
				</div>
				<div class="col">
					<button class="btn btn-info btn-lg" href="/filtros/">Buscar</button><!-- ingresar filtros de busqueda ${}-->
				</div>
			</div>
		</div>
	</form>	
	

	<table id="tabla" class="table table-striped table-bordered" style="width: 100%; ">
		<thead>		
		<tr>
			<th>Num Empleado</th>
			<th>Nombre</th>
			<th>Mail</th>
			<th>Oficina</th>
			<th>Manager</th>
			<th>Acción</th>
		</tr>
		</thead>
		
		<tbody>
		<c:forEach items="${listemp}" var="vend">
		<tr>
			<td>${vend.getId()}</td> 
			<td>${vend.getNombre()," ", vend.getApellido()}</td>
			<td>${vend.getEmail()}</td>
			<td>${vend.getOficina()}</td><!-- recuperar nombre de oficina -->
			<td>${vend.getManager()}</td><!-- recuperar nombre de manager -->
			<td>			
				<a class="btn btn-info mb-1" title="Detalle cliente" href="#">ver</a>&nbsp;
			</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>


</body>
</html>