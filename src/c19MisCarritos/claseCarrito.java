/*MODELA UNA CLASE QUE REPRESENTE A UN COCHE EN JAVA
 * 1.-MODELA UNA CLASE QUE REPRESENTE A UN COCHE EN JAVA
 * Atributos: marca, tipo y velocidad
 * Metodos: avanzar(n_kilometros), parar().... pueden haber más metodos.
 * Constructor: debe permitir inicializar todos los atributos.
 * 
 * 2.-Crea un programa que genere diversos coches y determine cual de ellos es el mas rapido en funcion de tiempo
 * que tarda en recorrer una distancia de 100 kilometros.
 * 
 * 3.- TIP: Para dividir dos enteros y generar un double:
 * 		int distancia, velocidad;
 * 		double tiempo =(double) distancia/(double)velocidad;
 */

//Clase Padre

package c19MisCarritos;

/*Hereda (Herencia) los metodos y atributos de la super clase 'Motor' 
 a la clase 'claseCarrito' y esta hereda si tiene clases hijos.
 */
public abstract class claseCarrito implements Motor{
	
	//ATRIBUTOS DE LA CLASE CARRITO
	String marca = "";
	String tipo = "";
	float velocidad = 0.0f;
	
//	Motor mMotor = new Motor(1.05f, 2,4); //Se crea el atributo tipo 'Motor' y se crea el objeto 'mMotor'.
	
	//METODOS DE LA CLASE CARRITO (Arrancar, Parar, Constructor)
	abstract void Arrancar(float n_kilometros); {	
//		System.out.println("Avanzaste " + n_kilometros + " Kilometros");
//		mMotor.start(); //Se llama la funcion start de la clase Motor
//		mMotor.move(); //Se llama la funcion move de la clase Motor
	
	}
	
	void Parar() {	
//		mMotor.stop(); //Se llama la funcion stop de la clase Motor
	}
	
	//CONSTRUCTOR
	public claseCarrito(String marca, String tipo, float velocidad) {
			this.marca = marca;
			this.tipo = tipo;
			this.velocidad = velocidad;
		}
	
	//Metodos
	
	public void start()
	{
		System.out.println("I'm Starting");
	}
	public void move()
	{
		System.out.println("I'm Moving");
	}
	public void stop()
	{
		System.out.println("I'm Stopped");
	}
}
