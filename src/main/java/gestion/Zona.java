package gestion;
import zooAnimales.*;
import java.util.List;

public class Zona {
	private String nombre;
	private List<Zoologico> zoo;
	private List<Animal> animales;
	
	public Zona() {}
	
	public Zona(String nombre, List<Zoologico> zoo, List<Animal> animales) {
		this.nombre = nombre;
		this.zoo = zoo;
		this.animales = animales;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Zoologico> getZoo() {
		return zoo;
	}

	public void setZoo(List<Zoologico> zoo) {
		this.zoo = zoo;
	}

	public List<Animal> getAnimales() {
		return animales;
	}

	public void setAnimales(List<Animal> animales) {
		this.animales = animales;
	}

	public void agregarAnimales(Animal animal) {
		animales.add(animal);
	}

	public int cantidadAnimales() {
		return animales.size();
	}
}
