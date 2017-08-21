package AbstractFactory;

public class LandFactory extends AbstractWarriorFactory {

	@Override
	public Warrior createWarrior(String warriorType) {
		if (warriorType == "machine") {
			System.out.println("you get new Machine land warrior");
			return new MachineWarrior();
		}
		else {
			System.out.println("you get new Human land warrior");
			return new HumanWarrior();
		}
	}

	@Override
	public Building createBuilding(String buildingType) {
		if (buildingType == "electric") {
			System.out.println("you get Electrical land building");
			return new ElectricBuilding();
		}
		else {
			System.out.println("you get Harvest land building");
			return new HarvestBuilding();
		}
	}

}
