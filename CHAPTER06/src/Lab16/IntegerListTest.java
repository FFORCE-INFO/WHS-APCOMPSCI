package Lab16;

// ****************************************************************
// IntegerListansTestans.java
//
// Provide a menu-driven tester for the IntegerListans class.
//          
// ****************************************************************
   import java.util.Scanner;

    public class IntegerListTest
   {
   
      static IntegerList list = new IntegerList(10);
   
   
    //-------------------------------------------------------
    // Create a list, then repeatedly print the menu and do what the
    // user asks until they quit
    //-------------------------------------------------------
       public static void main(String[] args)
      {
      
      
         Scanner keyboard = new Scanner(System.in);
         printMenu();
         int choice = keyboard.nextInt();
         while (choice != 0)
         {
            dispatch(choice);
            printMenu();
            choice = keyboard.nextInt();
         
         }
      }
   
   
    //-------------------------------------------------------
    // Do what the menu item calls for
    //-------------------------------------------------------
       public static void dispatch(int choice)
      {
         Scanner keyboard = new Scanner(System.in);
         int loc;
         switch(choice)
         {
            case 0: 
               System.out.println("Bye!");
               break;
            case 1:
               System.out.println("How big should the list be?");
               int size = keyboard.nextInt();
               list = new IntegerList(size);
               list.randomize();
               break;
            case 2:
               list.selectionSort();
               break;
            case 3:
                System.out.println("sorting");
                list.sortDecrasing();
                //sort decreasing
               break;
            case 4:
               System.out.print("Enter the value to look for: ");
               loc = list.search(keyboard.nextInt());
               if (loc != -1)
                  System.out.println("Found at location " + loc);
               else
                  System.out.println("Not in list");
               break;
            case 5:
               list.print();
               break;
            case 6:
                int a, b;
                System.out.println("enter what to repace what with");
                 a = keyboard.nextInt();
                 b = keyboard.nextInt();
                list.replaceFirst(a, b);
                break;
                
            case 7:
                System.out.println("racpace all with?");
                a = keyboard.nextInt();
                 b = keyboard.nextInt();
                list.replaceAll(a, b);
                break;
            case 8:
                list.increaseSize();
                System.out.println("Done");
                break;
            case 9:
                System.out.println("Remove First of what value?");
                a = keyboard.nextInt();
                list.removeFirst(a);
                break;
            case 10:
                System.out.println("Remove all Of what value?");
                a = keyboard.nextInt();
                list.removeAll(a);
                break;
            case 11:
                System.out.println("enter value to add all of in order");
                a = keyboard.nextInt();
                list.addInOrder(a);
                break;
            default:
               System.out.println("Sorry, invalid choice");
         }
      }
   
   
    //-------------------------------------------------------
    // Print the user's choices
    //-------------------------------------------------------
       public static void printMenu()
      {
      
         System.out.println("\n   Menu   ");
         System.out.println("   ====");
         System.out.println("0: Quit");
         System.out.println("1: Create a new list (** do this first!! **)");
         System.out.println("2: Sort the list ascending using selection sort");
         System.out.println("3: Sort the list descending using selection sort");
         System.out.println("4: Find an element in the list using sequential search");
         System.out.println("5: Print the list");
         System.out.println("6: Repace First");
         System.out.println("7: Repace all");
         System.out.println("8: Increase Size");
         System.out.println("9: Remove First");
         System.out.println("10: Remove all");
         System.out.println("11: Add In order");
         System.out.print("\nEnter your choice: ");
      }
   
   
   }

