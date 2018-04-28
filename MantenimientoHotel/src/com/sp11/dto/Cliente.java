package com.sp11.dto;

import com.sp11.generalClases.Persona;

public class Cliente extends Persona {
	private Integer codCliente;

	public Cliente() {
		super();
	}
	public Integer getCodCliente() {
		return codCliente;
	}
	public void setCodCliente(Integer codCliente) {
		this.codCliente = codCliente;
	}
	
}
