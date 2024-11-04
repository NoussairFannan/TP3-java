public class Main{

    public static void main(String[] args) {
        Calculateur calculateur = new Calculateur();
        try {
            calculateur.testRacineCarre(-5);  // Devrait lancer une exception
        } catch (RacineCarreeException e) {
            System.out.println(e.getMessage());
        }

        try {
            calculateur.testRacineCarre(25);  // Pas d'exception ici
        } catch (RacineCarreeException e) {
            System.out.println(e.getMessage());
        }
    }
}
