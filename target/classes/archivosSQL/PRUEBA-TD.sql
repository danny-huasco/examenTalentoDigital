/* Se requiere una nómina con los datos de los representantes de venta (Sales Rep) junto al
país y oficina al cual pertenece. Ordene alfabéticamente por país, ciudad y primer nombre. */


select offices.country, offices.city, employees.firstname, employees.lastname, employees.email
from employees inner join offices
on offices.officecode = employees.officecode and employees.jobtitle='Sales Rep'
order by country, city, firstname asc;


/*Se requiere tener un listado de los clientes que corresponden a empresas de
 responsabilidad limitada (Ltd), con sus límites de crédito ordenados de mayor a menor*/

select customerNumber, customerName, creditLimit from customers
where customerName like '%Ltd%'
order by creditLimit desc;


/* Se requiere tener un listado con los representantes de venta (Sales Rep) y su cartera de
clientes (cantidad de empresas que atienden), ordenado de forma descendente desde la
cartera más grande*/

select employees.employeenumber, employees.firstName, employees.lastName, count()  *********
from employees, customers
where employees.employeenumber = customers.salesrepemployeenumber
order by count desc;


/*Se requiere un ranking de ventas por oficina. Esto es, la cantidad de órdenes que han sido
cursadas por los clientes, asociados a los representantes de venta de cada oficina. El listado
debe estar ordenado por cantidad de ventas de mayor a menor. */




-- ranking de clientes que mas compraron en 2004, ordenar de mayor a menor  por suma de monto de ordenes

select customername, sum(payments.amount)
from customers, payments 
where payments.customernumber=customers.customernumber;