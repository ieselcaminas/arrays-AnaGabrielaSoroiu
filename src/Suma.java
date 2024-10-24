public class Suma {
    public static int sumaPositivos(int[] numeros) {
        int sumaPo = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                 sumaPo += numeros[i];
            }
        } return sumaPo;
    }

    public static int sumaNegativos(int[] numeros) {
        int sumaNeg = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                sumaNeg += numeros[i];
            }
        } return sumaNeg;
    }

    public static void main(String[] args) {
        int [] numeros = {-8, 5, -14, 10};
        int sumaP;
        int sumaN;

        sumaP = sumaPositivos(numeros);
        System.out.println("La suma de los positivos es: " + sumaP);
        sumaN = sumaNegativos(numeros);
        System.out.println("La suma de los negativos es: " + sumaN);
    }
}
