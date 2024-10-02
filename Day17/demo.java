import java.util.*;
import java.util.Calendar;
import java.util.Date;
class demo{

	public static void main(String args[]){

		//1. print table of any number in reverse
		
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num=s1.nextInt();

		for(int i=10;i>=1;i--){

			System.out.println(num+"X"+i+"="+num*i);

				}

	System.out.print("\n------------------------------------------\n");

		//2. print second predecessor and second sucessor

		System.out.println("Enter a number: ");
		int a=s1.nextInt();

		int second_pre=a-2;

		int second_suc=a+2;

		System.out.println("Second predecessor: "+second_pre);

		System.out.println("Second Successor: "+second_suc);


	System.out.print("\n------------------------------------------\n");

		//3. area of rectangle 

		System.out.println("Enter a Length: ");

		int length=s1.nextInt();
		
		System.out.println("Enter a Breadth: ");

		int breadth=s1.nextInt();

		System.out.println("Area of rectangle is: "+length*breadth);
		

	System.out.print("\n------------------------------------------\n");

	
		//4. print pattern

		int num_1=3;
		
		for(int i=1;i<=4;i++){

		if(i==1){
			for(int j=1;j<=i;j++){
			
			System.out.print(num_1+"\t");

				}
			}

		else if(i==2){
		
			num_1=2;
		for(int j=1;j<=i;j++){
			
			System.out.print(num_1+"\t");
			num_1++;
				}
			
			}
	
		else if(i==3){
		
			num_1=1;
		for(int j=1;j<=i;j++){
			
			System.out.print(num_1+"\t");
			num_1++;
				}
			
			}

		else if(i==4){
		
			num_1=0;
		for(int j=1;j<=i;j++){
			
			System.out.print(num_1+"\t");
			num_1++;
				}
			
			}

	System.out.println();			

	}
		
	System.out.print("\n------------------------------------------\n");

		//5.print
		System.out.println("Enter date : ");
		int d = s1.nextInt();
		int m = s1.nextInt();
		int y = s1.nextInt();
		if((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && (d > 0 && d <= 31) && y >= 0) {
			System.out.println("Vaiid date");
		} else if((m == 4 || m == 6 || m == 9 || m == 11) && (d > 0 && d <= 30) && y >= 0){
			System.out.println("valid date");
		} else if(m == 2 && y >= 0) {
			if(y % 100 == 0) {
				if(y % 400 == 0) {
					if(d > 0 && d <= 29) {
						System.out.println("valid date");
					} else {
						System.out.println("Invalid date");
					}
				} else {
					if(d > 0 && d <= 28) {
						System.out.println("Valid date");
					} else {
						System.out.println("Invalid date");
					}
				}
			} else if(y % 4 == 0) {
				if(d > 0 && d <= 29) {
					System.out.println("valid date");
				} else {
					System.out.println("Invalid date");
				}	
			} else if(d > 0 && d <= 28) {
				System.out.println("valid date");
			} else {
				System.out.println("Invalid date");
			}

		} else {
			System.out.println("Invalid");
		}




		}

	}