import java.util.Scanner;

public class HipotenusHesaplama {
    public static void main(String[] args) {
        int a, b;
        double c;

        Scanner scan = new Scanner(System.in);
        System.out.println("İlk kenarın uzunluğunu giriniz: ");
        a = scan.nextInt();

        System.out.println("İkinci kenarın uzunluğunu giriniz: ");
        b = scan.nextInt();

        c = Math.sqrt((a * a) + (b * b));
        /*
        String hipotenus = !(c<Math.abs(a-b) || c>Math.abs(a+b))?String.valueOf(c):"kenarlar hatali";

        String sonuc = hipotenus == "kenarlar hatali"?"Kenarlar Hatalı!":"hipotenus="+String.valueOf(c) ;
        */
        System.out.println("hipotenus= " + c);
    }
}
