import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a string");
String str= sc.nextLine().replaceAll("\\s","");
//remove all spaces within the string by replacing whitespaces with empty string character
        System.out.println(str);
    }
}
