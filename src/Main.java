import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // ćw.2 */



        //  zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */
        int zmiennaInt = 7;
        double zmiennaDouble = 2.5;
        char znak = 'A';
        byte liczbaByte = 123;
        long wielkaLiczba;
        wielkaLiczba = 100000L;
        boolean wartosLogiczna = true;


        System.out.println("zmienna int = " + zmiennaInt);
        System.out.println("zmienna double = " + zmiennaDouble);
        System.out.println("Znak char = " + znak);
        System.out.println("Liczba Byte = " + liczbaByte);
        System.out.println("Wielka Liczba = " + wielkaLiczba);
        System.out.println("Wartosc logiczna = " + wartosLogiczna);

        //
        //    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
        //   mnożenia, dziealenia i modulo na zmiennych:



        //   a) liczbaA i liczbaB, dowolne liczby calkowite (int),
        int liczbaA;
        int liczbaB;
        Scanner wej = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę:");
        liczbaA = wej.nextInt();
        System.out.println("Podaj drugą liczbę:");
        liczbaB = wej.nextInt();
        System.out.println(liczbaA + liczbaB);
        System.out.println(liczbaA - liczbaB);
        System.out.println(liczbaA * liczbaB);
        System.out.println(liczbaA / liczbaB);
        System.out.println(liczbaA % liczbaB);

        //   b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
        double liczbaX;
        double liczbaY;
        Scanner wej1 = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę:");
        liczbaX = wej1.nextDouble();
        System.out.println("Podaj drugą liczbę:");
        liczbaY = wej1.nextDouble();
        System.out.println(liczbaX + liczbaY);
        System.out.println(liczbaX - liczbaY);
        System.out.println(liczbaX * liczbaY);
        System.out.println(liczbaX / liczbaY);
        System.out.println(liczbaX % liczbaY);




    }
}
