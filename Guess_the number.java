import java.util.Random;
import java.util.Scanner;
public class Main {

	public static void game()
	{
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		
		int Rand_num= rand.nextInt(100);
		System.out.println(Rand_num);
		
		
		
		int user_num;
		int points=10;
		do {
			System.out.print("Your guess : ");
			user_num=scan.nextInt();
			if(user_num==Rand_num) {
			System.out.println("Guess is right !!");
			break;
			}
			else if(user_num<Rand_num)
			{
				System.out.println("too low");
				points--;
			}
			else if(user_num>Rand_num)
			{
				System.out.println("too high");
				points--;
			}
			
		}while(points>0);
		if(points==0)	System.out.println("No nore chances !50");
		System.out.println("your Score : "+points+"/10");
		

	}
	public static void rules()
	{
		System.out.println("\tRULES");
		System.out.println("\t GUESS the correct number form 1 to 100");
		System.out.println("\t points will DEDUCTED as game gets prolonged");
		System.out.println("\t when points reached ..its GAME OVER");
		System.out.println("\t try as many times you want by selecting to PLAY AGAIN");
	}
	public static void main(String[] args) {
		int option;
		System.out.println("\t----------------------");
		System.out.println("\t Guess the NUMBER ! ");
		System.out.println("\t----------------------");
		System.out.println("\t PLAY  GAME (PRESS 1)");
		System.out.println("\t RULES (PRESS 2)");
		System.out.println("\t EXIT (PRESS 3)");
		System.out.println("\t----------------------");
		Scanner scan = new Scanner(System.in);
		option=scan.nextInt();
		do {
		switch(option)
		{
		case 1:
			game();
			break;
		case 2:
			rules();
			break;
		default:
			System.out.println("CHOOSE the given options !!");
		}
		System.out.println("-> ? ");
		option =scan.nextInt();
		
		
			}while(option!=3);
	}
}


