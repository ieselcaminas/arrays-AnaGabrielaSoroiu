public class Maximo {
    public static int maximo (int [] numeros) {
        int max = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
        } return max;

    }

    public static void main(String[] args) {
        int [] numeros = {5, 8, 10, 56, 42, 7, 33, 57, 92, 0};
        int max;

        max = maximo(numeros);

        System.out.println(max);
    }
}
