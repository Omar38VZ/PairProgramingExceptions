package Ejercicio_6;

public class ValidadorFecha{

    public void validarAnio(int anio){
        if (anio < 0){
            throw new IllegalArgumentException("El año no puede ser negativo: " + anio);
        }
    }

    public void validarFecha(int dia, int mes, int anio) throws FechaInvalidaExcepcion{

        try {
            validarAnio(anio);
        } catch (IllegalArgumentException e){
            throw new FechaInvalidaExcepcion("La fecha tiene un año invalido: " + anio, e);
        }
    }

    public static void main(String[] args) {
        ValidadorFecha validador = new ValidadorFecha();

        System.out.println("\n=== CASO: Año negativo ===");

        try {
            validador.validarFecha(10, 5, -1990);
        } catch (FechaInvalidaExcepcion e) {
            System.out.println("Error principal: " + e.getMessage());
            System.out.println("Causa raíz: " + e.getCause().getMessage());
            System.out.println("\n=== Stack Trace ===");
            e.printStackTrace();

        }
    }
}
