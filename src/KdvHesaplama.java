import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {

        double tutar, kdvOran, kdvliTutar;

        Scanner scan = new Scanner(System.in);

        System.out.println("Tutar giriniz:" );
        tutar = scan.nextDouble();

        kdvOran = tutar < 1000 ? 0.18 : 0.08;

        System.out.println("Tutar= "+ tutar);
        System.out.println("KDV Oranı= "+ kdvOran);
        System.out.println("KDV'li tutar= "+ tutar*(kdvOran+1));
    }


}
