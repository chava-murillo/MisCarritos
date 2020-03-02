package c19MisCarritos;

//PROGRAMA  PRINCIPAL
public class CarritosApp {

	public static void main(String[] args) {
		//Se crean los objetos
		
		/*claseCarrito jaguar = new claseCarrito("Xf","Deportivo",300.00f);
		claseCarrito audi = new claseCarrito("R8","Deportivo",280.86f);
		claseCarrito vochito = new claseCarrito("VW","Familiar",310.00f);*/
		
		claseCarrito BMW = new Deportivos("M4","Sports",305.00f);
		claseCarrito Mazda = new Familiares("CX7","Family",150.00f);
		claseCarrito Jeep = new TodoTerreno("GrandCherokee","allTerrain",150.00f);
		
		//Se crea las variables del programa
		/*double tiempoJaguar = 0;
		double tiempoAudi = 0;
		double tiempoVochito = 0;*/
		
		double timeBMW = 0;
		double timeMazda = 0;
		double timeJeep = 0;
		
		
		//Funcion del programa
		try {
			
			/*tiempoJaguar = 100/(double)jaguar.velocidad;
			tiempoAudi = 100/(double)audi.velocidad;
			tiempoVochito = 100/(double)vochito.velocidad;*/
			
			timeBMW = 100/(double)BMW.velocidad;
			timeMazda = 100/(double)Mazda.velocidad;
			timeJeep = 100/(double)Jeep.velocidad;
			
		}catch(Exception ex) {
			System.out.println("You have an error: " + ex);
		}/*finally {
			System.out.println("Finally de mi Try");
		}*/
		
		if(timeBMW < timeMazda && timeBMW < timeJeep) {
			System.out.println("BMW Wins");
		}else if(timeMazda < timeBMW && timeMazda < timeJeep) {
			System.out.println("Mazda Wins");
		}else{
			System.out.println("Jeep Wins");
		}
		
		BMW.Arrancar(1.5f); //Se ingresa el valor para la funcion 'Arrancar'
	
		
		//int distancia, velocidad;
		//double tiempo =(double) distancia/(double)velocidad;
	}
}

