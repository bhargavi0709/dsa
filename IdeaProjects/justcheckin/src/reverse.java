import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("give input to compute reverse");
        int num=sc.nextInt();int rev=0;
        while(num!=0){
            int d=num%10;
            rev=(rev*10)+d;
            num=num/10;
        }
        System.out.println("the reverse is "+ rev);
    }
}
