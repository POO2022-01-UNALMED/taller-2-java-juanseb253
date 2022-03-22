package test;

public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	void cambiarRegistro(int registro) {
		this.registro = registro;
	}
	void asignarTipo(String tipo) {
		if (tipo.equals("electrico")) {
			this.tipo = tipo;
		}
		else if (tipo.equals("gasolina")) {
			this.tipo = tipo;
		}
	}
}
