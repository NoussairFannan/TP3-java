public class NoteInvalideException extends Exception{
    NoteInvalideException(int nombre){
        super("Exception de type NoteInvalideException. Note invalide : " +nombre);
    }

}
