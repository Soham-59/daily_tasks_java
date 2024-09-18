import java.util.*;

class demo{

	public static void main(String[]abc){

		// 1. print addition of users number and 2 combine

		Scanner s1=new Scanner(System.in);

	System.out.println("Enter value of a :");
		int a=s1.nextInt();

	
	System.out.println("Enter value of a :");
		int b=s1.nextInt();

		System.out.println("The addition of "+a+" and "+b+" is : "+(a+b));

		System.out.println("The subtraction of "+a+" and "+b+" is : "+(a-b));

	System.out.print("\n---------------------------------------------\n");


		//2 multiplication and division

		System.out.println("The multiplication of "+a+" and "+b+" is : "+(a*b));
		
		System.out.println("The division of "+a+" and "+b+" is :"+(b/a));

	System.out.print("\n---------------------------------------------\n");

		
		//3 print addition of two numbers cubes


		int temp=a*a*a;
		
		int temp_1=b*b*b;

		System.out.println("The addition of "+temp+" and "+temp_1+" is : "+(temp+temp_1));

		int count=a*a;

		int count_1=b*b;

		System.out.println("The addition of "+count+" and "+count_1+" is : "+(count-count_1));

	System.out.print("\n---------------------------------------------\n");

		//4. calculator  using switch

		System.out.println("Enter the first Number :");

			int num1=s1.nextInt();

		System.out.println("Enter the second number :");

			int num2=s1.nextInt();

		System.out.println("Enter the operator :");

			String opr=s1.next();

		switch(opr){

			case "+" :

				{	System.out.println("Additon is : "+(num1+num2));
					break;

					}
			case "-" :

				{	System.out.println("Subtraction is :"+(num1-num2));
					break;

					}
			case "*" :

				{	System.out.println("Multiplication is : "+(num1*num2));
					break;

					}
			case "/" :

				{	System.out.println("Division is : "+(num1/num2));
					break;

					}

		default:{

			System.out.println("Enter Valid Operator.");
			


				}

	
			}


	System.out.print("\n---------------------------------------------\n");


	//5. print pattern

	for(int i=1;i<=4;i++){

		for(int j=1;j<=i;j++){

			System.out.print("*"+"\t");

			}
		System.out.println();
		
		}





	
















		}


	}