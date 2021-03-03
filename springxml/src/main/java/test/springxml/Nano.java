package test.springxml;

public class Nano implements Car {
	
	private int milage; //instance primitive variable
	private Engine engine; // instance Reference Variable
	
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}



	public void setMilage(int milage) {
		this.milage = milage;
	}

	public void start() {
		System.out.println("Nano Starting...with milage: "+milage+" with engine type ");
		engine.carEngine();

	}

}
