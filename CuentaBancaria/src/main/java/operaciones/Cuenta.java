/* Clase de Cuenta Bancaria Base*/
/* Clase Abstracta Padre -- Clase SuperPadre */
package operaciones;

public class Cuenta {
    //Atributos de Clase
    private String nombreCliente;
    private String noCuenta;
    private double Tinteres;
    private double saldo;
    
    //Constructor por defecto
    public Cuenta(){
        this.nombreCliente = "";
        this.noCuenta = "";
        this.Tinteres = 0;
        this.saldo = 0;
    }

    //Constructor Parametros --Ordinario--
    public Cuenta(String nombreCliente, String noCuenta, double Tinteres, double saldo) {
        this.nombreCliente = nombreCliente;
        this.noCuenta = noCuenta;
        this.Tinteres = Tinteres;
        this.saldo = saldo;
    }
    
    //Constructor Copia
    public Cuenta (Cuenta cuenta){
        this.nombreCliente = cuenta.nombreCliente;
        this.noCuenta = cuenta.noCuenta;
        this.Tinteres = cuenta.Tinteres;
        this.saldo = cuenta.saldo;
    }

    //Getters y Setters
    public String getNombreCliente() {
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public String getNoCuenta() {
        return noCuenta;
    }
    public void setNoCuenta(String noCuenta) {
        this.noCuenta = noCuenta;
    }
    public double getTinteres() {
        return Tinteres;
    }
    public void setTinteres(double Tinteres) {
        this.Tinteres = Tinteres;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta: \n" + "Nombre: " + nombreCliente + "\nNo. Cuenta: " + noCuenta + "\nInteres: " 
                + Tinteres + "\nSaldo: "+ saldo + "\n";
    }
    
    
    
    
    
    
    
}
