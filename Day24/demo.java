import java.util.*;
class demo{

	//DAY 24

	public static void main(String[] args){

		Scanner s1=new Scanner(System.in);

  
        //1. fibonacci series of user enterd number
        System.out.println("Enter size for fibonacci series");
        	int size=s1.nextInt();
        	int n1=0;
       	 	int n2=1;
       	 	int n3;
     		 if(size==1){
      		    System.out.print(n1+" ");
     			 }
     		 else if(size==2){
         		 System.out.print(n1+" ");
         		 System.out.print(n2+" ");
      			}
    		  else{
       		   System.out.print(n1+" ");
        		  System.out.print(n2+" ");
          			for(int i=2;i<size;++i){
         				 n3=n1+n2;
         			 	System.out.print(n3+" ");
          				n1=n2;
         			 	n2=n3;
     			 }
      
             
     		 } 

	System.out.print("\n-----------------------------------------\n");

		//2. print enter decimal number converted into binary

		String s = "";
		System.out.println("Enter decimal num : ");
	
		int dec = s1.nextInt();
		int i = 0, quo, rem;
		while(true) {
			quo = dec / 2;
			rem = dec % 2;
			dec = quo;
			if(rem == 1) {
				s = s.concat("1");
			} else if(rem == 0) {
				s = s.concat("0");
			}
			i++;
			if(quo == 0)
				break;
		}
		for(int j = s.length() - 1; j >= 0; j--) {
			System.out.print(s.charAt(j));
		}    
		
	System.out.print("\n-----------------------------------------\n");	

	/*3 Write a Program to that accepts 10 integers from user and breaks the loop of accepting numbers if user enters a negative number*/

		System.out.println("Enter the numbers : ");

	int a;

	for(int k=1;k<=10;k++){

		a=s1.nextInt();

		if(a<0){

			break;

				}

			}

	System.out.print("\n-----------------------------------------\n");

		//4. print pattern

		char ch='A';

		for(int j=1;j<=4;j++){

			for(int k=3;k>=j;k--){

				System.out.print(" \t");

				}


			if(j==1){
		
			for(int l=1;l<=j;l++){
			
				System.out.print(ch+"\t");
				}

			}

		else if(j==2){
			
		ch='A';
			for(int l=1;l<=j;l++){
			
				System.out.print(ch+"\t");
				++ch;
				}

			}

		else if(j==3){
	
			ch='A';
			for(int l=1;l<=j;l++){
			
				System.out.print(ch+"\t");
				++ch;
				}

			}

		else if(j==4){
	
			ch='A';
			for(int l=1;l<=j;l++){
			
				System.out.print(ch+"\t");
				++ch;
					}

				}


			System.out.println();
				}

	System.out.print("\n-----------------------------------------\n");



		/*5. Write a Program that accepts 5 integer values from user and compares two consecutive  inputs and if the second of them is lesser than the previous one then
the code exits out of loop and prints the unexpected input.
{Note: Use Break Statement}*/

		System.out.println("Enter the numbers : ");

	int arr[] = new int[5];
	
		for(int k= 0; k < 5; k++) {
			arr[k] = s1.nextInt();

			if(k > 0) {
				if(arr[k - 1] > arr[k]){
					break;

				}
			}
		}

	






		}


	}