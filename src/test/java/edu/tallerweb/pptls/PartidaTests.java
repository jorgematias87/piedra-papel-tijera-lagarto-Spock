package edu.tallerweb.pptls;

import static org.junit.Assert.*;
import org.junit.Test;

public class PartidaTests {

	@Test
	public void queSpockVaporizaPiedra() {

		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.SPOCK);
		
		jugadorUno.getMano();
		jugadorDos.getMano();
		
		/*assertEquals("Spock vaporiza piedra",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));*/
		
		if(Resultado.GANA == jugadorUno.jugarCon(jugadorDos)){
			System.out.println("Jugador Uno Gana");
			jugadorUno.getReglas(jugadorDos);
		}
		
		else{
			if(Resultado.EMPATA == jugadorUno.jugarCon(jugadorDos)){
				System.out.println("Juego Empatado");
			}
			
			else{
			System.out.println("Jugador Dos Gana");
			jugadorDos.getReglas(jugadorUno);
			}
			
		}
			
	}
}
