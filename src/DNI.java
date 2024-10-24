import java.util.Scanner;

public class DNI {
    public static char letraDNI (int dni) {
        final char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
                'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int resto = dni % 23;
        char letra = letras[resto];

        return letra;

    }
    public static void main(String[] args) {
        int dni;
        char letra;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número del DNI: ");
        dni = sc.nextInt();

        letra = letraDNI(dni);


        System.out.println(letra);

    }
}
