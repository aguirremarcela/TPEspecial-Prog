package trabajoespecial;

import java.util.ArrayList;

public class Jugador {
	private String nombre;
	private ArrayList<Carta> mazoaux;
	
	public Jugador(String nombre) {
		this.nombre = nombre;
		this.mazoaux = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}
	
	public void addCarta(Carta c) {
		this.mazoaux.add(c);
	}
	
	public String elegirAtributo() {
		return this.mazoaux.get(0).elegirAtributo();
	}
	

	
	
	
	

}
