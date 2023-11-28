public class Venta {
    Producto producto;
    int cantidad;
    public Venta(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    //Metodo adicional 
    public int pagoTotal(){
        return cantidad*producto.precio;     
    }

    
}
