public class RacineCarreeException extends Exception{
    RacineCarreeException(int number){
        super("C'est une exception de type RacineCarreeException. Nombre négatif : " + number);
    }
}
