package Lab1;

public class mainApp1 {
    public static void main(String [] args){
        int b = 2;
        int n = 11;
        System.out.println("Welcome to Scientific Calculator");
        System.out.println ("Program Started...");
        System.out.println ("You can calculate numbers");
        System.out.println (b+" to power "+n+" = "+ myLibrary.Power(b,n));
        System.out.println(n+"! = " + myLibrary.factorial(n));
        System.out.println("Program ..Ended ...");
    }
}
