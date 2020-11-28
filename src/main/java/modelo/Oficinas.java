package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="offices")
public class Oficinas {

	@Column(name="officecode")
	private String codigo;
	@Column(name="city")
	private String ciudad;
	@Column(name="phone")
	private String telefono;
	@Column(name="addressline1")
	private String direccionLinea1;
	@Column(name="addressline2")
	private String direccionLinea2;
	@Column(name="state")
	private String estado;
	@Column(name="country")
	private String pais;
	@Column(name="postalcode")
	private String codPostal;
	@Column(name="territory")
	private String territorio;
	
	public Oficinas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Oficinas(String codigo, String ciudad, String telefono, String direccionLinea1, String direccionLinea2,
			String estado, String pais, String codPostal, String territorio) {
		super();
		this.codigo = codigo;
		this.ciudad = ciudad;
		this.telefono = telefono;
		this.direccionLinea1 = direccionLinea1;
		this.direccionLinea2 = direccionLinea2;
		this.estado = estado;
		this.pais = pais;
		this.codPostal = codPostal;
		this.territorio = territorio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccionLinea1() {
		return direccionLinea1;
	}

	public void setDireccionLinea1(String direccionLinea1) {
		this.direccionLinea1 = direccionLinea1;
	}

	public String getDireccionLinea2() {
		return direccionLinea2;
	}

	public void setDireccionLinea2(String direccionLinea2) {
		this.direccionLinea2 = direccionLinea2;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}

	public String getTerritorio() {
		return territorio;
	}

	public void setTerritorio(String territorio) {
		this.territorio = territorio;
	}

	@Override
	public String toString() {
		return "Oficinas [codigo=" + codigo + ", ciudad=" + ciudad + ", telefono=" + telefono + ", direccionLinea1="
				+ direccionLinea1 + ", direccionLinea2=" + direccionLinea2 + ", estado=" + estado + ", pais=" + pais
				+ ", codPostal=" + codPostal + ", territorio=" + territorio + "]";
	}
	
	
}
