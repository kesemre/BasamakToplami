import java.util.Scanner;

public class BasamakToplami {
    public static void main(String[] args) {
        int number,total=0;
        Scanner input =new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        number = input.nextInt();
        while(number!=0){
            total+=number%10;
            number/=10;
        }
        System.out.println("Girdiğiniz sayıların toplamı: "+total);
    }
}