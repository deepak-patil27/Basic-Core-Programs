package com.bridgelab;
import java.util.*;
public class LargestNumber {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
        System.out.print("Enter number a: ");
        int a = input.nextInt();
        System.out.print("Enter number b: ");
        int b = input.nextInt();
        System.out.print("Enter number c: ");
        int c = input.nextInt();
        int max = (a > b)?(a > c ? a:c):(b > c ? b:c);
		System.out.println("Largest of 3 numbers is " + max);
        input.close();
	}

}
