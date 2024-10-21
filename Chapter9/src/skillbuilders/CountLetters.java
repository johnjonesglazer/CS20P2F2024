package skillbuilders;

import java.util.Scanner;

public class CountLetters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

                System.out.println("Enter a phrase: ");
        String phrase = input.nextLine();

                int letterCount = 0;

        for (int i = 0; i < phrase.length(); i++) {
            char ch = phrase.charAt(i);
            if (Character.isLetter(ch)) {
                letterCount++;
            }
        }


        System.out.println("The number of letters in the phrase is: " + letterCount);
    }
}
