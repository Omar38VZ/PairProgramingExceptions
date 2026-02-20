package Ejercicio1_2;
public class Ejercicio1_2 {
    public static void main(String[] args) throws Exception {
        try { 
                throw new Exception ("Error mío"); 

        }catch (Exception e) { 
            System.out.println("Mensaje de excpeción: " + e.getMessage());
            
            System.out.println("\nStack trace: ");
            e.printStackTrace();
            
        } finally { 
            System.out.println("\nBloque finally ejecutado");
        }
    }
}
