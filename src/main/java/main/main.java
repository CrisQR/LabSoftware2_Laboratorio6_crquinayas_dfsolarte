package main;
import service.*;

public class main {

    public static void main(String[] args) {
        
        PlanBase plan1 = new PlanBase();
        
        PaquetePearHarbor PlanBaseYPearHarbor = new PaquetePearHarbor(plan1);
        
        PaqueteNature PlanBaseYPearHarborYNature = new PaqueteNature(PlanBaseYPearHarbor);
        
        PlanBaseYPearHarborYNature.DescripcionTotal();
        System.out.print("Precio total del plan: $" + PlanBaseYPearHarborYNature.calcularTotal());
        
        
    }
}
