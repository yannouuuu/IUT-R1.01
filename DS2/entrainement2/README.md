Qu'est-ce que c'est ?
======

Cette archive contient des exercices de révision groupés par type / catégorie.

Chaque fichier .java correspond à une catégorie de problèmes (exercices) qui se résolvent de manière similaire les uns aux autres. 

Chaque fichier .java est structuré ainsi:

- une introduction sur la catégorie d'exercices
- une liste d'exercices de TD/TP qui font partie de cette catégorie
- quelques rappels de solutions d'exercices de TD/TP
- quelques **Indications** sur la manière de résoudre les exercices du fichier
- une liste de nouveaux exercices (avec tests) pour vous entrainer

Comment utiliser l'archive ?
======

L'objectif est de vous aider à renforcer vos apprentissage en **répétant** (càd en résolvant plusieurs exercices similaires les uns après les autres).

- Choisir une fichier d'exercices (càd une catégorie). Voir un ordre suggéré ci-dessous.
- Lire les explications en introduction. Si elles sont trop abstraites pour vous et vous ne les comprenez pas complètement, ce n'est pas grave, continuez. Vous pourrez y revenir plus tard.
- Lire les rappels de solutions d'exercices de TD/TP, que vous devez comprendre et être capable de refaire.
- Lire les **Indications** et faire le lien avec les rappels de solutions.
- En utilisant les indications, faire tous les exercices du fichier avant de passer à une autre fichier. 
  En cas de difficultés, commencer par refaire les exercices de TD/TP de cette catégorie pour lesquels vous avez une solution.

Parfois les derniers exercices d'un fichier sont plus compliqués. 
Si vous êtes vraiment bloqué·e, passez à une autre fichier. 
Par contre, sauter souvent d'une fichier à un autre n'a pas beaucoup d'intérêt.

Ordre suggéré pour vous entrainer
-------

1. Map.java
2. Reduce.java
3. ReduceAvecFiltrage.java
4. Find.java
5. MapAvecFiltrage.java
6. VisitePlusieursParTour.java
7. ManipulationSimultanee.java

Conclusion
======

Vous avez abordé différents exercices vus en TD/TP ou similaires, mais regroupés dans la même catégorie lorsque leurs solutions utilisent la même méthode.

Pour aborder un nouvel exercice (en DS ou CTP), qui manipule des séquecnes (tableaux, des chaine de caractères, intervalle) vous pouvez essayer de:

1. trouver une catégorie à laquelle le problème appartient,
2. se rappeler d'un problème typique de cette catégorie que vous savez résoudre,
3. adapter sa solution pour le nouveau problème.

Voici un résumé des caractéristiques des catégroies:

- l'entrée est une séquence et la sortie est une séquence => catégorie Map (exemple typique: String toString (int[] tab))
    + certains éléments de l'entrée ne sont pas gardés dans la sortie => catégorie MapAvecFiltrage
- l'entrée est une séquence et la sortie est une valeur obtenue en combinant les valeurs en entrée => catégorie Reduce (exemple typique : int somme (int[] tableauNombres))
    + certains éléments de l'entrée ne participent pas à la construction de la sortie => catégorie ReduceAvecFiltrage (exemple typique : int nombreOccurrences (String mot, char lettre))
- l'entrée est une séquence et la sortie est ou bien un élément de la séquence satisfaisant une condition, ou bien un booléan indiquant si certains, aucun ou tous les éléments satisfont une condition => catégorie Find (exemples typiques : boolean estPresent (int[] tab, int valeur) ; boolean aucunPositif (int[] tab) ; boolean tousPositifs (int[] tab))

Notez que certains problèmes plus ont des aspects de plusieurs catégories; il faudrait alors combiner les différentes techniques pour les résoudre.
