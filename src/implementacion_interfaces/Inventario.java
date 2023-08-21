package implementacion_interfaces;
import java.util.*;
public class Inventario {
//se debe realizar la importacion de arriba 
	private ArrayList<Producto> inventario;

	public ArrayList<Producto> getInventario() {
		return inventario;
	}

	public void setInventario(ArrayList<Producto> inventario) {
		this.inventario = inventario;
	}

	@Override
	public String toString() {
		return "Inventario [inventario=" + inventario + "]";
	}

	public Inventario(ArrayList<Producto> inventario) {
		super();
		this.inventario = inventario;
	}

}
