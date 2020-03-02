package c19MisCarritos;

//Clase Hjia tomara los atributos y metodos de 'claseCarrito'
public class TodoTerreno extends claseCarrito {

	//Atributos Especiales TodoTerreno
	String traction = "Total";
	
	//Constructor
	public TodoTerreno(String marca, String tipo, float velocidad) {
		super(marca, tipo, velocidad);
	}
	
	//Metodos Especiales TodoTerreno
	void offRoad() {
		System.out.println("Traction activated in offRoad...");
	}
	void Arrancar(float n_kilometros) {
		System.out.println("Avanzaste " + n_kilometros + " Kilometros TodoTerreno");
	}

}
