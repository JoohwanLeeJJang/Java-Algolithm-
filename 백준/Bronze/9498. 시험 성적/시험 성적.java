import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        if(a>=90 && 100>=a){
            System.out.print("A");
        }
        else if(a>=80 && 90>a){
            System.out.print("B");
        }
        else if(a>=70 && 80>a){
            System.out.print("C");
        }
        else if(a>=60 && 70>a){
            System.out.print("D");
        }
        else{
            System.out.print("F");
        }
    }
}