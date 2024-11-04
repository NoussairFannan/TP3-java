public class Vehicule{
    Vehicule(){
    }
    public void testVitesse(int number) throws TropViteException {
        if(number>90) throw new TropViteException(number);
        System.out.println("Vitesse Normale");
    }
}
