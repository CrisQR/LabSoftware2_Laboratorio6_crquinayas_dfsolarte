package service;

public class PaquetePearHarbor extends Paquete{
    
    public PaquetePearHarbor(IPlan planConPaquete) {
        super(653, 2, """
                           -Visita al museo Pear Harbor.
                           -Visita al palacio Iolani.
                           -Visita al museo Bishop.
                           -Visita al USS Arizona Memorial.""", planConPaquete);
   }

    @Override
    public void DescripcionTotal() {
        this.getPlan().DescripcionTotal();
        System.out.println(getDescripcionPaquete());
    }
}
