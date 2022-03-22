package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos() {
		return asientos.length;
	}
	
	String verificarIntegridad() {
		if (registro != motor.registro) {
			return "Las piezas no son originales";
		}
		for (Asiento e : asientos) {
			if (registro != e.registro) {
				return "Las piezas no son originales";
			}
		}
		return "Auto original";
	}
}
