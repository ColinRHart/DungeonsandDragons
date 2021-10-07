
public class Monster
	{
		private String size;
		private String creature;
		private int health;
		private int damage;
		private double speed;
		public Monster(String s, String c, int h, int d, double sp) 
			{
			size = s;
			creature = c;
			health = h;
			damage = d;
			speed = sp; 
			}
		public String getSize()
			{
				return size;
			}
		public void setSize(String size)
			{
				this.size = size;
			}
		public String getCreature()
			{
				return creature;
			}
		public void setCreature(String creature)
			{
				this.creature = creature;
			}
		public int getHealth()
			{
				return health;
			}
		public void setHealth(int health)
			{
				this.health = health;
			}
		public int getDamage()
			{
				return damage;
			}
		public void setDamage(int damage)
			{
				this.damage = damage;
			}
		public double getSpeed()
			{
				return speed;
			}
		public void setSpeed(double speed)
			{
				this.speed = speed;
			}
	}
