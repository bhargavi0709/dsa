import java.util.Scanner;
public class countOcccurences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("give input to check occurrences");
        int num=sc.nextInt(); int find=sc.nextInt();int count=0;
        while(num>0){
            int last=num%10;
            if(last==find)
                count++;
            num=num/10;
        }
        System.out.println("The number of occurences of "+ find + " are: "+ count);

    }
}
