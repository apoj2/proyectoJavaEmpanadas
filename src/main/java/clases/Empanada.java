package clases;

public class Empanada {

    private String nombre;
    private String tipodeempanada;
    private int Preciodefabricacion;
    private int preciodeventa;

    private int cantidad;

    public Empanada(String mixtic, int i, int i1) {
    }

    public Empanada(String nombre, String tipodeempanada, int preciodefabricacion, int preciodeventa, int cantidad) {
        this.nombre = nombre;
        this.tipodeempanada = tipodeempanada;
        Preciodefabricacion = preciodefabricacion;
        this.preciodeventa = preciodeventa;
        this.cantidad = cantidad;
    }

    public Empanada(String nombre, String tipodeempanada, int preciodefabricacion, int preciodeventa) {
        this.nombre = nombre;
        this.tipodeempanada = tipodeempanada;
        Preciodefabricacion = preciodefabricacion;
        this.preciodeventa = preciodeventa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipodeempanada() {
        return tipodeempanada;
    }

    public void setTipodeempanada(String tipodeempanada) {
        this.tipodeempanada = tipodeempanada;
    }

    public int getPreciodefabricacion() {
        return Preciodefabricacion;
    }

    public void setPreciodefabricacion(int preciodefabricacion) {
        Preciodefabricacion = preciodefabricacion;
    }

    public int getPreciodeventa() {
        return preciodeventa;
    }

    public void setPreciodeventa(int preciodeventa) {
        this.preciodeventa = preciodeventa;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int fabricarEmpanada(){

        int cantidadTotal = this.getPreciodeventa() * this.getCantidad();

        return cantidadTotal;
    }

}
