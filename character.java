public abstract class character
{
	/* Current goal: MVP
	*  variables: character name, hp, strength state
	*  functions: recieve damage, deal damage(1 X str scaling)
	*/


	private String name;
	private int health;

	private int str;

	public String getName()
	{
		return name;
	}

	public int getHealth()
	{
		return health;
	}

	public int getStr()
	{
		return str;
	}

	//take damage
	public void hit(int damage)
	{
		health -= damage;

		if(health < 0)
			health = 0;

		//debug feedback
		System.out.println(name + "takes" + damage + "damage.");
	}

	public void healed(int heal)
	{
		health += heal;
		System.out.println(name + "is healed for" + heal + ".");
	}

	public int damage()
	{
		int damage = 1 * str;
		return damage;
	}
}
