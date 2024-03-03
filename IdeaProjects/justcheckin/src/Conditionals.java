import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a character");
        char ch= sc.next().charAt(0);
        int unicode= ch;
        if(unicode>=97 && unicode<=122)
            System.out.println("It is a lowercase character");
            else
            System.out.println("It is an uppercase character");
            //case check for character
    }
}