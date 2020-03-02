package c19MisCarritos;

//Clase Hjia tomara los atributos y metodos de 'claseCarrito'
public class Familiares extends claseCarrito {
	
	//Atributos Especiales Familiares
	int numAsientos = 8;
	
	//Constructor
	public Familiares(String marca, String tipo, float velocidad) {
		super(marca, tipo, velocidad);
	}
	
	//Metodos Especiales Familiares
	void toPickUpKids() {
		System.out.println("toPickUpKids...");
	}
	
	void Arrancar(float n_kilometros) {
		System.out.println("Avanzaste " + n_kilometros + " Kilometros Familiares");
	}
}
