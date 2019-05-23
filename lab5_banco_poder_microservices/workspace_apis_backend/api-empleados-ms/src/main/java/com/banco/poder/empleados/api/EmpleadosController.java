package com.banco.poder.empleados.api;

import static org.springframework.http.HttpStatus.OK;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.banco.poder.empleados.constantes.EmpleadosCreacion;
import com.banco.poder.empleados.modelo.EmpleadosDto;
import com.banco.poder.empleados.service.EmpleadosService;

@RestController
@RequestMapping("/empleados/v1")
public class EmpleadosController {
	
	@Autowired
	private EmpleadosService empleadosService;
	
	@GetMapping("/")
	@ResponseStatus(OK)
	public List<EmpleadosDto> getEmpleados(){
		return empleadosService.obtenerEmpleados();
	}
	
	@GetMapping("/{id}")
	public EmpleadosDto getEmpleadoById(@PathVariable("id") String id) {
		return empleadosService.obtenerEmpleadoById(id);
	}
	
	public EmpleadosCreacion createEmpleado(@RequestBody EmpleadosDto empleadosDto) {
		return empleadosService.guardarEmpleados(empleadosDto);
	}
}
