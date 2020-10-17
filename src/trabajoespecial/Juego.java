package trabajoespecial;

import java.util.ArrayList;

public class Juego {
	private int rondasmax;
	private ArrayList<Mazo> mazos; 
	
	public Juego(int rondasmax) {
		this.rondasmax = rondasmax;
		this.mazos = new ArrayList<Mazo>();
	}
	
	public void addMazo(Mazo m) {
		this.mazos.add(m); 
	}
	
	public Jugador comenzarJuego(Jugador j1, Jugador j2) {
		repartirCartas(j1, j2);
		boolean ganador = false;
		int i = 0; 
		
		while(ganador == false || i <= rondasmax) {
			Jugador x = j1;
			Jugador y = j2; 
			
			x.elegirAtributo();
			if(x.valorDelAtributo() < y.valorDelAtributo() ) {
				x = y;
				y = x;
			} else if (x.valorDelAtributo() == y.valorDelAtributo()) {
				removerCartas(j1, j2); 
			}
			
		}
		
	}

}
