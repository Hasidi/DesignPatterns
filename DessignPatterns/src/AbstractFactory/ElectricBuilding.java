package AbstractFactory;

public class ElectricBuilding extends Building {

	@Override
	public void produce() {
		System.out.println("Electric Building produce 10 energy per hour");
		
	}

}
