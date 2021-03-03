package test.springxml;

public class Alto implements Car {
	private int milage;
	Engine engine;
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}



	public void setMilage(int milage) {
		this.milage = milage;
	}



	public void start() {
		System.out.println("Alto Starting...with milage: "+milage+" with engine: ");
		engine.carEngine();

	}

}
