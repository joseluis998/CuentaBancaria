/* 
Escribe una clase Cuenta para representar una cuenta bancaria. Los datos de la cuenta son: 
nombre del cliente (String), número de cuenta (String), tipo de interés (double) y saldo (double).
La clase contendrá los siguientes métodos:
Constructor por defecto
Constructor con todos los parámetros
Constructor copia.
Métodos setters/getters para asignar y obtener los datos de la cuenta.

*Métodos ingreso y reintegro. 
Un ingreso consiste en aumentar el saldo en la cantidad que se indique. 
Esa cantidad no puede ser negativa. 
Un reintegro consiste en disminuir el saldo en una cantidad pero antes se debe comprobar que hay saldo suficiente. 

La cantidad no puede ser negativa. 
Los métodos ingreso y reintegro devuelven true si la operación se ha podido realizar o false en caso contrario.

'Método transferencia' que permita pasar dinero de una cuenta a otra siempre que en la cuenta de origen haya dinero 
suficiente para poder hacerla. Ejemplo de uso del método transferencia:
cuentaOrigen.transferencia(cuentaDestino, importe);
que indica que queremos hacer una transferencia desde cuentaOrigen a cuentaDestino del importe indicado.
Prueba el funcionamiento de la clase Cuenta con este main:  */
package control;
import operaciones.Transacciones;
import java.util.Scanner;
import operaciones.Transacciones;
//Clase Main para controlar todo 
public class Control {
    public static void main(String[] args) {
        //Clase Scanner
        Scanner sc = new Scanner (System.in);
        //Atributos
        int cant=0, opc=0;
        String nombre, noCuenta;
        double interes, saldo;
        boolean verificar;
        
        //Arreglo de Objetos
        Transacciones cuenta1 = new Transacciones();
         
        do{
        verificar=false;    
        System.out.println("Bievenido a Banco Jose Luis\n"
                + "Seleccione una opcion: \n1.-Registrar Cuenta\n2.-Mostrar Cuenta\n3.-Ingresar Dinero(Ingreso)\n"
                + "4.-Sacar Dinero(Reintegro)\n5.-Transferencia\n6.-Salir\n");
        try{
            opc=sc.nextInt();
        }catch(Exception e){
            sc.next();
            verificar=true;
        }
        switch(opc){
            case 1:     cuenta1.RegistroCuenta();
                break;
            case 2:     cuenta1.MostrarDatos();
               break;
            case 3:
               break;
            case 4:
               break;
            case 5:
               break;
            case 6:     System.out.println("Fin del Programa...\n");
               break;
            default:    System.out.println("Opcion no valida, intenta nuevamente\n");
        }
        }while(opc!=6 || verificar!=false);
        
        
        
          
        
           
            
            
            
            
            
            
            
            
            
            
            
    }
}
