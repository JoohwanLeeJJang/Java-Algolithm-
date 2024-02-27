import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a%4;
        int c = a%100;
        int d = a%400;
        if(b==0 && c!=0 || d==0){
            System.out.print("1");
        }
        else{
            System.out.print("0");
        }
         
    }
}