import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      int mat, fizik, turkce, kimya, muzik;
      double ortalama;

      Scanner input = new Scanner(System.in);

      System.out.print("Matematik Notunuzu Girniz: ");
      mat = input.nextInt();
      if (mat < 0 || mat > 100) {
        System.out.println("Geçersiz bir sayı girdiniz.");
        System.out.println("Lütfen tekrar deneyin: ");
        mat = input.nextInt();
    }

      System.out.print("Fizik Notunuzu Girniz: ");
      fizik = input.nextInt();
      if (fizik < 0 || fizik > 100) {
        System.out.println("Geçersiz bir sayı girdiniz.");
        System.out.println("Lütfen tekrar deneyin: ");
        fizik = input.nextInt();
    }

      System.out.print("Türkçe Notunuzu Girniz: ");
      turkce = input.nextInt();
      if (turkce < 0 || turkce > 100) {
        System.out.println("Geçersiz bir sayı girdiniz.");
        System.out.println("Lütfen tekrar deneyin: ");
        turkce = input.nextInt();
    }

      System.out.print("Kimya Notunuzu Girniz: ");
      kimya = input.nextInt();
      if (kimya < 0 || kimya > 100) {
        System.out.println("Geçersiz bir sayı girdiniz.");
        System.out.println("Lütfen tekrar deneyin: ");
        kimya = input.nextInt();
    }

      System.out.print("Müzik Notunuzu Girniz: ");
      muzik = input.nextInt();
      if (muzik < 0 || muzik > 100) {
        System.out.println("Geçersiz bir sayı girdiniz.");
        System.out.println("Lütfen tekrar deneyin: ");
        muzik = input.nextInt();
    }

      ortalama = (mat + fizik + turkce + kimya + muzik) / 5;
      if (ortalama < 55) {
          System.out.println("Ortalamanız: " + ortalama);
          System.out.println("Sınıfta Kaldınız.");
      } else {
          System.out.println("Ortalamanız: " + ortalama);
          System.out.println("Sınıfı Geçtiniz.");
      }
    }
}
