package trabajoespecial;

import java.util.ArrayList;

public class Mazo {
	private String nombre; 
	private ArrayList<Carta> mazo;
	
	public Mazo(String nombre) {
		this.nombre = nombre;
		this.mazo = new ArrayList<Carta>();
	}

	public String getNombre() {
		return nombre;
	} 
	
	public void addCartaAMazo(Carta c) {
		if(this.mazo==null) {
			this.mazo.add(c);
		}
		else {
			
		}
	}
	

}
