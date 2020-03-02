package c19MisCarritos;


//Clase Abuelo
public interface Motor {
	
	//Atributos Especiales Motor
	static float fIntake = 1.0f;
	static int iPiston = 8;
	static int cylinder = 4;
	

	
	
	//Metodos
	
	void start();
//	{
//		System.out.println("I'm Starting");
//	}
	void move();
//	{
//		System.out.println("I'm Moving");
//	}
	void stop();
//	{
//		System.out.println("I'm Stopped");
//	}
	
	//CONSTRUCTOR
//		public Motor(float fIntake ,int iPiston ,int cylinder) {
//				this.fIntake = fIntake;
//				this.iPiston = iPiston;
//				this.cylinder = cylinder;
//			}
	

}
