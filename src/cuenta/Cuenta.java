
package cuenta;
import java.util.Scanner;
/**
 *
 * @author Fátima Jafer Iglesias
 */
public class Cuenta {
    
    private String titular;
    private double cantidad;
    private double cantidadTotal;
    private String texto = "Mdoficacion desde rusia";
  
    Cuenta(){
        
    }
    Cuenta(String titular, double cantidad){
        this.titular=titular;
        this.cantidad=cantidad;
        }

        public String getTitular() {
            return titular;
        }

        public double getCantidad() {
            return cantidad;
        }

        public void setTitular(String titular) {
            this.titular = titular;
        }

        public void setCantidad(double cantidad) {
            this.cantidad = cantidad;
        }
    
        public String toString(){
            String nombre="El titular se llama "+titular;
            return nombre;
        }
    
        public double ingresar(double cantidad){
            cantidadTotal=cantidadTotal+cantidad;
            System.out.println("Usted ha ingresado "+cantidad+" euros y su cantidad"
                    + "actual de la cuenta es de "+cantidadTotal+ "euros.");
            return cantidadTotal;    
        }
        public double retirar(double cantidad){
            cantidadTotal=cantidadTotal-cantidad;
            if(cantidadTotal<0){
               cantidadTotal=0;
            }
            System.out.println("Usted ha retirado "+cantidad+" euros y su cantidad "
                    + "actual de la cuenta es de "+cantidadTotal+ "euros.");
            return cantidadTotal;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String Titular;
        double Cantidad=0;
        int operacion;
        int continuar;
               
        System.out.println("Escriba el nombre del titular de la cuenta: ");
        Titular=sc.nextLine();
            Cuenta m=new Cuenta(Titular,Cantidad);
            
        do{
        System.out.println("Indique la cantidad con la que desea operar: ");
        Cantidad=sc.nextInt();
        
        System.out.println("Indique qué operación desea realizar:"
                + "\n(1)Ingresar\n(2)Retirar");
        operacion=sc.nextInt();
        
        System.out.println(m.toString());
        
        switch(operacion){
            case 1:
                if(Cantidad<0){
                    System.out.println("Error, ingrese una cantidad positiva.");
                }
                else{
                m.ingresar(Cantidad);
                }
            break;
            case 2:m.retirar(Cantidad);
            break;
            default:System.out.println("Indique una operación válida");
        }
            System.out.println("¿Desea realizar otra operación?\n(1)Si\n(2)No");
            continuar=sc.nextInt();
            sc.nextLine();
        }while(continuar==1);    
        
        
    }
    
}
