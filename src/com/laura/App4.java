package com.laura;
public class App4 {
	public static void main(String[] args) {
		//Instanciar el Objeto
		Juego primerJugador = new Juego("Juan", 5, 63);
		//Mostrar por pantalla numero de vidas
		System.out.println("Vidas de Juan: " + primerJugador.getVidas());
		//Restarle una vida
		primerJugador.setVidas(primerJugador.getVidas()-1);
		System.out.println("Vidas de Juan: " + primerJugador.getVidas());
		//Crear a Marta
		Juego segundoJugador = new Juego("Marta", 5, 53);
		//Mostras vidas
		System.out.println("Vidas de Juan: " + primerJugador.getVidas());
		System.out.println("Vidas de Marta: " + segundoJugador.getVidas());
		//Fin juego	
		primerJugador.finJuego();
		if (primerJugador.isTimeout()) {
			System.out.println("Se ha pasado del tiempo máximo");
		}else {
			System.out.println("No se ha pasado del tiempo");
		}
		
	}

}
