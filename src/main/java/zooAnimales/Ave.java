package zooAnimales;
import gestion.*;
import java.util.List;

public class Ave extends Animal{
	private static List<Ave> listado = new java.util.ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;

	public Ave(){
		super();
		listado.add(this);
	}

	public Ave(String nombre, int edad, String habitat, String genero, List<Zona> zona, String colorPlumas){
		super(nombre, edad, habitat, genero, zona);
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}

	public List<Ave> getListado(){
		return listado;
	}

	public int getHalcones(){
		return halcones;
	}

	public int getAguilas(){
		return aguilas;
	}

	public String getColorPlumas(){
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas){
		this.colorPlumas = colorPlumas;
	}

	@Override
	public String movimiento(){
		return "volar";
	}

	public static int cantidadAves(){
		return listado.size();
	}

	public static Ave crearHalcon(String nombre, int edad, String genero){
		Ave halcon = new Ave(nombre, edad, "montanas", genero, null, "cafe glorioso");
		halcones++;
		return halcon;
	}

	public static Ave crearAguila(String nombre, int edad, String genero){
		Ave aguila = new Ave(nombre, edad, "montanas", genero, null, "blanco y amarillo");
		aguilas++;
		return aguila;
	}
}
