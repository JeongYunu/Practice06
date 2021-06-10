package com.javaex.ex02;

public class Shape {
	
	protected String fillColor;
	protected String lineColor;
	
	public Shape() {
		System.out.println("생성자 Shape(0) 실행");
	}
	
	public Shape (String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		System.out.println("생성자 Shape(2) 실행");
	}

}

