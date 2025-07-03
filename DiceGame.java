import java.util.Random;
import java.util.Scanner;
public class DiceGame{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	int a = rand.nextInt(6)+1;
	int b = rand.nextInt(6)+1;
	int sum = a+b;

	System.out.println("Rolling dice...");
	System.out.println("Die 1: "+a);
	System.out.println("Die 2: "+b);
	System.out.println("Total value: "+sum);

	if(sum>7) System.out.println("You won!");
        else System.out.println("You lost...");
    }
}
