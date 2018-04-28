package com.sp11.dto;

public class Hotel {
	private Integer codHotel;
	private String nombreHotel;
	private String direccionHotel;
	private Integer telefono;
	private Integer ruc;
	
	public Hotel() {
		super();
	}
	public Integer getCodHotel() {
		return codHotel;
	}
	public void setCodHotel(Integer codHotel) {
		this.codHotel = codHotel;
	}
	public String getNombreHotel() {
		return nombreHotel;
	}
	public void setNombreHotel(String nombreHotel) {
		this.nombreHotel = nombreHotel;
	}
	public String getDireccionHotel() {
		return direccionHotel;
	}
	public void setDireccionHotel(String direccionHotel) {
		this.direccionHotel = direccionHotel;
	}
	public Integer getTelefono() {
		return telefono;
	}
	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}
	public Integer getRuc() {
		return ruc;
	}
	public void setRuc(Integer ruc) {
		this.ruc = ruc;
	}
	
}
