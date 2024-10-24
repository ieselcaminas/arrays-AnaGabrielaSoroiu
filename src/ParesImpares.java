public class ParesImpares {
    public static int pares (int[] numeros) {
        int pares = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
            }
        } return pares;
    }

    public static int impares (int[] numeros) {
        int impares = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                impares++;
            }
        } return impares;
    }

    public static void main(String[] args) {
        int [] numeros = {5, 7, 9, 22, 34, 50, 78};
        int pares;
        int impares;

        pares = pares(numeros);
        System.out.println("Hay " + pares + " pares.");
        impares = impares(numeros);
        System.out.println("Hay " + impares + " impares.");

    }
}
