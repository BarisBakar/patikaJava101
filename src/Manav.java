import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        double Armut = 2.14, Elma = 3.67, Domates = 1.11, Muz = 0.95, Patlican = 5.00;
        double mArmut, mElma, mDomates, mMuz, mPatlican, toplam;

        Scanner scan = new Scanner(System.in);

        System.out.println("Armut Kaç Kilo ? ");
        mArmut = scan.nextDouble();

        System.out.println("Elma Kaç Kilo ? ");
        mElma = scan.nextDouble();

        System.out.println("Domates Kaç Kilo ? ");
        mDomates = scan.nextDouble();

        System.out.println("Muz Kaç Kilo ? ");
        mMuz = scan.nextDouble();

        System.out.println("Patlıcan Kaç Kilo ? ");
        mPatlican = scan.nextDouble();

        toplam = (Armut*mArmut)+(Elma*mElma)+(Domates*mDomates)+(Muz*mMuz)+(Patlican*mPatlican);

        System.out.println("Toplam Tutar :"+toplam);
    }
}
