package anna.ruiz.ejerciciolistacompra.Modelos;

import java.io.Serializable;

public class Producto implements Serializable {
    private String nombre;
    private float precio;
    private int cantidad;
    private float precioTotal;


    //CONSTRUCTORES

    public Producto() {
    }

    public Producto(String nombre, float precio, int cantidad, float precioTotal) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.precioTotal = precioTotal;
    }

    //GETTERS Y SETTERS


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }


    //ToString

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                ", precioTotal=" + precioTotal +
                '}';
    }
}
