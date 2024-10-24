public class Minimo {
    public static int maximo (int [] numeros) {
        int min = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < min) {
                min = numeros[i];
            }
        } return min;

    }

    public static void main(String[] args) {
        int [] numeros = {5, 8, 10, 56, 42, 7, 33, 57, 92, 0};
        int min;

        min = maximo(numeros);

        System.out.println(min);
    }
}
