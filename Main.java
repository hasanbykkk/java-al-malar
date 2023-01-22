import java.util.Scanner;




public class Main {
    static void toplama(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("birinci sayıyı giriniz");
        int a=scanner.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        int b= scanner.nextInt();
        System.out.println("sayıların toplamı"+""+(a+b));
    }

    static void çıkarma(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("birinci sayıyı giriniz");
        int a=scanner.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        int b= scanner.nextInt();
        System.out.println("birinci sayının  ikinci sayıdan çıkması"+""+(a-b));
    }
    static void çarpma(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("birinci sayıyı giriniz");
        int a=scanner.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        int b= scanner.nextInt();
        System.out.println("sayıların çarpımı"+""+(a*b));
    }
    static void bölme(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("birinci sayıyı giriniz");
        int a=scanner.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        int b= scanner.nextInt();
        System.out.println("sayıların çarpımı"+""+(a/b));
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        while (true) {
            System.out.println("yapmak istedğiniz işlem \n1-toplama \n2-çıkarma \n3-çarpma\n4-bölme işlemi \n5-çıkış yapmak için herhangi bir tuşa basın");
            int seç=scanner.nextInt();

            if (seç==1){
                toplama();
            }
            else if (seç==2){
                çıkarma();
            }

            else if (seç==3){
                çarpma();
            }
            else if (seç==4){
                bölme();
            }
            else {

                System.out.println("çıkış yapılıyor");
                break;
            }



        }



    }
}

