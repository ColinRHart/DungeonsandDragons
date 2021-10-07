import java.util.ArrayList;

public class MonsterArray
	{
	static ArrayList <Monster> monsterArray = new ArrayList <Monster>();

		
		public static void monsterMaker() 
			{
			monsterArray.add(new Monster("large man", "Guard", 20, 8, 3));
			monsterArray.add(new Monster("Small", "Thrall", 5, 2, 1));
			monsterArray.add(new Monster("Tall", "Ork", 8, 3, 1));
			monsterArray.add(new Monster("Huge", "Troll", 20, 10, 0.25)); 
			monsterArray.add(new Monster("Tiny", "Wyvern Hatchling", 4, 3, 20));
			monsterArray.add(new Monster("Large sleek", "Wyvern", 30, 12, 4)); 
			monsterArray.add(new Monster("Large beast", "Drake", 18, 8, 15)); 
			monsterArray.add(new Monster("Monsterous", "Dragon", 80, 20, 4));
			monsterArray.add(new Monster("Large", "Phoenix", 25, 10, 50)); 
			monsterArray.add(new Monster("Small", "Skeleton", 2, 4, 1)); 
			monsterArray.add(new Monster("Average", "Bandit", 6, 3, 2)); 
			monsterArray.add(new Monster("Small", "Sprite", 1, 1, 50)); 
			monsterArray.add(new Monster("medium", "Spirit", 10, 2, 20)); 
			monsterArray.add(new Monster("Mountainous", "Golem", 120, 40, .1)); 
			monsterArray.add(new Monster("Monstourous", "Gold Dragon", 200, 30, 10)); 
			}
		
		
		
		
	}
