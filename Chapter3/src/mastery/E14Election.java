package mastery;

import java.util.Scanner;

public class E14Election {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        int totalAwbrey = 0;
        int totalMartinez = 0;
        
        
        System.out.println("Election Results for New York:");
        System.out.print("Awbrey votes: ");
        int awbreyNY = scanner.nextInt();
        System.out.print("Martinez votes: ");
        int martinezNY = scanner.nextInt();
        totalAwbrey += awbreyNY;
        totalMartinez += martinezNY;

        
        System.out.println("\nElection Results for New Jersey:");
        System.out.print("Awbrey votes: ");
        int awbreyNJ = scanner.nextInt();
        System.out.print("Martinez votes: ");
        int martinezNJ = scanner.nextInt();
        totalAwbrey += awbreyNJ;
        totalMartinez += martinezNJ;

        
        System.out.println("\nElection Results for Connecticut:");
        System.out.print("Awbrey votes: ");
        int awbreyCT = scanner.nextInt();
        System.out.print("Martinez votes: ");
        int martinezCT = scanner.nextInt();
        totalAwbrey += awbreyCT;
        totalMartinez += martinezCT;
        
        
        int totalVotes = totalAwbrey + totalMartinez;
        double awbreyPercentage = (double) totalAwbrey / totalVotes * 100;
        double martinezPercentage = (double) totalMartinez / totalVotes * 100;

    
        System.out.println("\nCandidate    Votes   Percentage");
        System.out.printf("Awbrey      %6d   %.2f%%\n", totalAwbrey, awbreyPercentage);
        System.out.printf("Martinez    %6d   %.2f%%\n", totalMartinez, martinezPercentage);
        System.out.printf("\nTotal Votes: %d\n", totalVotes);
	    }
	}

