package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//       int n = 8;

/*       switch (n){
           case 1:
               System.out.println("Monday");
               break;
           case 2:
               System.out.println("Tuesday");
               break;
           case 3:
               System.out.println("Wednesday");
               break;
           case 4:
               System.out.println("Thursday");
               break;
           case 5:
               System.out.println("Friday");
               break;
           case 6:
               System.out.println("Saturday");
               break;
           case 7:
               System.out.println("Sunday");
               break;
           default:
               System.out.println("Valid input should be between 1 and 7. Please try again!");
       }*/

        String day = "Monday";
        String result = "";

        result = switch (day){
            case "Monday": yield "7am";
            case "Sunday": yield "9am";
            default: yield "6am";
        };

        System.out.println(result);
    }
}
