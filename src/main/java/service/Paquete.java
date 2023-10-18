package service;

public abstract class Paquete implements IPlan{
    private double precioPaquete = 0;
    private int duracionPaquete = 0;
    private String descripcionPaquete;
    private IPlan plan;
    
    public Paquete() {
    }
    
    public Paquete(double precio, int duracion, String descripcion, IPlan planConPaquete) {
        this.precioPaquete = precio;
        this.duracionPaquete = duracion;
        this.descripcionPaquete = descripcion;
        this.plan = planConPaquete;
    }

    public double getPrecioPaquete() {
        return precioPaquete;
    }

    public void setPrecioPaquete(double precioPaquete) {
        this.precioPaquete = precioPaquete;
    }

    public int getDuracionPaquete() {
        return duracionPaquete;
    }

    public void setDuracionPaquete(int duracionPaquete) {
        this.duracionPaquete = duracionPaquete;
    }

    public String getDescripcionPaquete() {
        return descripcionPaquete;
    }

    public void setDescripcionPaquete(String descripcionPaquete) {
        this.descripcionPaquete = descripcionPaquete;
    }

    public IPlan getPlan() {
        return plan;
    }

    @Override
    public double calcularTotal() {
        return this.getPrecioPaquete() + this.getPlan().calcularTotal();
    }
    
   
    
    
}
