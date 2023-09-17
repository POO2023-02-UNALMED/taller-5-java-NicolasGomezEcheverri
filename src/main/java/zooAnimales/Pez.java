package zooAnimales;
import gestion.*;
import java.util.List;

public class Pez extends Animal{
	private static List<Pez> listado;
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;

	public Pez() {
		super();
		listado.add(this);
	}

	public Pez(String nombre, int edad, String habitat, String genero, List<Zona> zona, String colorEscamas, int cantidadAletas){
		super(nombre, edad, habitat, genero, zona);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
	}

	public List<Pez> getListado(){
		return listado;
	}

	public int getSalmones(){
		return salmones;
	}

	public int getBacalaos(){
		return bacalaos;
	}

	public String getColorEscamas(){
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas){
		this.colorEscamas = colorEscamas;
	}

	public int getCantidadAletas(){
		return cantidadAletas;
	}

	public void setCantidadAletas(int cantidadAletas){
		this.cantidadAletas = cantidadAletas;
	}

	@Override
	public String movimiento(){
		return "nadar";
	}

	public static int cantidadPeces(){
		return listado.size();
	}

	public static Pez crearSalmon(String nombre, int edad, String genero){
		Pez salmon = new Pez(nombre, edad, "oceano", genero, null, "rojo", 6);
		salmones++;
		return salmon;
	}

	public static Pez crearBacalao(String nombre, int edad, String genero){
		Pez bacalao = new Pez(nombre, edad, "oceano", genero, null, "gris", 6);
		bacalaos++;
		return bacalao;
	}
}
