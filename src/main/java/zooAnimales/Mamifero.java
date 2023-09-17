package zooAnimales;
import gestion.*;
import java.util.List;

import gestion.Zona;

public class Mamifero extends Animal{
	private static List<Mamifero> listado = new java.util.ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;

	public Mamifero() {
		super();
		listado.add(this);
		
	}

	public Mamifero(String nombre, int edad, String habitat, String genero, List<Zona> zona, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero, zona);
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
	}

	public List<Mamifero> getListado() {
		return listado;
	}

	public int getCaballos() {
		return caballos;
	}

	public int getLeones() {
		return leones;
	}

	public boolean getPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public static int cantidadMamiferos() {
		return listado.size();
	}

	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		Mamifero caballo = new Mamifero(nombre, edad, "pradera", genero, null, true, 4);
		caballos++;
		return caballo;
	}

	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		Mamifero leon = new Mamifero(nombre, edad, "selva", genero, null, true, 4);
		leones++;
		return leon;
	}

	
}
