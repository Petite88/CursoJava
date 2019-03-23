package com.laura;

public class Limites {
	private int minimo, maximo,acierto;

	public Limites(int minimo, int maximo, int acierto) {
		this.minimo = minimo;
		this.maximo = maximo;
		this.acierto = acierto;
	}

	public int getMinimo() {
		return minimo;
	}

	public void setMinimo(int minimo) {
		this.minimo = minimo;
	}

	public int getMaximo() {
		return maximo;
	}

	public void setMaximo(int maximo) {
		this.maximo = maximo;
	}

	public int getAcierto() {
		return acierto;
	}

	public void setAcierto(int acierto) {
		this.acierto = acierto;
	}
	
	
}
