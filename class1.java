
package encapsulamiento;

public class class1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Class2 objeto1=new Class2();
        objeto1.setSaldo(35);
        System.out.println("El saldo es: "+objeto1.getSaldo());
        
        objeto1.setNombre("Matt");
        System.out.println("El nombre es: "+objeto1.getNombre());
    }
    
}
