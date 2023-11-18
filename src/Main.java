import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        final int POLOWA = 3;

        int zmiennaI;

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
        long liczbaLong = (long)liczbaInt;
        System.out.println("Nie jawne:   " + liczbaLong);

        float liczbaFloat = 3.9415F;
        liczbaLong = (long)liczbaFloat;
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
        System.out.println("Dzielenie: " + (float)a / (float)b);
        System.out.println("Mnożenie: " + a * b);
        System.out.println("Modulo: " + b + " ->  " + a % b);
    }
}