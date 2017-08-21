package AbstractFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractWarriorFactory landFactory = new LandFactory();
		AbstractWarriorFactory seaFactory = new SeaFactory();
		
		Building landHarvest = landFactory.createBuilding("harvest");
		Building seaHarvest = seaFactory.createBuilding("harvest");
		System.out.println("-----------------------------------------------------------------------------");
		Warrior landHuman = landFactory.createWarrior("human");
		Warrior seaHuman = seaFactory.createWarrior("human");
		landHuman.fight();
		seaHuman.fight();
		System.out.println("-----------------------------------------------------------------------------");
		Warrior landMachine= landFactory.createWarrior("machine");
		Warrior seaMachine = seaFactory.createWarrior("machine");
		landMachine.fight();
		seaMachine.fight();
	}

}
