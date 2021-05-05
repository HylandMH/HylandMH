package starwars;
import java.util.Random;
//Makes each warrior object
public class WarriorFred {


	private String NickName;
	private int lifeForce = 10;
	private int Age;
	private int damage = 0;
	
	String[] armory = {"Exploding Pumpkin", "Candy Corn", "Paper Bag"};
	
	
	//Gives each warrior 10 points of health
	public void reSpawn() {
		lifeForce = 10;
	}
	
	//Based off of after varible numberical value. LifeForce is taken away.
	public void takeDamage(int n) {
		damage += n;
		lifeForce = lifeForce - damage;
		damage = 0;
	}
	
	public void reaction() {
		Random r = new Random();
		String[] sound = {"OW!", "Wham!", "POW!", "Boffo!!", "KaPow!", "That one hurt!"};
		System.out.println(sound[r.nextInt(sound.length)]);
	}

	//Sets and gives each warrior an age
	public int getAge() {
		return Age;
	}
	public void setAge(int Age){
		this.Age = Age;
	}

	//Gives each warrior a nick name
	public String getNickName() {
		return NickName;
	}

	public void setNickName(String nickName) {
		NickName = nickName;
	}
	
	//When this object is called from main. From that specific warrior their information is all printed out.
	public void printInfo() {
		System.out.println( NickName);
		System.out.println("age is " + Age);
		if (lifeForce <= 0) {
		System.out.println(NickName + " is dead");
		}
		else
			System.out.println(NickName + " is alive");
		System.out.println();
			
	}
}