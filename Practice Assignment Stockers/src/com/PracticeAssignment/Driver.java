package com.PracticeAssignment;

import java.util.Scanner;

public class Driver {
	public static void printa(double arr[]) {
		for(double val:arr) {
			System.out.print(val+" ");
		}
	}

	public static void main(String[] args) {
		
		SortAssending assending=new SortAssending();
		SortDecending decend= new SortDecending();
		Count c=new Count();
		Search s= new Search();
		// TODO Auto-generated method stub
           Scanner sc= new Scanner(System.in);
           System.out.println("Enter The no of Companies.");
           int nCompany=sc.nextInt();
           double[] price=new double[nCompany];
           boolean[] movement=new boolean[nCompany];
           for(int i=0;i<nCompany;i++) {
        	   System.out.println("Enter the Current Stock Price for Company"+" "+(i+1));
        	   price[i]=sc.nextDouble();
        	   System.out.println("Whether company's stock price rose today compare to yesterday?");
        	   movement[i]=sc.nextBoolean();
           }
           int input=0;
           double key=0;
           
           do {
        	   System.out.print("\n-----------------\n"
        			   +"Entet The operation you want to perform\n"
        			   +"1.Display the Stock Price in Accending Order.\n"
        			   +"2.Display the Stock Price in Decending Order.\n"
        			   +"3.Display the Total No of Companies whose Stock Price rose today.\n"
        			   +"4.Display the Total no of Companies whose Stock price fall today.\n"
        			   +"5.Search for a Specific Stock Prize.\n"
        			   +"6.Exit.\n");
        	   input=sc.nextInt();
        	   switch(input) {
        	   case 1:
        		   assending.sort(price, 0, nCompany-1);
        		   printa(price);
        		   break;
        	   case 2:
        		   decend.sort(price,0,nCompany-1);
        		   printa(price);
        		   break;
        	   case 3:
        		   System.out.println(c.Countup(movement, true));
        		   break;
        	   case 4:
        		   System.out.println(c.Countdown(movement, false));
        		   break;
        	   case 5:
        		   System.out.println("Enter The Price you want to Search for!");
        		   key=sc.nextDouble();
        		   assending.sort(price, 0, nCompany-1);
        		   s.binarysearch(price, 0, price.length-1, key);
        		   break;
        	   case 6:
        		   System.out.println("Thankyou For Trading With Us!");
        		   break;
        		   default:
        			   System.out.println("Invalid Option! Please Try Again!");
        	   }
           }while(input!=6);
           sc.close();
           
	}

}
