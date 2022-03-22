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
		int w = 0;
		for (Asiento e : asientos) {
			if (e != null) {
				++w;
			}
			
		}
		return w;
	}
	
	String verificarIntegridad() {
		if (registro != motor.registro) {
			return "Las piezas no son originales";
		}
		for (Asiento e : asientos) {
			if (e != null) {
				if (registro != e.registro) {
					return "Las piezas no son originales";
				}
			}
		}
		return "Auto original";
	}
}
