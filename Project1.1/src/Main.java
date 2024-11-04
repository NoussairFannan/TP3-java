public class Main {
    public static void main(String[] args){
        Vehicule v=new Vehicule();
        try {
            v.testVitesse(80);
            v.testVitesse(100);
        } catch (TropViteException e) {
            System.out.println(e.getMessage());
        }
    }
}