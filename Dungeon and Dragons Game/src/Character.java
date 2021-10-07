	
	public class Character
		{
		private String name;
		private double height;
		private int age;
		private String isBoy;
		private String classChoice;
		private String weapon;
		public Character(String n, double h, int a, String b, String w, String c) 
			{
			name = n;
			height = h;
			age = a;
			isBoy = b;
			weapon = w;
			classChoice = c;
			}
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}
		public double getHeight()
			{
				return height;
			}
		public void setHeight(double height)
			{
				this.height = height;
			}
		public int getAge()
			{
				return age;
			}
		public void setAge(int age)
			{
				this.age = age;
			}
		public String getIsBoy()
			{
				return isBoy;
			}
		public void setBoy(String isBoy)
			{
				this.isBoy = isBoy;
			}
		public String getWeapon()
			{
				return weapon;
			}
		public void setWeapon(String weapon)
			{
				this.weapon = weapon;
			}
		public String getClassChoice()
			{
				return classChoice;
			}
		public void setClassChoice(String weapon)
			{
				this.classChoice = classChoice;
			}
	}


