package test;
import java.time.LocalDate;

import modelo.Sistema;

public class TestSistemaRedTransporte {

	public static void main(String[] args) {
		
		
		Sistema sistema = new Sistema();
		
		System.out.println("\n Test 1");
		
		try {
			sistema.agregarUsuario(11111111, "Apellido 1", "Nombre 1");
			sistema.agregarUsuario(22222222, "Apellido 2", "Nombre 2");
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}

		System.out.println(sistema.getUsuarios());
		
		System.out.println("\n Test 2");
		
		try {
			sistema.agregarTarjeta("111222", sistema.traerUsuario(11111111));
			sistema.agregarTarjeta("333444", sistema.traerUsuario(22222222));
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		System.out.println(sistema.getTarjetas());
		
		System.out.println("\n Test 3");
		
		sistema.traerTarjeta("111222").agregarCarga(LocalDate.of(2024, 9, 23), 200);
		sistema.traerTarjeta("111222").agregarCarga(LocalDate.of(2024, 9, 30), 800);
		
		System.out.println(sistema.traerTarjeta("111222").getCargas());
		System.out.println("El saldo actual es ="+sistema.traerTarjeta("111222").getSaldoActual());
		
		System.out.println("\n Test 4");
		try {
			sistema.traerTarjeta("111222").agregarViaje("Colectivo 1", 100.0, LocalDate.of(2024, 10, 01));
			sistema.traerTarjeta("111222").agregarViaje("Colectivo 1", 100.0, LocalDate.of(2024, 10, 02));
			sistema.traerTarjeta("111222").agregarViaje("Colectivo 2", 200.0, LocalDate.of(2024, 10, 02));
			sistema.traerTarjeta("111222").agregarViaje("Colectivo 3", 100.0, LocalDate.of(2024, 10, 02));
			sistema.traerTarjeta("111222").agregarViaje("Colectivo 4", 150.0, LocalDate.of(2024, 10, 02));
			sistema.traerTarjeta("111222").agregarViaje("Colectivo 1", 100.0, LocalDate.of(2024, 10, 03));
			sistema.traerTarjeta("111222").agregarViaje("Colectivo 1", 100.0, LocalDate.of(2024, 10, 04));
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		System.out.println(sistema.traerTarjeta("111222").getViajes());
		System.out.println("El saldo actual es ="+sistema.traerTarjeta("111222").getSaldoActual());
		
		
		
	
		System.out.println("\n Test 5");
		try {
			sistema.traerTarjeta("111222").agregarViaje("Colectivo 1", 1000.0, LocalDate.of(2024, 10, 2));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		System.out.println("\n Test 6 ");
		System.out.println("Gasto total del dia 2-10-2024 ="+sistema.traerTarjeta("111222").calcularGastoTarjetaEnDia(LocalDate.of(2024, 10, 2)));
		
		
		
		System.out.println("\n Test 7");
		System.out.println(sistema.traerUsuariosSinSaldo());
		
		
		
		System.out.println("\n Test 8");
		try {
			sistema.agregarUsuario(22222222, "Apellido 2", "Nombre 2");
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		
	
		System.out.println("\n Test 9");
		
		try {
			sistema.agregarTarjeta("123", sistema.traerUsuario(22222222));
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}

	
	
}
