

import com.sun.jdi.event.MonitorWaitedEvent;

import java.awt.desktop.ScreenSleepEvent;
import java.security.KeyStore;
import java.util.*;
import java.util.Random;

public class Main {

    static void ekle(List liste){
        Scanner scanner=new Scanner(System.in);
        System.out.println("eklenecek kişi");
        String kişi = scanner.nextLine();
        liste.add(kişi);

    }
    static void sil(List liste){
        Scanner scanner=new Scanner(System.in);
        System.out.println("silinecek kişi");
        String sil = scanner.nextLine();
        liste.remove(sil);

    }
    static void gör(List liste) {
        int say=0;
        System.out.println("--------");
        say++;
        for (int b = 0; b <liste.size();b++) {

            System.out.println("çekilişteki kişiler"+""+"\n"+liste);

            System.out.println("--------");
        }
    }
    static void seç(List liste){
        Scanner scanner = new Scanner(System.in);
        Random rastgele = new Random();
        int b = rastgele.nextInt();
        System.out.println("Rastgele seçilen isim: " + liste.get(b));

    }

    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            List liste = new ArrayList();

            while (true) {

                System.out.println("yapmak istediğiniz işlemi seçiniz?1-kişi ekle 2-kişisil 3-kişileri gör 4-çekiliş yap 5-çıkış");
                int seç = scanner.nextInt();

                if (seç == 1) {
                    System.out.println("kaç kişi eklenecek?");
                    int c=scanner.nextInt();

                    for (int a = 0; a < c; a++) {

                        ekle(liste);
                        if (a == c) {
                            break;
                        }
                    }

                }


                else if (seç == 2) {
                    sil(liste);
                }
                else if (seç == 3) {

                    gör(liste);

                }
                else if (seç == 4) {
                    seç(liste);

                }
                else {
                    System.out.println("çıkış yapılıyor...");
                    break;
                }

            }


        }


    }


