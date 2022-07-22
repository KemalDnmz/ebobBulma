import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// ok- girilen 2 sayının ebobunu bulma;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int a=scanner.nextInt();
        System.out.println("Bir sayı giriniz: ");
        int b=scanner.nextInt();
        System.out.println("Girdiğiniz sayıların ebobu: "+ebobBulma(a,b));
    }
    public static int ebobBulma(int num1,int num2){
        int ebob=1;
        for(int i=1;i<=num1 && i<=num2;i++ ){
            if(num1%i==0 && num2%i==0){
             ebob=i;
            }
        }
        return ebob;
    }
}
