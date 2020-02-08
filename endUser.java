package rama;

import java.util.Scanner;
//import java.lang.*;

class dragon{
	
	Scanner key = new Scanner(System.in);
	private int rider;
	private int rem;
	private int dif;
	//private int rem1;
	boolean ch1;
	//System.out.println("Enter the choice");
	 void send()
	{
		System.out.println("Enter 1)courier and 2)Travel");
		
		int choice =Integer.parseInt( key.nextLine());
		switch(choice)
		{
		case 1:
			blue_dragon obj1 = new blue_dragon();
			obj1.send();
		case 2:
			System.out.println("Enter the total number of travelers");
			rider = Integer.parseInt(key.nextLine());
			rem =rider / 6;
			dif =   rider - 6*rem;
			if(rem >= 1) {
				pink_dragon obj2 = new pink_dragon();
				obj2.send(rem);
			}
			if(dif >= 1)
			{
				rainbow_dragon obj3 = new rainbow_dragon();
				obj3.send(dif);
			}
			
			
		}
	
	}
	
	boolean fly()
	{
		System.out.println("Enter the whether you want use aerial transpotation with true or By a false");
		ch1 = key.nextBoolean();
		return ch1;
	}
	
	
	
	
	
}


class blue_dragon extends dragon{
	private String Source;
	private String  dest;
	private int dist;
	Scanner obj = new Scanner(System.in);
	void send() {
		System.out.println("Enter the source\n");
		Source = obj.nextLine();
		System.out.println("Enter the destination\n");
		dest = obj.nextLine();
		System.out.println("Enter the distance of travel approx\n");
		dist = obj.nextInt();
		if(super.fly() && dist>=20)
		{
			System.out.println("The courier has reached : " + dest +" From " + Source + " Through airways by blue dragon");
		}
		else if(super.fly() && dist>50)
		{
			System.out.println("You have chosen something that is not compatable plz restart the program make sure that you choose airways if the dist is greater than 50kms");
			
		}
		else if(!super.fly())
		{
			System.out.println("The courier has reached : " + dest +" From " + Source + " Through landways by blue dragon");
		}
		
	}
	
}

class pink_dragon extends dragon{
	 String Source;
	 String  dest;
	//private int dist;
	Scanner obj = new Scanner(System.in);
	void send(int ri) {
		System.out.println("Enter the source\n");
		Source = obj.nextLine();
		System.out.println("Enter the destination\n");
		dest = obj.nextLine();
		//System.out.println("Enter the distance of travel approx\n");
		//dist = obj.nextInt();
		System.out.println( "With "+ ri + " dragons Travellers has travelled  from  " + Source +" to " + dest +" through lankways and using pink dragon.");
		
	}
	
}
class rainbow_dragon extends dragon{
	//private String Source;
	//private String  dest;
	//private int dist;
	//Scanner obj = new Scanner(System.in);
	pink_dragon o = new pink_dragon();
	void send(int ri) {
		//System.out.println("Enter the source\n");
		//Source = obj.nextLine();
		//System.out.println("Enter the destination\n");
		//dest = obj.nextLine();
		//System.out.println("Enter the distance of travel approx\n");
		//dist = obj.nextInt();
		System.out.println("Plz Enter whetehr you want to use rainbow dragon in aerial mode or land mode by answering this simple question");
		if(super.fly())
		{
			System.out.println(ri/2 + " rainbow dragons are required to travel from  By airways");
		}
		else if(!super.fly() )
		{
			System.out.println(ri + " rainbow dragons are required to travel  By landWays");
			
		}
		
	}
	
}






public class endUser {

	
	public static void main(String args[])
	{
		dragon d = new dragon();
		d.send();
		
	}
	
	
	
}

