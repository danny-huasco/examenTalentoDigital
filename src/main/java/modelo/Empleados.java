package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Empleados {
	
	@Column(name="employeenumber")
	private int id;
	@Column(name="lastname")
	private String apellido;
	@Column(name="firstname")
	private String nombre;
	@Column(name="extension")
	private String extension;
	@Column(name="email")
	private String email;
	@Column(name="officecode")
	private String codOficina;
	@Column(name="reportsto")
	private int codJefe;
	@Column(name="jobtitle")
	private String puesto;
	
	public Empleados() {
		super();
	}

	public Empleados(int id, String apellido, String nombre, String extension, String email, String codOficina,
			int codJefe, String puesto) {
		super();
		this.id = id;
		this.apellido = apellido;
		this.nombre = nombre;
		this.extension = extension;
		this.email = email;
		this.codOficina = codOficina;
		this.codJefe = codJefe;
		this.puesto = puesto;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCodOficina() {
		return codOficina;
	}

	public void setCodOficina(String codOficina) {
		this.codOficina = codOficina;
	}

	public int getCodJefe() {
		return codJefe;
	}

	public void setCodJefe(int codJefe) {
		this.codJefe = codJefe;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	@Override
	public String toString() {
		return "Empleados [id=" + id + ", apellido=" + apellido + ", nombre=" + nombre + ", extension=" + extension
				+ ", email=" + email + ", codOficina=" + codOficina + ", codJefe=" + codJefe + ", puesto=" + puesto
				+ "]";
	}
	
}
