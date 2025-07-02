package modelo;

import java.time.LocalDate;

public class Viaje {
private String medioYLinea;
private double precio;
private double descuento;
private LocalDate fecha;


public Viaje(String medioYLinea, double precio, double descuento, LocalDate fecha) {
	super();
	this.medioYLinea = medioYLinea;
	this.precio = precio;
	this.descuento = descuento;
	this.fecha = fecha;
}


public String getMedioYLinea() {
	return medioYLinea;
}


public void setMedioYLinea(String medioYLinea) {
	this.medioYLinea = medioYLinea;
}


public double getPrecio() {
	return precio;
}


public void setPrecio(double precio) {
	this.precio = precio;
}


public double getDescuento() {
	return descuento;
}


public void setDescuento(double descuento) {
	this.descuento = descuento;
}


public LocalDate getFecha() {
	return fecha;
}


public void setFecha(LocalDate fecha) {
	this.fecha = fecha;
}


@Override
public String toString() {
	return "\n Viaje [medioYLinea=" + medioYLinea + ", precio=" + precio + ", descuento=" + descuento + ", fecha=" + fecha
			+ "]";
}




}
