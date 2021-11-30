package com.javaex.ex03;

public class Shape {
	
	protected String lineColor;
	protected String fillColor;
	
	public Shape() {}
	
	public Shape(String lineColor, String fillColor) {
		this.lineColor = lineColor;
		this.fillColor = fillColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}


}

