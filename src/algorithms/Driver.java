package algorithms;

import java.util.Scanner;

public class Driver {
	
	BruteAutoComplete brute;
	WordList word;
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
	
	private int bruteMenu() {
        System.out.println("  1) Best Match");
        System.out.println("  2) Multiple Matches");
        System.out.println("------------------------");
        System.out.println("  0) Exit");
        System.out.print("==>> ");
        int option = input.nextInt();
        return option;
    }
	public static void main(String[] args) throws Exception {
        new Driver();
    }
	
	public Driver() throws Exception{
        input = new Scanner(System.in);
        start();
    }
	
	private void start() throws Exception{
        int option = mainMenu();
        while (option != 0)
        {
        switch (option) {
       
        // Case 1: Brute Force Complete
        case 1:
            bruteStart();
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
	
	private void bruteStart() throws Exception{
        int option = bruteMenu();
        brute = new BruteAutoComplete();
        while (option != 0)
        {
        switch (option) {
       
        // Case 1: Brute Force Complete
        case 1:
            runBestMatch();
            break;
           
        // Case 2: Quick Auto Complete
        case 2:
            
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
	
	private void runBestMatch() throws Exception {
		System.out.println("Enter prefix ===>");
		String prefix = input.nextLine();
		prefix = input.nextLine();
		brute.bestMatch(prefix);
	}

	private void quick() {
		
		
	}

}
