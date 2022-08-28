package Switch.src.com.shantanu;

import java.util.Scanner;

public class Nestedstatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter EmpId Here : ");
        int  EmpId = input.nextInt();
        String Department  = input.next();
        switch (EmpId) {
            case 1 -> System.out.println("Hello Shantanu");
            case 2 -> System.out.println("Hello Pranath");
            case 3 -> System.out.println("Hello kunal");
            case 4 -> {
                System.out.println("EmpId number 4");
                switch (Department) {
                    case "IT" -> System.out.println("Department of IT");
                    case "Civil" -> System.out.println("Department of Civil");
                    case "Mechanical" -> System.out.println("Department of mechanical");
                    case "Electric" -> System.out.println("Department of Electrical");
                    case "Management" -> System.out.println("Department of management");
                    default -> System.out.println("Enter correct Department");
                }
            }
            default -> System.out.println("Enter correct EmpId");
        }
//        switch (EmpId) {
//            case 1:
//                System.out.println("Hello Shantanu");
//                break;
//            case 2:
//                System.out.println("Hello Pranath");
//                break;
//            case 3:
//                System.out.println("Hello kunal");
//                break;
//            case 4:
//                System.out.println("EmpId number 4");
//                switch (Department){
//                    case "IT":
//                        System.out.println("Department of IT");
//                        break;
//                    case "Civil":
//                        System.out.println("Department of Civil");
//                        break;
//                    case "Mechanical":
//                        System.out.println("Department of mechanical");
//                        break;
//                    case "Electric":
//                        System.out.println("Department of Electrical");
//                        break;
//                    case "Management":
//                        System.out.println("Department of management");
//                        break;
//                    default:
//                        System.out.println("Enter correct Department");
//                }
//                break;
//            default:
//                System.out.println("Enter correct EmpId");
//
//        }


    }
}