package qus7;

public class Abc {

    static int age1;
    static String firstName1, lastName1;

    static void show(){
        age1 = 27;
        firstName1 = "Selena";
        lastName1 = "Gomez";
    }

public static void main(String[] args) {
    System.out.print("Using static block: ");
    System.out.print("\nAge: " + age1 + ", First Name: " + firstName1 +", Last Name: " + lastName1);

    System.out.print("\nUsing static method: ");
    Abc.show();
    System.out.print("\nAge: " + Abc.age1 + ", First Name: " + Abc.firstName1 +", Last Name: " + Abc.lastName1);

    System.out.print("\nUsing static variable");
    System.out.print("\nAge: " + age1 + ", First Name: " + firstName1 +", Last Name: " + lastName1);

}
}