package com.laura;
public class Juego {
	private String nombre;
	private int vidas;
	private long duracion;
	private long inicioJuego;
	private long fechaFin;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getVidas() {
		return vidas;
	}
	public void setVidas(int vidas) {
		this.vidas = vidas;
	}
	public long getDuracion() {
		return duracion;
	}
	public void setDuracion(long duracion) {
		this.duracion = duracion;
	}
	public Juego(String nombre, int vidas, long duracion) {
		super();
		this.nombre = nombre;
		this.vidas = vidas;
		this.duracion = duracion;
		this.inicioJuego = System.currentTimeMillis();
	}

	public void finJuego () {
		this.fechaFin = System.currentTimeMillis();
	}
	
	public boolean isTimeout () {
		return (fechaFin - inicioJuego) > duracion*1000;
		
		 
	}
	
}
