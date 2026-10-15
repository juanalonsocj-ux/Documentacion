public class factorial {

    /**
     * Calcula el factorial de un numero entero positivo.
     *
     * @param numero Numero entero positivo (int).
     * @return El factorial del numero (int).
     */
    public static int calcularFactorial(int numero) {
        int resultado = 1;

        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }

        return resultado;
    }
}