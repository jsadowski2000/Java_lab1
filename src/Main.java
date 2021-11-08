import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */
        double liczbaA;
        double liczbaB;
        double liczbaC;
        Scanner wej1 = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę:");
        liczbaA = wej1.nextDouble();
        System.out.println("Podaj drugą liczbę:");
        liczbaB = wej1.nextDouble();
        System.out.println("Podaj trzecia liczbę:");
        liczbaC = wej1.nextDouble();

        System.out.println(liczbaA * liczbaB / liczbaC);
        System.out.println((liczbaA + liczbaB) / liczbaC);
        System.out.println((liczbaA - liczbaB) / liczbaC);
        System.out.println(2*liczbaA + liczbaB / liczbaC);
        System.out.println(liczbaA + liczbaB + liczbaC);
        boolean result = liczbaA == liczbaB;
        System.out.println(result);
        System.out.println(liczbaA >= 0);
        System.out.println(liczbaB!= 10);


    }
}
