import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inter = new Scanner(System.in);

        System.out.println("Enter name, surname, age and index number :");

        System.out.println("Enter name: ");
        String name = inter.nextLine();
        System.out.println("Enter Surname: ");
        String surname = inter.nextLine();
        System.out.println("Enter age: ");
        int age = inter.nextInt();
        System.out.println("Enter Indeks number: ");
        int indeks = inter.nextInt();

        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Indeks: " + indeks);
        System.out.printf("Name is:  %s",name,);


        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */


        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */

    }
}
