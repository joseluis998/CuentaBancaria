package operaciones;
import java.util.Scanner;
public class Transacciones extends Cuenta{
        //Clase Scanner
        Scanner sc = new Scanner (System.in);
        //Objeto de Clase Cuenta
        Cuenta ob = new Cuenta();
        //Segundo Objeto de Clase Cuenta
        //Cuenta ob2 = new Cuenta();
        //Atributos de Clase
        String nombre;
        String noCuenta;
        double interes, saldo;
        
        //Metodo Registro de cuenta
    public void RegistroCuenta(){        
        System.out.println("Registro de Cuenta:");   
        System.out.print("Ingresa Nombre: ");
        ob.setNombreCliente(nombre);
        sc.nextLine();
        System.out.print("Ingresa No.Cuenta: ");
        ob.setNoCuenta(noCuenta);
        sc.nextLine();
        System.out.print("Ingresa Interes: ");
        ob.setTinteres(interes);
        sc.nextLine();
        System.out.print("Ingresa Saldo: ");
        ob.setSaldo(saldo);
        sc.nextLine();

        System.out.println("\n\n");  
    }
     
    //Metodo Mostrar datos
    public void MostrarDatos(){
        System.out.println("Cuenta: \n");
        System.out.println("Nombre: " + ob.getNombreCliente());
        System.out.println("No.Cuenta: "+ob.getNoCuenta());
        System.out.println("Interes: " + ob.getTinteres());
        System.out.println("Saldo: "+ob.getTinteres());
    }
    
    
    
}
