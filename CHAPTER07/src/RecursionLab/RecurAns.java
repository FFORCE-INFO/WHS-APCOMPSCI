package RecursionLab;

	//Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
	//version 9.2.2003

import javax.swing.JOptionPane;
public class RecurAns
{
   public static void main(String[] args)
   {
      int number;
      int num, response = 1;
      char ch;
      do
      { 
            //edu.fcps.Utilities.cls();
         System.out.print("Make a selection" + "\n");
         System.out.print("    (1) Letters" + "\n");
         System.out.print("    (2) Number of factors of two" + "\n");
         System.out.print("    (3) Perfect power of three?" + "\n");
         System.out.print("    (4) Reverse a number" + "\n");
         System.out.print("    (5) Change to base 5" + "\n");
         System.out.print("    (6) Print with Commas" + "\n");
         System.out.print("    (0) To quit" + "\n");
         response = Integer.parseInt(JOptionPane.showInputDialog("Enter a number:"));
         System.out.println();
         switch (response)
         {
            case 1 : ch = JOptionPane.showInputDialog("Enter a lower case letter: ").charAt(0);
               letters (ch); 
               break;
            case 2 : num = Integer.parseInt(JOptionPane.showInputDialog("How many factors of 2 in what number?  "));
               System.out.print("There are " + twos(num) + " factors of two in "
                                  + num + "\n"); 
               break;
            case 3 : num = Integer.parseInt(JOptionPane.showInputDialog("Perfect power of 3?  What positive integer? "));
               System.out.print(num + " is ");
               if ( ! powerOfThree(num))
                  System.out.print("not ");
               System.out.print("a perfect power of three. " + "\n"); 
               break;
            case 4 : number = Integer.parseInt(JOptionPane.showInputDialog("What integer to reverse? "));
               System.out.print("The number " + number + " reversed is " );
               System.out.println(reverse(number));
               System.out.println(); 
               break;
            case 5 : num = Integer.parseInt(JOptionPane.showInputDialog("Change what number to base 5? "));
               System.out.print(num + " written in base 5 is ");
               System.out.println(base5(num));
               System.out.println(); 
               break;
            case 6 : num = Integer.parseInt(JOptionPane.showInputDialog("What number to print with commas? "));
               printWithCommas( num );
               System.out.println(); 
               break;
            case 0:
               System.out.println("Good-bye.");
               System.exit(0);
               break;
            default : ;
         } // switch
         System.out.println("\n\nHit any key to continue.");
            //edu.fcps.Utilities.getch();
      }while (response > 0);
      System.out.println("Negative.");
      System.exit(0);
   }
   public static void letters(char ch)
   {
      char[] chars = {'a', 'b', 'c', 'd',  'e', 'f', 'g', 'h','i', 'j', 'k', 'l','m', 'n', 'o', 'p','q', 'r', 's', 't','u', 'v', 'w', 'x','y', 'z'};
      for (int i = 0; i <26; i++)
      {
         if (ch == chars[i])
         {
            if (i != 0)
            {
            letters(chars[i-1]);
            }
            System.out.print(chars[i]);
         }
      }
   }
   public static int twos (int num)
   {
      if (num % 2  == 1)
      {
         return 0;
      }
      else
      {
         return twos(num / 2) + 1;
      }
   }
   public static boolean powerOfThree (int num)
   {
      if (num == 1)
         return true;
      else if (num % 3 == 0)
      {
         return powerOfThree(num / 3);
      }
      else
      {
         return false;
      }
   }
   public static int reverse (int number)
   {
      int num = Math.abs(number); 
      int i = 0;
      while (num > 0)
      {
         i++;
         num /= 10;
      }
      
      if (number < 0)
      {
         if(number / 10 == 0)
         {
            return -1 * number;
         }
         else
         {
            return -1 * number * (int)Math.pow(10, i) + reverse((number /10));
         } 
      }
      else
      {
         if(number / 10 == 0)
         {
            return 1 * number;
         }
         else
         {
            return 1 * number * (int)Math.pow(10, i) + reverse((number /10));
         } 
        
      }
   }
      
   public static int base5 (int num)
   {
   if(num<5)
   {
   return num;
   }
   else
   {
      return num % 5 + (10 * base5(num/5));
      }
   }
   public static void printWithCommas ( int num )
   {
      String str = "";
      while(num > 0)
      {
         if(num < 1000)
         {
            str = (num % 1000) + str;
         }
         else
         {
         
            str = "," +(num % 1000) + str;
         }
         num /= 1000;
      }
      System.out.println(str);
   }
}