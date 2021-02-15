package qus10;

public class Main {
    public static void main(String[] args) {

        test obj = new test();

        //Addition
        System.out.println("Adding two integers: " + obj.add(4,10));
        System.out.println("Adding two doubles: " + obj.add(7.23,8.68));

        //Multiplication
        System.out.println("Multiplying two integers: " + obj.multiply(5,15));
        System.out.println("Multiplying two floats: " + obj.multiply(9.77f, 8.26f));

        //Concatenation
        System.out.println("Concatenating two Strings: " + obj.concat("Hello", " Everyone"));
        System.out.println("Concatenating three Strings: " + obj.concat("Hello", " Hii", "  bye"));
    }
}