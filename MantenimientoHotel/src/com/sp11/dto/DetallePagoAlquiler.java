package com.sp11.dto;

public class DetallePagoAlquiler {
	private Integer codDetPagAlquiler;
	private float costTotalNetAlquiler;
	private float costBrutAlquiler;
	private float igvAlquiler;
	public Integer getCodDetPagAlquiler() {
		return codDetPagAlquiler;
	}
	public void setCodDetPagAlquiler(Integer codDetPagAlquiler) {
		this.codDetPagAlquiler = codDetPagAlquiler;
	}
	public float getCostTotalNetAlquiler() {
		return costTotalNetAlquiler;
	}
	public void setCostTotalNetAlquiler(float costTotalNetAlquiler) {
		this.costTotalNetAlquiler = costTotalNetAlquiler;
	}
	public float getCostBrutAlquiler() {
		return costBrutAlquiler;
	}
	public void setCostBrutAlquiler(float costBrutAlquiler) {
		this.costBrutAlquiler = costBrutAlquiler;
	}
	public float getIgvAlquiler() {
		return igvAlquiler;
	}
	public void setIgvAlquiler(float igvAlquiler) {
		this.igvAlquiler = igvAlquiler;
	}
	public DetallePagoAlquiler() {
		super();		
	}

}
