package Ejercicio_6;

public class FechaInvalidaExcepcion extends Exception{

    public FechaInvalidaExcepcion(String error){
        super(error);
    }

    public FechaInvalidaExcepcion(String error, Throwable causa){
        super(error, causa);
    }
}
