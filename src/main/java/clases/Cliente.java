package clases;

public class Cliente {
    private  String nombre;
    private  String documento;
    private  String telefono;
    private  String medioPago;
    private  int    saldoDisponible;

    public Cliente() {
    }

    public Cliente(String nombre, String documento, String telefono, String medioPago, int saldoDisponible) {
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.medioPago = medioPago;
        this.saldoDisponible = saldoDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public int getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(int saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }


}
