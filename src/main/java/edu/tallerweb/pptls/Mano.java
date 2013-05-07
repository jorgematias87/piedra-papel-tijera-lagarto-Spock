package edu.tallerweb.pptls;

/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {

	/**
	 * Toda Mano debe crearse con una forma dada, que será
	 * la que determine su condición en el juego.
	 * @param forma, la Forma que adopta la Mano.
	 */
	private Forma forma;
	
	public Mano(final Forma forma) {
		this.forma=forma;
	}
	
	public void getMano(){
		System.out.println("Forma: " +this.forma.getValor());
	}
	
	public void imprimirReglas(final Mano otra){
		
		switch(this.forma){
		case PIEDRA: {
			if(forma.LAGARTO == otra.forma){
			System.out.println("Piedra aplasta lagarto");
		}
		
		else{
			System.out.println("Piedra aplasta tijera");
		}
		break;
		}
		
		case SPOCK:{ 
			if(forma.TIJERA == otra.forma){
			System.out.println("Spock destroza tijera");
		}
		
		else{
			System.out.println("Spock vaporiza piedra");
		}
		break;
		}
		
		case PAPEL:{ 
			if(forma.PIEDRA == otra.forma){
			System.out.println("Papel cubre piedra");
		}
		
		else{
			System.out.println("Papel refuta Spock");
		}
		break;
		}
		
		case LAGARTO: {
			if(forma.SPOCK == otra.forma){
			System.out.println("Lagarto envenena Spock");
		}
		
		else{
			System.out.println("Lagarto come papel");
		}
		break;
		}
		
		case TIJERA: {
			if(forma.PAPEL == otra.forma){
			System.out.println("Tijera corta papel");
		}
		
		else{
			System.out.println("Tijera decapita lagarto");
		}
		
			break;
		}
	}
	}
	
	/**
	 * Evaluará el resultado de la partida según las reglas
	 * del juego.
	 * @param otra, la otra Mano.
	 * @return un Resultado, de acuerdo al estado del juego.
	 */
	
	public Resultado jugarCon(final Mano otra) {
		
		switch (this.forma){
		case PIEDRA:{
			
			if(forma.LAGARTO == otra.forma || forma.TIJERA == otra.forma){
				return Resultado.GANA;
			}
			
			else
			{
				if(this.forma == otra.forma){
					return Resultado.EMPATA;
				}
				
				else{
					return Resultado.PIERDE;
				}
			}
			
		}
		
		case  PAPEL:{
			
			if(forma.PIEDRA == otra.forma || forma.SPOCK == otra.forma){
				return Resultado.GANA;
			}
			
			else{
				if(this.forma == otra.forma){
					return Resultado.EMPATA;
				}
				
				else{
					return Resultado.PIERDE;
				}
			}
		}
		
		case   TIJERA:{
			
			if(forma.PAPEL == otra.forma || forma.LAGARTO == otra.forma){
				return Resultado.GANA;
			}
			
			else{
				if(this.forma == otra.forma){
					return Resultado.EMPATA;
				}
				
				else{
					return Resultado.PIERDE;
				}
			}
		}
		
		case  LAGARTO:{
			
			if(forma.SPOCK == otra.forma || forma.PAPEL == otra.forma){
				return Resultado.GANA;
			}
			
			else{
				if(this.forma == otra.forma){
					return Resultado.EMPATA;
				}
				
				else{
					return Resultado.PIERDE;
				}
			}
		}
		
		case  SPOCK:{
			
			if(forma.TIJERA == otra.forma || forma.PIEDRA == otra.forma){
				return Resultado.GANA;
			}
			
			else{
				if(this.forma == otra.forma){
					return Resultado.EMPATA;
				}
				
				else{
					return Resultado.PIERDE;
				}
			}
		}
		
		
		}
		return null;
	}

}
