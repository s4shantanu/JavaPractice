package Switch.src.com.shantanu;

import java.util.Scanner;

public class Switchstatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter fruit name : ");
        System.out.println("Enter number : ");
        String fruit = input.next();
        int day = input.nextInt();
//

//        switch (fruit) {
//            case "Mango":
//                System.out.println("The king of fruit");
//                break;
//            case "Apple":
//                System.out.println("Sweet and red fruit");
//                break;
//            case "Banana":
//                System.out.println("Long yellow with good nutrients");
//                break;
//            case "Graps":
//                System.out.println("Small sweet and healthy");
//                break;
//            default:
//                System.out.println("Print vaild fruit name");
//        }


// Enhance statement ---->
        switch (fruit) {
            case "Mango" -> System.out.println("The king of fruit");
            case "Apple" -> System.out.println("Sweet and red fruit");
            case "Banana" -> System.out.println("Long yellow with good nutrients");
            case "Graps" -> System.out.println("Small sweet and healthy");
            default -> System.out.println("Print valid fruit name");
        }
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thrusday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Enter Valid number");

        }
// For that two input we used the nested statement
    }
}

