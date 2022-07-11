package com.bridgelab;
import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args)
	{
		float heads = 0;
		float tails = 0;
		int counter = 1;
	    double randNum = 0.0;
		float percHead, percTail;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter No Of Tosses : ");
		int flips = in.nextInt();

		while(counter <= flips)
		{
			randNum = Math.random();
			System.out.print(counter + "\t" + randNum);

			if(randNum < .5)
			{
				tails++;
				System.out.println("\t tail");
			}
			else
			{
				heads++;
				System.out.println("\t head");
			}
			counter++;
		}
		percTail = (tails / flips) * 100;
		percHead = (heads / flips) * 100;
	
		System.out.println();
		System.out.println("Percentage of Tails is "  + percTail + "%.");
		System.out.println("Percentage of Heads is "  + percHead + "%.");
		
	}
}
