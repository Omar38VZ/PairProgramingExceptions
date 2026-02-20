package Ejercicio_5;

public class NumeroNegativoException extends Exception {  //la excepción personalizada es para manejar casos específicos de números negativos

    public NumeroNegativoException(String mensaje) {
        super(mensaje);
    }
}

