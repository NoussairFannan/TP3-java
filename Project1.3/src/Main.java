public class Main {
    public static void main(String[] args) {
        Evaluateur evaluateur = new Evaluateur();
        try {
            evaluateur.verifierNote(25);
        } catch (NoteInvalideException e) {
            e.printStackTrace();
        }

        try {
            evaluateur.verifierNote(15);
        } catch (NoteInvalideException e) {
            e.printStackTrace();
        }
    }
}