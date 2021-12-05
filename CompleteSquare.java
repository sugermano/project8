package project8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompleteSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter an Integer m: ");
		Scanner input=new Scanner(System.in);
		int m=input.nextInt();
		int[] list=yins(m);
		int n=1;
		for(int i=0;i<1000;i++) {
			if(list[i]%2>0) {
				n*=i;
			}
		}
		System.out.println("The smallest number of m * n to be a perfect square is "+n);
		System.out.println("m * n is "+m*n);

	}

	public static int[] yins(int num){
	    int[] arr=new int[1000];
	    for(int i=0;i<1000;i++) arr[i]=0;
	    for (int i = 2; i <= num; i++) {
	        if (num % i != 0) {
	            continue;
	        }else{
	           if(num >= 2){
	        	   arr[i]+=1;
	               num = num / i;
	               i = 1;
	           }
	        }
	    }
	    return arr;
	}
}
