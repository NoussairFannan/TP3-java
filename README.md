# TP3-java

## Introduction
Ce projet contient trois exercices en Java qui illustrent l'utilisation des exceptions personnalisées pour gérer différents cas d'erreur. 
Chaque exercice présente un cas où une exception personnalisée est définie.

## Exercice 1 : TropViteException
Ce premier exercice implémente une exception personnalisée TropViteException pour gérer les cas où la vitesse dépasse une limite donnée.
### Classes
- **TropViteException** : Hérite de `Exception` et indique qu'une vitesse est trop élevée.
```java
public class TropViteException extends Exception{
    TropViteException(int number) {
        super("C'est une exception de type TropViteException. Vitesse en cause : " + number);
    }
}
```
- **Vehicule** : Contient une méthode `testVitesse` qui lance `TropViteException` si la vitesse dépasse 90.
```java
public class Vehicule{
    Vehicule(){
    }
    public void testVitesse(int number) throws TropViteException {
        if(number>90) throw new TropViteException(number);
        System.out.println("Vitesse Normale");
    }
}
```
- **Main** :La méthode main crée un objet Vehicule et utilise la methode testVitesse pour tester deux vitesses. Si la vitesse dépasse 90, une exception est levée et affichée en utilisant la méthode `getMessage` pour capturer l'erreur.
```java
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
```
## Exercice 2 : RacineCarreeException
Dans ce dexieme exercice, l'exception personnalisée RacineCarreeException est implémentée pour vérifier que les nombres utilisés pour une racine carrée sont positifs.
### Classes
- **RacineCarreeException** : Hérite de `Exception` et signale qu'un nombre négatif a été utilisé pour calculer une racine carrée.
```java
public class RacineCarreeException extends Exception{
    RacineCarreeException(int number){
        super("C'est une exception de type RacineCarreeException. Nombre négatif : " + number);
    }
}
```
- **Calculateur** : Contient une méthode `testRacineCarree` qui lance `RacineCarreeException` si le nombre est négatif.
```java
public class Calculateur {
    Calculateur() {
    }

    public void testRacineCarre(int number) throws RacineCarreeException {
        if (number < 0) throw new RacineCarreeException(number);
        else System.out.println("Racine valable :" + Math.sqrt(number));
    }
}
```
- **Main** : La méthode main crée un objet Calculateur et teste testRacineCarree avec un nombre négatif et un nombre positif. Le message d'erreur est affiché en cas de nombre négatif.
```java
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
```
## Exercice 3 : NoteInvalideException
Le troisième exercice utilise une exception personnalisée NoteInvalideException pour vérifier que les notes scolaires sont valides, c'est-à-dire entre 0 et 20.
### Classes
- **NoteInvalideException** : Hérite de `Exception` et indique qu'une note est invalide (en dehors de l'intervalle 0-20).
```java
public class NoteInvalideException extends Exception{
    NoteInvalideException(int nombre){
        super("Exception de type NoteInvalideException. Note invalide : " +nombre);
    }

}
```
- **Evaluateur** : Contient une méthode `verifierNote` qui lance `NoteInvalideException` si la note est en dehors de [0, 20].
```java
public class Evaluateur {
    Evaluateur(){}
    public void verifierNote(int nombre) throws NoteInvalideException {
        if(nombre<0 || nombre>20) throw new NoteInvalideException(nombre);
        else System.out.println("Note Valide");
    }
}
```
- **Main** : La méthode main crée un objet Calculateur et teste testRacineCarree avec un nombre négatif et un nombre positif. Le message d'erreur et la pile d'appel sont affichés en cas de nombre négatif en utilisant la methode `printStackTrace`.
```java
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
```
## Conclusion
Ce projet démontre l'utilisation d'exceptions personnalisées en Java pour une gestion efficace des erreurs.
