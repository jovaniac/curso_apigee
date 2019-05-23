package com.banco.poder.empleados.modelo;

import com.banco.poder.empleados.constantes.Detalles;
import com.banco.poder.empleados.constantes.EmpleadosCreacion;

public class EmpleadosDto {
	
	private String id;
	private String nombre;
	private String apellidoMaterno;
	private String apellidoPaterno;
	private String edad;
	private String curp;
	private String rfc;
	private String domicilio;
	private String imagen;
	private String puesto;
	private String status;
	private String numeroDeEmpleado;
	private EmpleadosCreacion response;
	
	public static EmpleadosCreacion to(EmpleadosDto empleadosDto) {
		EmpleadosCreacion response = new EmpleadosCreacion();
		response.setCodigo("");
		response.setMensaje("");
		
		Detalles detalles = new Detalles();
		
		EmpleadosDto empleados = new EmpleadosDto();
		
		empleadosDto.setNombre("Yaridel");
		empleadosDto.setApellidoPaterno("arzate");
		empleadosDto.setApellidoMaterno("landa");
		empleadosDto.setEdad("27");
		empleadosDto.setCurp("ACJ900805AM3DJ");
		empleadosDto.setRfc("ACJ8003FJD48J3");
		empleadosDto.setDomicilio("bugamilias 2, colonia 10 de abril, cuernavaca morelos");
		empleadosDto.setImagen("sadsfgdsafsgjsdnafsgkdfnsasfkgljre5j4835ugrfweiawdkfsewdefgrsfeawdefs");
		empleadosDto.setPuesto("Abogada Sr");
		empleadosDto.setStatus("Activo");
		empleadosDto.setNumeroDeEmpleado("30839");
		empleadosDto.setId("9090");
		
		
		detalles.setEmpleados(empleados);
		
		response.setDetalles(detalles);
		

		return response;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNumeroDeEmpleado() {
		return numeroDeEmpleado;
	}

	public void setNumeroDeEmpleado(String numeroDeEmpleado) {
		this.numeroDeEmpleado = numeroDeEmpleado;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
