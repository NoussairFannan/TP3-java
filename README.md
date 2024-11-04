# TP3-java

## Introduction
Ce projet contient trois exercices en Java qui illustrent l'utilisation des exceptions personnalisées pour gérer différents cas d'erreur. 
Chaque exercice présente un cas où une exception personnalisée est définie.

## Exercice 1 : TropViteException
Ce premier exercice implémente une exception personnalisée TropViteException pour gérer les cas où la vitesse dépasse une limite donnée.
### Classes
- **TropViteException** : Hérite de `Exception` et indique qu'une vitesse est trop élevée.
- **Vehicule** : Contient une méthode `testVitesse` qui lance `TropViteException` si la vitesse dépasse 90.
- **Main** :La méthode main crée un objet Vehicule et utilise la methode testVitesse pour tester deux vitesses. Si la vitesse dépasse 90, une exception est levée et affichée en utilisant la méthode `getMessage` pour capturer l'erreur.
## Exercice 2 : RacineCarreeException
Dans ce dexieme exercice, l'exception personnalisée RacineCarreeException est implémentée pour vérifier que les nombres utilisés pour une racine carrée sont positifs.
### Classes
- **RacineCarreeException** : Hérite de `Exception` et signale qu'un nombre négatif a été utilisé pour calculer une racine carrée.
- **Calculateur** : Contient une méthode `testRacineCarree` qui lance `RacineCarreeException` si le nombre est négatif.
- **Main** : La méthode main crée un objet Calculateur et teste testRacineCarree avec un nombre négatif et un nombre positif. Le message d'erreur est affiché en cas de nombre négatif.
## Exercice 3 : NoteInvalideException
Le troisième exercice utilise une exception personnalisée NoteInvalideException pour vérifier que les notes scolaires sont valides, c'est-à-dire entre 0 et 20.
### Classes
- **NoteInvalideException** : Hérite de `Exception` et indique qu'une note est invalide (en dehors de l'intervalle 0-20).
- **Evaluateur** : Contient une méthode `verifierNote` qui lance `NoteInvalideException` si la note est en dehors de [0, 20].
- **Main** : La méthode main crée un objet Calculateur et teste testRacineCarree avec un nombre négatif et un nombre positif. Le message d'erreur et la pile d'appel sont affichés en cas de nombre négatif en utilisant la methode `printStackTrace`.
## Conclusion
Ce projet démontre l'utilisation d'exceptions personnalisées en Java pour une gestion efficace des erreurs.
