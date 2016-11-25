package fcu.iecs.oop.pokemon;

public class GYM {
	public static void fight(Pokemon p1, Pokemon p2)
	{
		int a,cp;
		a=(int)(Math.random()*10);
		System.out.println(a);
		if(a%2==0)
		{
			System.out.println("Winner is "+p1.getName());
			cp=p1.getCp();
			cp+=500;
			p1.setCp(cp);
			System.out.println("cp="+p1.getCp());
		}
		else
		{
			System.out.println("Winner is "+p2.getName());
			cp=p2.getCp();
			cp+=500;
			p2.setCp(cp);
			System.out.println("cp="+p2.getCp());
		}
	}
}
