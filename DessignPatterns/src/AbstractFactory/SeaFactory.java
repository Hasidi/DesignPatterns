package AbstractFactory;

public class SeaFactory extends AbstractWarriorFactory {

	@Override
	public Warrior createWarrior(String warriorType) {
		if (warriorType == "machine") {
			System.out.println("you get new Machine sea warrior");
			return new MachineWarrior();
		}
		else {
			System.out.println("you get new Human sea warrior");
			return new HumanWarrior();
		}
	}

	@Override
	public Building createBuilding(String buildingType) {
		if (buildingType == "electric") {
			System.out.println("you get Electrical sea building");
			return new ElectricBuilding();
		}
		else {
			System.out.println("cant build Harvest building in the sea");
			return null;
		}
	}

}
