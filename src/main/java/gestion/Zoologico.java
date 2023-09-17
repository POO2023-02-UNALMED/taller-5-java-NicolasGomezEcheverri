package gestion;
import java.util.List;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private List<Zona> zonas;
	
	public Zoologico() {}
	
	public Zoologico(String nombre, String ubicacion, List<Zona> zonas) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.zonas = zonas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public List<Zona> getZonas() {
		return zonas;
	}

	public void setZonas(List<Zona> zonas) {
		this.zonas = zonas;
	}

	public int cantidadTotalAnimales() {
		int cntTotalAnimales = 0;
		for (Zona zona_i : zonas){
			if (zona_i != null){
				cntTotalAnimales += zona_i.getAnimales().size();
			}
		}
		return cntTotalAnimales;
	}

	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}
}