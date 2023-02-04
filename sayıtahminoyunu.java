import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rnd = new  Random();
        Scanner al=new Scanner(System.in);


        System.out.println("sayı tahmin oyunu");
        System.out.println("tahmini sayınızı giriniz");
        int tahmin=al.nextInt();
        int sayı=rnd.nextInt(50);

        while (tahmin!=sayı){

            if (tahmin<sayı){

                System.out.println("yaklaştın! lütfen biraz daha büyük sayı gir.");
                tahmin= al.nextInt();
            }
            else if (tahmin>sayı){

                System.out.println("yaklaştın!daha küçük bir sayı gir.");
                tahmin=al.nextInt();
            }


            else {
                System.out.println("lütfen 0 ile 50 arasında bir sayı giriniz...");
                tahmin=al.nextInt();

            }


        }
        System.out.println("Tebrikler!! doğru tahmin.");


    }
}
