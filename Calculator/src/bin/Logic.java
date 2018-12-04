package bin;

import java.util.Scanner;

public class Logic {
	private int a;
	private double firstNumber, secondNumber;
	private Scanner scan;
	MathFunctions mathFunctions;
	
	public Logic() {
		scan = new Scanner(System.in);
		mathFunctions = new MathFunctions();
	}
	public void logicStart() {
		
		
		
		do {
			whatToDo();
			programStepsScan();
			
		}while(a != 0);
		scan.close();
	}
	
	private void whatToDo() {
		System.out.println("Please choose what you want to do: ");
		System.out.println("1. Add\n"
				+ "2. Subtract\n"
				+ "3. Multiplication\n"
				+ "4. Divide\n"
				+ "0. Exit");
	}
	
	private void programStepsScan() {
		a = scan.nextInt();
		switch (a){
			case 1:
				numbersQuestion();
				mathFunctions.setA(firstNumber);
				mathFunctions.setB(secondNumber);
				System.out.println(mathFunctions.Add());
				break;
			case 2:
				numbersQuestion();
				mathFunctions.setA(firstNumber);
				mathFunctions.setB(secondNumber);
				System.out.println(mathFunctions.Subtract());
				break;
			case 3:
				numbersQuestion();
				mathFunctions.setA(firstNumber);
				mathFunctions.setB(secondNumber);
				System.out.println(mathFunctions.Multiplication());
				break;
			case 4:
				numbersQuestion();
				mathFunctions.setA(firstNumber);
				mathFunctions.setB(secondNumber);
				System.out.println(mathFunctions.Division());
				break;
			case 0:
				System.out.println("Shut Down!");
				break;
			default:
				System.out.println("We don't have that option");
			break;
		}
		
				
	}
	
	private void numbersQuestion() {
		System.out.print("FirstNumber: ");
		firstNumber = scan.nextDouble();
		System.out.print("SecondNumber: ");
		secondNumber = scan.nextDouble();
	}
}
