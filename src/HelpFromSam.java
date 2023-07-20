import java.util.Scanner;

public class HelpFromSam {
    public static int help(int num){
        int r=1;
        int count=0;
        while(num>=r){
            num=num-r;
            r++;
            count=count+1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int val=help(num);
        System.out.println("the value is :"+val);

    }
}