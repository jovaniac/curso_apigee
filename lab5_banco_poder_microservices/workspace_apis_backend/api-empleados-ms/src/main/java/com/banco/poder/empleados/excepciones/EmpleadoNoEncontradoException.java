package com.banco.poder.empleados.excepciones;

public class EmpleadoNoEncontradoException extends RuntimeException {

	private String codigo;
	private String mensaje;
	private String id;
	private String descripcion[];

	public EmpleadoNoEncontradoException(String message, String codigo, String id, String descripcion[]) {
		super(message);
		this.codigo = mensaje;
		this.id = id;
		this.descripcion = descripcion;
	}

	public static EmpleadoNoEncontradoException from(String message, String codigo, String id, String descripcion[]) {
		return new EmpleadoNoEncontradoException(message, codigo, id, descripcion);
	}

	public String getCodigo() {
		return codigo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public String getId() {
		return id;
	}

	public String[] getDescripcion() {
		return descripcion;
	}

}
