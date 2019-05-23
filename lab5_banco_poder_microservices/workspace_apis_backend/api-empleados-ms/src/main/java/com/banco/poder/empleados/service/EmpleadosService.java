package com.banco.poder.empleados.service;

import java.util.List;

import com.banco.poder.empleados.modelo.EmpleadosDto;

public interface EmpleadosService {

	List<EmpleadosDto> obtenerEmpleados();

	void guardarEmpleados(EmpleadosDto empleadosDto);

	EmpleadosDto obtenerEmpleadoById(String id);

	void actualizarEmpleado(EmpleadosDto empleadosDto);
	
	void borrarEmplead(String id);
}
