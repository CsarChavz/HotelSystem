package com.sp11.dto;

public class Habitacion {
	private Integer codHabitacion;
	private Integer codHotel;	
	private String tipoHabitacion;
	private String costoHabitacion;	
	private Integer piso;
	public Habitacion() {
		super();
	}
	public Integer getCodHabitacion() {
		return codHabitacion;
	}
	public void setCodHabitacion(Integer codHabitacion) {
		this.codHabitacion = codHabitacion;
	}
	public String getTipoHabitacion() {
		return tipoHabitacion;
	}
	public void setTipoHabitacion(String tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}
	public String getCostoHabitacion() {
		return costoHabitacion;
	}
	public void setCostoHabitacion(String costoHabitacion) {
		this.costoHabitacion = costoHabitacion;
	}
	public Integer getPiso() {
		return piso;
	}
	public void setPiso(Integer piso) {
		this.piso = piso;
	}
	public Integer getCodHotel() {
		return codHotel;
	}
	public void setCodHotel(Integer codHotel) {
		this.codHotel = codHotel;
	}
	
}
