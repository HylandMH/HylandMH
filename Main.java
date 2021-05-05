package starwars;

public class Main {

	public static void main(String[] args) {
		
		
		
		//Making an array to set up the warriors
		WarriorFred[] warriors = new WarriorFred[5];
		for(int x=0; x<5; x++) {
		     warriors[x] = new WarriorFred();
		}

		//Setting the warriors names
		warriors[0].setNickName("Archer");
		warriors[1].setNickName("Mage");
		warriors[2].setNickName("Healer");
		warriors[3].setNickName("Tank");
		warriors[4].setNickName("Rouge");
		
		//Gives each warrior a random age between 1 - 99
		warriors[0].setAge((int) (1 * Math.random() * 99));
		warriors[1].setAge((int) (1 * Math.random() * 99));
		warriors[2].setAge((int) (1 * Math.random() * 99));
		warriors[3].setAge((int) (1 * Math.random() * 99));
		warriors[4].setAge((int) (1 * Math.random() * 99));
		
		//Printing info of the warriors through printInfo()
		for (int i = 0; i < 5; i++)
		warriors[i].printInfo();
		
		System.out.println("------------------------------");
		System.out.println();
		
		//Each warrior gets a random amount of damage and prints that information and reaction
		 
		for (int i = 0; i < 5; i++) {
		
		System.out.println(warriors[i].getNickName() + " took damage!");
		int after = (int) (1 *Math.random() * 13);
			
		warriors[i].takeDamage(after);
		
		System.out.println(after + " points of damage!");
				
		warriors[i].reaction();
		System.out.println();
		
		}
		System.out.println("------------------------------");
		System.out.println();
		
		//Final print of information
		for (int i = 0; i < 5; i++)
			warriors[i].printInfo();
	}
}
