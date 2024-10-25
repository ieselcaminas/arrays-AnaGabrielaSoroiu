import java.util.Scanner;

public class MarcoCadenas {
    public static int calcularMaximo(String[] cadenas) {
        int maxima;

        maxima = cadenas[0].length();
        for (int i = 1; i < cadenas.length; i++) {
            if (cadenas.length > maxima) {
                maxima = cadenas[i].length();
            }
        } return maxima;
    }

    public static String asteriscos(int maxima) {
        String estrellitas = "";
        for (int i = 0; i < maxima + 4; i++) {
            estrellitas += "*";
        }
        return estrellitas;
    }
    
    public static void main(String[] args) {
        String[] cadenas = new String[5];
        int maxima = 0;
        int asteriscos;

        System.out.println("Introduce 5 cadenas de texto:");
        Scanner miScanner;
        miScanner = new Scanner(System.in);

        for (int i = 0; i < cadenas.length; i++) {
            cadenas[i] = miScanner.next();
        }

        maxima = calcularMaximo(cadenas);

        System.out.println(asteriscos(maxima));

        for (int i = 0; i < cadenas.length; i++) {
            System.out.print("*" + " " + cadenas[i]);
            for (int j = cadenas[i].length(); j <= maxima ; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        System.out.println(asteriscos(maxima));
    }
}
