package FunctionsandMethods.src.com.shantanu;

public class BlockScope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Shantanu";

        {
            a = 30;                     //-------------------> You can update the value but cant be intialized again.
            System.out.println(a);
            int c = 43;                 //-----------------> You can reintialized the vaiable outside the block
            System.out.println(c);
            name = "Hardik";
            System.out.println(name);
//            int c = 3232;               -----------> You cant be re intialized the varible inside you can update only here.
        }
        int c = 223;
        System.out.println(c);
        System.out.println(name);
        System.out.println(a);
        // scoping in for loops
        for (int i = 0; i < 4; i++) {
//            System.out.println(i);
            int num = 90;
            a = 10000;
        }
        System.out.println();
    }

    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}