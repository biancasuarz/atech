public class Programa {

    public static void main(String[] args) {
        char[][] minhaMatriz = {
            {'1', '0', '1', '0', '0'},
            {'1', '0', '1', '1', '1'},
            {'1', '1', '1', '1', '1'},
            {'1', '0', '0', '1', '0'}
        };

        int resultado = MatrizBinaria.encontreMaiorRetangulo(minhaMatriz);
        System.out.println("A maior área é: " + resultado);
    }
}
