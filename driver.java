//combat test
public class driver
{
	public static void main(String[] args)
	{
		//initialize PC
		pc player = new pc();
		System.out.println(player.getName());

		enemy enemy = new enemy();
		System.out.println(enemy.getName());

		player.takeHit(enemy.dealDamage());
		enemy.takeHit(player.dealDamage());
		
		
	}
}
