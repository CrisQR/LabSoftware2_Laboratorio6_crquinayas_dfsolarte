package service;

public class PlanBase implements IPlan{
    private final double precio;
    private final int duracion;
    private final String descripcion;
    
    public PlanBase() {
        this.precio = 7000;
        this.duracion = 5;   
        this.descripcion = """
                           -Tiquetes aereos.
                           -Hotel en habitacion estandar.
                           -Alimentacion.
                           -Vuelta a la isla.
                           -Recepcion con lei hawaiano y camiseta de Millonarios (es el equipo favorito de los nativos).""";
    }

    public double getPrecio() {
        return precio;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public void DescripcionTotal() {
        System.out.println("El plan contiene:");
        System.out.println(descripcion);
    }

    @Override
    public double calcularTotal() {
        return this.getPrecio();
    }


}
