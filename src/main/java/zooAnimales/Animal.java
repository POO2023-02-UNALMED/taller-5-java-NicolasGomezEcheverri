package zooAnimales;
import gestion.*;
import java.util.List;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private List<Zona> zona;
	
	public Animal() {
		totalAnimales++;
	}
	
	public Animal(String nombre, int edad, String habitat, String genero, List<Zona> zona) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
		totalAnimales++;
	}

	public int getTotalAnimales() {
		return totalAnimales;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad(){
		return edad;
	}

	public void setEdad(int edad){
		this.edad = edad;
	}

	public String getHabitat(){
		return habitat;
	}

	public void setHabitat(String habitat){
		this.habitat = habitat;
	}

	public String getGenero(){
		return genero;
	}

	public void setGenero(String genero){
		this.genero = genero;
	}

	public List<Zona> getZona(){
		return zona;
	}

	public void totalPorTipo() {
		System.out.println("Mamiferos: " + Mamifero.cantidadMamiferos());
		System.out.println("Aves: " + Ave.cantidadAves());
		System.out.println("Reptiles: " + Reptil.cantidadReptiles());
		System.out.println("Peces: " + Pez.cantidadPeces());
		System.out.println("Anfibios: " + Anfibio.cantidadAnfibios());
	}

	public String toString() {
        if (zona != null && zona.size() > 0) {
            return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero + ", la zona en la que me ubico es " + zona.get(0).getNombre() + ", en el " + zona.get(0).getZoo().get(0).getNombre();
        } else {
            return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero;
        }
    }

	public String movimiento(){
		return "desplazarse";
		}
	}