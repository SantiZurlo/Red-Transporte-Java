package modelo;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

public class Tarjeta {
private String codigo;
private Usuario usuario;
private List<Viaje> viajes;
private List<Carga> cargas;
private double saldoActual;


public Tarjeta(String codigo, Usuario usuario, double saldoActual) throws Exception {
	super();
	setCodigo(codigo);
	this.usuario = usuario;
	this.viajes = new ArrayList<Viaje>();
	this.cargas = new ArrayList<Carga>();
	this.saldoActual = saldoActual;
}


public String getCodigo() {
	return codigo;
}


public void setCodigo(String codigo) throws Exception{
	if(!this.validarCodigo(codigo)) {
		throw new Exception("ERROR: El codigo no puede tener menos de 6 digitos");
	}
	this.codigo = codigo;
}


public Usuario getUsuario() {
	return usuario;
}


public void setUsuario(Usuario usuario) {
	this.usuario = usuario;
}


public List<Viaje> getViajes() {
	return viajes;
}


public void setViajes(List<Viaje> viajes) {
	this.viajes = viajes;
}


public List<Carga> getCargas() {
	return cargas;
}


public void setCargas(List<Carga> cargas) {
	this.cargas = cargas;
}


public double getSaldoActual() {
	return saldoActual;
}


public void setSaldoActual(double saldoActual) {
	this.saldoActual = saldoActual;
}


@Override
public String toString() {
	return "\n Tarjeta [codigo=" + codigo + ", usuario=" + usuario + ", viajes=" + viajes + ", cargas=" + cargas
			+ ", saldoActual=" + saldoActual + "]";
}

private boolean validarCodigo(String codigo) {
	boolean p=true;
	if(codigo.length() < 6) {
		p=false;
	}
	
	return p;
}

public boolean agregarCarga(LocalDate fecha,double valor) {
	setSaldoActual(getSaldoActual()+valor);
	
	Carga car = new Carga(fecha,valor);
	return cargas.add(car);
}

public List<Viaje> traerViajes(LocalDate fecha) {
	List<Viaje> viajesEnFecha = new ArrayList<>(); 
	
	for(Viaje viaje : viajes) {
		if(viaje.getFecha().isEqual(fecha)) {
			viajesEnFecha.add(viaje);
		}
	
	}
	
	return viajesEnFecha;
}


public void agregarViaje(String medioYLinea , double precio, LocalDate fecha) throws Exception{
	
	List<Viaje> cantViajes = traerViajes(fecha);
	double descuento=0;
	
	if(cantViajes.size()  == 2) {
		
		descuento=precio*0.50;
	}
	
	if(cantViajes.size() == 1) {
		descuento=precio*0.25;
		
	}
	
	if(precio > this.saldoActual) {
		throw new Exception("ERROR: El saldo es insuficiente");
		
	}
	
	Viaje via = new Viaje(medioYLinea,precio,descuento,fecha);
	
	viajes.add(via);
	
	setSaldoActual(getSaldoActual()-(precio-descuento));

}

public double calcularGastoTarjetaEnDia(LocalDate fecha) {
	
	List<Viaje> cantViajes = traerViajes(fecha);
	
	double total =0;
	
	for(Viaje viaje : cantViajes) {
		total=total+viaje.getPrecio();
	}
return total;
}




}