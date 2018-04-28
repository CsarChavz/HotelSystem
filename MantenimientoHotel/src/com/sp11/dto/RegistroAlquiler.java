package com.sp11.dto;

public class RegistroAlquiler {
	private Integer codRegistroAlquiler;
	private Integer codHabitacion;
	private Integer codCliente;
	private Integer codEmpleado;
	private Integer codDetPagAlquiler;
	public RegistroAlquiler() {
		super();
	}
	public Integer getCodRegistroAlquiler() {
		return codRegistroAlquiler;
	}
	public void setCodRegistroAlquiler(Integer codRegistroAlquiler) {
		this.codRegistroAlquiler = codRegistroAlquiler;
	}
	public Integer getCodHabitacion() {
		return codHabitacion;
	}
	public void setCodHabitacion(Integer codHabitacion) {
		this.codHabitacion = codHabitacion;
	}
	public Integer getCodCliente() {
		return codCliente;
	}
	public void setCodCliente(Integer codCliente) {
		this.codCliente = codCliente;
	}
	public Integer getCodDetPagAlquiler() {
		return codDetPagAlquiler;
	}
	public void setCodDetPagAlquiler(Integer coddetPagAlquiler) {
		this.codDetPagAlquiler = coddetPagAlquiler;
	}
	public Integer getCodEmpleado() {
		return codEmpleado;
	}
	public void setCodEmpleado(Integer codEmpleado) {
		this.codEmpleado = codEmpleado;
	}
	
}
