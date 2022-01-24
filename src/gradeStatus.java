
import java.util.Scanner;


public class gradeStatus {
    public static void main(String[] args) {
        int math, physıcs, turkısh, chem, musıc;
        double avarage;
        /*
        Kullanıcıdan tanımlanmış olan dersler için notları girmesini söyleyelim.

        Ortalamanın 55 ve üstü olup olmadığını kontrol edelip.

        Sınıf geçme veya kalma sonucunu çıkartalım.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz:");
        math = input.nextInt();

        System.out.print("Fizik notunuzu giriniz:");
        physıcs = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz:");
        turkısh = input.nextInt();

        System.out.print("Kimya notunuz girimiz");
        chem = input.nextInt();

        System.out.print("Müzik notunuz giriniz:");
        musıc = input.nextInt();

        int totalCalculatedLesson = 0;
        double totalCalculatedLessonPoınt = 0;


        if (math > 0 && math < 100) {
            totalCalculatedLesson++;
            totalCalculatedLessonPoınt += math;
        }

        if (physıcs > 0 && physıcs < 100) {
            totalCalculatedLesson++;
            totalCalculatedLessonPoınt += physıcs;
        }

        if (turkısh > 0 && turkısh < 100) {
            totalCalculatedLesson++;
            totalCalculatedLessonPoınt += turkısh;
        }

        if (chem > 0 && chem < 100) {
            totalCalculatedLesson++;
            totalCalculatedLessonPoınt += chem;
        }

        if (musıc > 0 && musıc < 100) {
            totalCalculatedLesson++;
            totalCalculatedLessonPoınt += musıc;
        }

        avarage = ( totalCalculatedLessonPoınt / totalCalculatedLesson);

        if (avarage >= 55) {
            System.out.print("Ortalamanız sınıfı geçmek için yeterlidir.");
        } else {
            System.out.println("Yetersiz ortalamdan dolayı sınıfta kaldınız");
        }

        System.out.println("Ortalamanız:" + avarage);
    }
}
