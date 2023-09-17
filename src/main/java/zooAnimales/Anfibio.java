package zooAnimales;
import gestion.*;
import java.util.List;

public class Anfibio extends Animal {
	private static List<Anfibio> listado = new java.util.ArrayList<Anfibio>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;

	public Anfibio() {
		super();
		listado.add(this);
	}

	public Anfibio(String nombre, int edad, String habitat, String genero, List<Zona> zona, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero, zona);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
	}

	public List<Anfibio> getListado() {
		return listado;
	}

	public int getRanas() {
		return ranas;
	}

	public int getSalamandras() {
		return salamandras;
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean getVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}

	@Override
	public String movimiento() {
		return "saltar";
	}

	public static int cantidadAnfibios() {
		return listado.size();
	}

	public static Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio rana = new Anfibio(nombre, edad, "selva", genero, null, "rojo", true);
		ranas++;
		return rana;
	}

	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, null, "negro y amarillo", false);
		salamandras++;
		return salamandra;
	}
}
