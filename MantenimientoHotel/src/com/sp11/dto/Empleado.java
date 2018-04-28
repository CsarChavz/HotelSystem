package com.sp11.dto;

import com.sp11.generalClases.Persona;

public class Empleado extends Persona{
	private Integer codEmpleado;

	public Empleado() {
		super();
	}

	public Integer getCodEmpleado() {
		return codEmpleado;
	}

	public void setCodEmpleado(Integer codEmpleado) {
		this.codEmpleado = codEmpleado;
	}	

}
