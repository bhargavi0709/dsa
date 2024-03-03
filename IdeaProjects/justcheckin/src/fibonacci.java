import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the nth fibonacci number u want");
        int n=sc.nextInt();
        int f=0; int l=1; int count=2;int temp=0;
        while(count<=n){
            temp=l;
            l+=f;
            f=temp;
            count++;
        }
        System.out.println("The "+ n + "th fibonacci number is : "+ l);
    }
}
