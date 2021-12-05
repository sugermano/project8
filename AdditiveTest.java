package project8;

import java.util.Scanner;

public class AdditiveTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("What is 5 + 9? ");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int i=0;
		int[] arr=new int[100];
		arr[i]=n;
		while(true) {
			if(n==14) {
				System.out.print("You got it!");
				break;
			}else {
				System.out.print("Wrong answer. Try again. What is 5 + 9? ");
				n=input.nextInt();
				for(int j=0;j<100;j++) {
					if(arr[j]==n) {
						System.out.println("You already enter the "+n);
					}
				}
				i++;
				arr[i]=n;
			}
		}

	}

}
