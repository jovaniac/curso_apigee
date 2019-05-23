package com.banco.poder.empleados.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.banco.poder.empleados.constantes.Constantes;
import com.banco.poder.empleados.excepciones.EmpleadoNoEncontradoException;
import com.banco.poder.empleados.modelo.EmpleadosDto;

@Service
public class EmpleadosServiceImpl implements EmpleadosService {

	private static final Logger log = Logger.getLogger(EmpleadosServiceImpl.class);
	private static List<EmpleadosDto> empleadosList = new ArrayList<>();

	static {
		EmpleadosDto empleadosDto = new EmpleadosDto();
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

	}

	@Override
	public List<EmpleadosDto> obtenerEmpleados() {

		return empleadosList;
	}

	@Override
	public void guardarEmpleados(EmpleadosDto empleadosDto) {
		empleadosDto.setId(String.valueOf(new Random().nextInt()));
		empleadosList.add(empleadosDto);

	}

	@Override
	public EmpleadosDto obtenerEmpleadoById(String id) {
		Optional<EmpleadosDto> empleado = empleadosList.stream().filter(s -> id.equals(s.getId())).findFirst();

		return empleado.orElseThrow(() -> new EmpleadoNoEncontradoException(
				Constantes.MENSAJE_404 + Constantes.CODIGO_BACKEND_404, id, Constantes.DESCRIPCION_1_404, null));
	}

	@Override
	public void actualizarEmpleado(EmpleadosDto empleadosDto) {
		
	}

	@Override
	public void borrarEmplead(String id) {
		empleadosList.removeIf(l -> l.getId().equals(id));

	}

}
