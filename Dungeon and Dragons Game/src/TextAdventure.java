import java.util.Scanner;
public class TextAdventure
	{
	static Scanner charClass = new Scanner(System.in);
	static String chClass;
	static String weapon = "Fists";
	static Scanner charGender = new Scanner(System.in);
	static String gender;
	static Scanner charAge = new Scanner(System.in);
	static int age;
	static Scanner charHeight = new Scanner(System.in);
	static int height;
	static Scanner charName = new Scanner(System.in);
	static String name;
	static Character hero = new Character (name, height, age, gender, weapon, chClass);
	static Monster opponent;
	public static void main(String[] args) 
		{
		MonsterArray.monsterMaker();
		buildAHero();
		} 
	public static void buildAHero() 
		{
		System.out.println("Hello and welcome to your adventure, lets start by creating your charecter!!");
		System.out.println("What is you cahrecters name?");
		name = charName.nextLine();
		System.out.println("What is you charecters height?");
		height = charHeight.nextInt();
		System.out.println("What is you charecters age?");
		age = charAge.nextInt();
		System.out.println("What is you charecters gender?");
		gender = charGender.nextLine();
		System.out.println("What is you charecters class? It may be Scout, Ranger, or Tank");
		chClass = charHeight.nextLine();
		hero = new Character (name, height, age, gender, weapon, chClass);
		
		}
	public static void adventureTime() 
		{
		int h = 0;
		int d = 0;
		int s = 0;
		if(chClass.equals("Scout") || chClass.equals("scout")) 
			{
			h = 30;
			d = 10;
			s = 20;
			}
		if(chClass == "Ranger" || chClass == "ranger" ) 
			{
			h = 45;
			d = 20;
			s = 15;
			}
		if(chClass == "Tank" || chClass == "tank" ) 
			{
			h = 60;
			d = 15;
			s = 8;
			}
		System.out.println("A " + hero.getIsBoy() + " wakes from there cobblstone bed..");
		System.out.println("There name is" + hero.getName());
		System.out.println("(INSTRUCTIONS) You will be presented with paths items, and choices, when doing so enter you choice in text to make the decision, make sure spelling correct!!!");
		System.out.println("To your right you hear the laughter of a tavern, behind you is an alley, infrot of you is the palace(enter things such as alley, palcae, or tavern");
		Scanner firstChoice = new Scanner(System.in);
		String one = firstChoice.nextLine();
		if(one.equals("palace") || one.equals("Palace"))
			{
			opponent = MonsterArray.monsterArray.get(0);
			System.out.println("Your aproached by" + opponent.get(name));
			} 
		
		
		
		}
	}
