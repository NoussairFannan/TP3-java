public class Evaluateur {
    Evaluateur(){}
    public void verifierNote(int nombre) throws NoteInvalideException {
        if(nombre<0 || nombre>20) throw new NoteInvalideException(nombre);
        else System.out.println("Note Valide");
    }
}
