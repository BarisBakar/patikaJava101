import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat, fiz, kim, tur, tar, muz;
        Scanner scan = new Scanner(System.in);
        System.out.println("matematik notu:");
        mat = scan.nextInt();

        System.out.println("fizik notu:");
        fiz = scan.nextInt();

        System.out.println("kimya notu:");
        kim = scan.nextInt();

        System.out.println("turkce notu:");
        tur = scan.nextInt();

        System.out.println("tarih notu:");
        tar = scan.nextInt();

        System.out.println("muzik notu:");
        muz = scan.nextInt();

        int sonuc = (mat + fiz + kim + tur + tar + muz);
        double ort = sonuc / 6;

        System.out.println("ortalamanız: " + ort);
        System.out.println(ort>=60?"gectiniz":"kaldiniz");
    }
}
