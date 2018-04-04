package RecursionLab;

	//Name______________________________ Date_____________
   import edu.fcps.Utilities;
   import javax.swing.JOptionPane;
   public class Simple
   {
      public static void main(String[] args)
      {	int selection=0;
      
         do{
            selection = driver();
         }while (selection != 0);
      
         System.exit(0);
      }
      public static void factors (int num)
      {
      
         /************************/
      	/*                      */
      	/* Your code goes here. */
      	/*                      */
      	/************************/
      
      }
      public static int gcd(int a, int b)
      {
      
         /************************/
      	/*                      */
      	/* Your code goes here. */
      	/*                      */
      	/************************/
      
         return 1;
      }
      public static boolean prime(int num)
      {
      
         /************************/
      	/*                      */
      	/* Your code goes here. */
      	/*                      */
      	/************************/
      
         return false;
      }
      public static double power(double base, int exponent)
      {
      
         /************************/
      	/*                      */
      	/* Your code goes here. */
      	/*                      */
      	/************************/
      
         return 1;
      }
   
      public static int findDigit(int num, int n)
      {
      
         /************************/
      	/*                      */
      	/* Your code goes here. */
      	/*                      */
      	/************************/
      
         return 1;
      }
      public static void downDigits(int num)
      {
      
         /************************/
      	/*                      */
      	/* Your code goes here. */
      	/*                      */
      	/************************/
      
      }
      public static int countDigits(double number)
      {
      
         /************************/
      	/*                      */
      	/* Your code goes here. */
      	/*                      */
      	/************************/
      
         return 0;
      }
      public static void print (int n)
      {
         switch (n)
         {
            case 1 : System.out.println( "st" ); 
               break;
            case 2 : System.out.println( "nd" ); 
               break;
            case 3 : System.out.println( "rd" ); 
               break;
            default: System.out.println( "th" ); 
               break;
         }
      }
      public static int menu()
      {
         Utilities.cls();
         System.out.println( "    (0) Quit." );
         System.out.println( "    (1) Find the factors of a given number." );
         System.out.println( "    (2) Find the greatest common divisor of two numbers." );
         System.out.println( "    (3) Determine if a given number is prime." );
         System.out.println( "    (4) Raise a real or integer to an integer power." );
         System.out.println( "    (5) Find the nth digit from the right of an integer." );
         System.out.println( "    (6) Write an integer vertically." );
         System.out.println( "    (7) Find the number of digits to the left " );
         System.out.println( "        of the decimal in a real number." );
         int selection = Integer.parseInt(JOptionPane.showInputDialog("Make selection:"));
         return selection;
      }
      public static int driver()
      {
         int selection = menu();
         int num1, num2;
         double number;
         String s;
         switch (selection)
         {
            case 0 : 
               break;
            case 1 : 
               num1 = Integer.parseInt(JOptionPane.showInputDialog("What integer do you wish to find factors of? "));
               factors(num1);
               Utilities.getch(); 
               break;
            case 2 : 
               s = JOptionPane.showInputDialog("Enter two integers you wish to find the gcd of:");
               num1 = Integer.parseInt(s.substring(0, s.indexOf(' ')));
               num2 = Integer.parseInt(s.substring(s.indexOf(' ') + 1));
               System.out.println( "The greatest common divisor between " + num1 + " and "
                                 + num2 + " is " + gcd(num1, num2));
               Utilities.getch();
               break;
            case 3 : 
               num1 = Integer.parseInt(JOptionPane.showInputDialog("What number do you wish to test for being prime? ")); ;
               System.out.print( "The number " + num1 + " is");
               if (! prime(num1)) System.out.print( " not");
               System.out.println( " prime." );
               Utilities.getch();
               break;
            case 4 : 
               number = Integer.parseInt(JOptionPane.showInputDialog("What real or integer number do you wish to raise to a power? "));
               num1 = Integer.parseInt(JOptionPane.showInputDialog("What power? "));
               System.out.print( number + " raised to the " + num1);
               print(num1);
               System.out.println( " power is " + power(number,num1) );
               Utilities.getch();
               break;
            case 5 : System.out.println( );
               num1 = Integer.parseInt(JOptionPane.showInputDialog("What integer? "));
               num2 = Integer.parseInt(JOptionPane.showInputDialog("What digit? "));
               System.out.print( "The " + num2 );
               print(num2);
               System.out.println( " digit of " + num1 + " is " + findDigit(num1,num2) );
               Utilities.getch();
               break;
            case 6 : 
               num1 = Integer.parseInt(JOptionPane.showInputDialog("What number to write down? ")) ;
               System.out.print( "The digits of " + num1 + " are: " );
               downDigits(num1);
               Utilities.getch();
               break;
            case 7 : 
               number = Integer.parseInt(JOptionPane.showInputDialog("What real number to check digits to the left? ")) ;
               System.out.println( "The number of digits to the left of the decimal"
                                 + " point is " + countDigits(number) );
               Utilities.getch();
               break;
            default: ;
         }
         return selection;
      }
   }