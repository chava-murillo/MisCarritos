package c19MisCarritos;

//Clase Hjia tomara los atributos y metodos de 'claseCarrito'
public class Deportivos extends claseCarrito{
	
	//Atributos Especiales TodoTerreno
	int horsePower = 550;
	
	//Constructor
	public Deportivos(String marca, String tipo, float velocidad) {
		super(marca, tipo, velocidad);
	}
	
	//Metodos Especiales TodoTerreno
	void Aceleration() {
		System.out.println("Estoy en Aceleracion...");
	}
	void Arrancar(float n_kilometros) {
		System.out.println("Avanzaste " + n_kilometros + " Kilometros Deportivos");
	}
}
