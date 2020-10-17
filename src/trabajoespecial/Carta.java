package trabajoespecial;

import java.util.ArrayList;

public class Carta {
	private String nombre;
	private ArrayList<Atributo> atributos;
	
	public Carta(String nombre) {
		this.nombre = nombre;
		this.atributos = new ArrayList<Atributo>();
	}

	public String getNombre() {
		return nombre;
	}

	public void addAtributo(Atributo a) {
		this.atributos.add(a);
	}
	
	public String elegirAtributo() {
		return this.atributos.get( (int) (Math.random()*(this.atributos.size()+1))).getNombre();
	}
	
	
}
