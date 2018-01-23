public abstract class character
{
	/* Current goal: MVP
	*  variables: character name, hp, strength state
	*  functions: recieve damage, deal damage(1 X str scaling)
	*/


	private String name;
	private int health;

	private int str;


	//set/get NAME
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}


	//set/get HEALTH
	public int getHealth()
	{
		return health;
	}

	public void setHealth(int health)
	{
		this.health = health;
	}

	//set/get STR
	public int getStr()
	{
		return str;
	}

	public void setStr(int str)
	{
		this.str = str;
	}

	//take damage
	public void takeHit(int damage)
	{
		health -= damage;

		if(health < 0)
			health = 0;

		//debug feedback
		System.out.println(name + " takes " + damage + " damage.");
		System.out.println(name + " current health: " + health + ".");
	}

	public void healed(int heal)
	{
		health += heal;
		System.out.println(name + " is healed for " + heal + ".");
	}

	//deal damage
	public int dealDamage()
	{
		int damage = 1 * str;
		System.out.println(name + " deals " + damage + " damage.");
		return damage;
	}
}
