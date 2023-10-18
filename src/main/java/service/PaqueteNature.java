package service;

public class PaqueteNature extends Paquete{
    
    public PaqueteNature(IPlan planConPaquete) {
        super(720, 5, """
                           -Visita a Kuloa Ranch.
                           -Visita al Maui Ocean Center.
                           -Visita al Akaka Falls State Park.""", planConPaquete);
   }
       
    @Override
    public void DescripcionTotal() {
        this.getPlan().DescripcionTotal();
        System.out.println(getDescripcionPaquete());
        
    }
}
