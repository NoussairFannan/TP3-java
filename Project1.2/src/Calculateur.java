public class Calculateur {
    Calculateur() {
    }

    public void testRacineCarre(int number) throws RacineCarreeException {
        if (number < 0) throw new RacineCarreeException(number);
        else System.out.println("Racine valable :" + Math.sqrt(number));
    }
}
