import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        final int POLOWA = 3;

        int zmiennaI = 10;

        zmiennaI = Integer.MAX_VALUE;
        long zmiennaL = 78787879L;
        float zmiennaF = 34.3434F;
        char zmiennaC = 'x';

        String zmiennaS = "Simple txt";
        char zmiennaC1 = zmiennaS.charAt(2);

        System.out.println(zmiennaC1);
        System.out.println(zmiennaL % 2);
        System.out.println(Math.pow(8.0, 2.0));
        System.out.println(true);

        // rzutowanie

        int liczbaInt = 456;
        long liczbaLong = (long) liczbaInt;   // ta tłumaczona jest sama
        System.out.println("Nie jawne:   " + liczbaLong);

        float liczbaFloat = 3.9415F;
        liczbaLong = (long) liczbaFloat;    // tłumaczona jest sama
        System.out.println("Jawne: " + liczbaLong);


        // Liczba na String

        String text = String.valueOf(liczbaLong);
        String text2 = Long.toString(liczbaLong);
        System.out.println("Liczba na String:  " + text + "  " + text2);

        //Parsowanie

        String text3 = "123.6";
        float liczbaFloat3 = Float.parseFloat(text3);
        System.out.println("Parsowanie:  " + (liczbaFloat3 + 100.0F));

        // Kalkulator


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj arg a");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Podaj arg b");
        int b = scanner.nextInt();
        System.out.println("Dodawanie: " + (a + b));
        System.out.println("Odejmowanie: " + (a - b));
        System.out.println("Dzielenie: " + (float) a / (float) b);
        System.out.println("Mnożenie: " + a * b);
        System.out.println("Modulo: " + b + " ->  " + a % b);

        // IF

        if (b != 0) System.out.println("Uwaga");
        if (b == 0) {
            System.out.println("Warning");
        }


        int aa = 0;
        if (a > 0) {
            System.out.println("Liczba dodatnia");
        } else if (a == 0) {
            System.out.println("Dokładnie zero");
        } else {
            System.out.println("Liczba ujemna");
        }

        int age = 16;
        String result = age < 18 ? "Za młoda" : "Dojrzała";
        System.out.println(result);


        // Switch

        int liczbaa = 7;
        switch (liczbaa) {
            case 12:
                System.out.println("Liczba 12");
                break;
            case 10:
                System.out.println("Liczba 10");
                break;
            case 7:
            case 8:
                System.out.println("Liczba 7 lub 8");
                break;
            default:
                System.out.println("Jakaś liczba");
                break;
        }
    }

}