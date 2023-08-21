package implementacion_interfaces;

public class Producto {
private String nombre;
private Double costo;
private Integer cantidad;
private String orden;
public Producto(String nombre, Double costo, Integer cantidad, String orden) {
	super();
	this.nombre = nombre;
	this.costo = costo;
	this.cantidad = cantidad;
	this.orden = orden;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Double getCosto() {
	return costo;
}
public void setCosto(Double costo) {
	this.costo = costo;
}
public Integer getCantidad() {
	return cantidad;
}
public void setCantidad(Integer cantidad) {
	this.cantidad = cantidad;
}
public String getOrden() {
	return orden;
}
public void setOrden(String orden) {
	this.orden = orden;
}
@Override
public String toString() {
	return "Producto [nombre=" + nombre + ", costo=" + costo + ", cantidad=" + cantidad + ", orden=" + orden + "]";
}

}
