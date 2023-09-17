package zooAnimales;
import gestion.*;
import java.util.List;

public class Reptil extends Animal{
	private static List<Reptil> listado = new java.util.ArrayList<Reptil>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;

	public Reptil() {
		super();
		listado.add(this);
	}

	public Reptil(String nombre, int edad, String habitat, String genero, List<Zona> zona, String colorEscamas, int largoCola){
		super(nombre, edad, habitat, genero, zona);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
	}

	public List<Reptil> getListado(){
		return listado;
	}

	public int getIguanas(){
		return iguanas;
	}

	public int getSerpientes(){
		return serpientes;
	}

	public String getColorEscamas(){
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas){
		this.colorEscamas = colorEscamas;
	}

	public int getLargoCola(){
		return largoCola;
	}

	public void setLargoCola(int largoCola){
		this.largoCola = largoCola;
	}

	@Override
	public String movimiento(){
		return "reptar";
	}

	public static int cantidadReptiles(){
		return listado.size();
	}

	public static Reptil crearIguana(String nombre, int edad, String genero){
		Reptil iguana = new Reptil(nombre, edad, "humedal", genero, null, "verde", 3);
		iguanas++;
		return iguana;
	}

	public static Reptil crearSerpiente(String nombre, int edad, String genero){
		Reptil serpiente = new Reptil(nombre, edad, "jungla", genero, null, "blanco", 1);
		serpientes++;
		return serpiente;
	}
}

