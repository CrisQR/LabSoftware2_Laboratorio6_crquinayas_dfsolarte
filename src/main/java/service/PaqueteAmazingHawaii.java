package service;

public class PaqueteAmazingHawaii extends Paquete{
    
    public PaqueteAmazingHawaii(IPlan planConPaquete) {
        super(931, 3, """
                           -Escalada en Waipio Valley.
                           -Surfing en las playas Waikiki o Hanalei Bay.
                           -Buceo en Hanauma Bay.""", planConPaquete);
   }
    
    @Override
    public void DescripcionTotal() {
        this.getPlan().DescripcionTotal();
        System.out.println(getDescripcionPaquete());
    }
    
}
