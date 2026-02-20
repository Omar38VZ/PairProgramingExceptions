package Ejercicio3_4;
public class PruebaNumeroNegativo {

    // Método que puede lanzar la excepción
    public void verificarNumero(int numero) throws NumeroNegativoException {

        if (numero < 0) {
            throw new NumeroNegativoException("El número no puede ser negativo.");
        }

        System.out.println("El número es válido: " + numero);
    }

    public static void main(String[] args) {

        PruebaNumeroNegativo obj = new PruebaNumeroNegativo();

        try {
            obj.verificarNumero(-5); // Aquí la excepción
        } catch (NumeroNegativoException e) {

            System.out.println("Se capturó la excepción:");
            System.out.println(e.getMessage());
        }
    }
}