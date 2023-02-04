public class Main {

    public static void main(String[] args) {


        String[] ogrenciler=new String[4];
        ogrenciler[0]="murat";
        ogrenciler[1]="hasan";
        ogrenciler[2]="emre";
        ogrenciler[3]="can";


        for(int i=0;i<ogrenciler.length;i++){

            System.out.println(ogrenciler[i]);
        }

        System.out.println("_____________");

        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }


    }
}
