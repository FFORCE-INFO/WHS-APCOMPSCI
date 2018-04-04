/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab15;

/**
 *
 * @author Frank
 */
import java.util.Scanner;
public class QuizGrader {

    /**
     * @param args the command line arguments
     */
 private final static Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args)
    {
        grade();
    }

    static void grade()
    {
        int correct = 0;

        int abc = PromptInt("Number of questions: ");
        char key[] = new char[abc];

        SCAN.nextLine();

        for (int i = 0; i < abc; i++)
            key[i] = PromptString(String.format("Enter the key for question %d: ", i + 1)).charAt(0);

        for (int i = 0; i < abc; i++)
            if (key[i] == PromptString(String.format("Enter the answer for question %d: ", i + 1)).charAt(0))
                correct++;

        System.out.println(String.format("Number Correct: %d\r\nPercentage Correct: %d%%", correct, (correct / abc) * 100));

        if (PromptString("Grade another quiz? (y/n): ").equalsIgnoreCase("y"))
            grade();
    }

    static int PromptInt(String question)
    {
        System.out.print(question);

        while (!SCAN.hasNextInt())
        {
            System.out.flush();

            System.out.print("Enter a number: ");

            SCAN.next();
        }

        return SCAN.nextInt();
    }

    static String PromptString(String question)
    {
        System.out.print(question);

        while (!SCAN.hasNextLine())
        {
            System.out.flush();

            System.out.print("Enter a string: ");

            SCAN.next();
        }

        return SCAN.nextLine();
    }
    }
    

