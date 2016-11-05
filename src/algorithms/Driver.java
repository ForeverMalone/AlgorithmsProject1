package algorithms;

import java.util.Scanner;

public class Driver {
	
	private Scanner input;
	
	private int mainMenu() {
        System.out.println("  1) Brute Force");
        System.out.println("  2) Quick");
        System.out.println("------------------------");
        System.out.println("  0) Exit");
        System.out.print("==>> ");
        int option = input.nextInt();
        return option;
    }
	
	public static void main(String[] args) {
        new Driver();
    }
	
	public Driver(){
        input = new Scanner(System.in);
        start();
    }
	
	private void start(){
        int option = mainMenu();
        while (option != 0)
        {
        switch (option) {
       
        // Case 1: Brute Force Complete
        case 1:
            brute();
            break;
           
        // Case 2: Quick Auto Complete
        case 2:
            quick();
            break;

        default:
            System.out.println("Invalid option selected.");
            break;
        }
        System.out.println("");
        option = mainMenu();
        }
        System.out.println("Goodbye!");
    }
	
	private void quick() {
		// TODO Auto-generated method stub
		
	}


	private void brute() {
		// TODO Auto-generated method stub
		
	}

}
