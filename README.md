<br/>
<p align="center">
    <picture>
        <source media="(prefers-color-scheme: dark)" srcset="https://github.com/yannouuuu/IUT-SAE1.01/raw/main/.github/assets/header_univlille_light.png" width="200px">
        <img alt="UnivLilleLogo" src="https://github.com/yannouuuu/IUT-SAE1.01/raw/main/.github/assets/header_univlille_dark.png" width="200px">
    </picture>
  <h1 align="center">IUT-R1.01</h1>
</p>

<p align="center">
    Module d'initiation au développement simple en BUT1 d'Informatique
    <br/>
    <br/>
    <a href="https://moodle.univ-lille.fr/course/view.php?id=28289"><strong>Voir la page sur le moodle »</strong></a>
  </p>
</p>

## Sommaire

- [Semaine 1 : Instruction, séquence d'instruction, type et variable](./Semaine1/)
- [Semaine 2 : Expression booléenne et première structure de contrôle : l'alternative](./Semaine2/)
- [Semaine 3 : Seconde structure de contrôle : la répétition avec une boucle à compteur](./Semaine3/)
- [Semaine 4 : Seconde structure de contrôle : la répétition avec une boucle à événement](./Semaine4/)
- [Semaine 5 : Créer et réutiliser ses propres fonctions](./Semaine5/)
- [Semaine 6 : Fonctions de tests, fonctions plus élaborées, pratiques des structures de contrôle imbriquées](./Semaine6/)
- [Semaine 7 : Première structure de données : le tableau](./Semaine7/)
- [Semaine 8 : Entrainement sur les tableaux](./Semaine8/)

- [DS2 (tout depuis le début jusqu'aux tableaux mono-dimensionnels)](./DS2/)

### Environnement de développement

Notre initiation se déroule sur un Java modifié et propriétaire à l'IUT de Lille. Vous pouvez trouver les fichiers et ressources nécessaires dans le dossier `resources/ijava` du dépôt (un program.jar s'y trouve).

### Conseils/Commandes pratiques

Pour configurer un environnement de développement similaire à celui utilisé en TP, suivez ces étapes :

1. **Installer le JDK** :
   - Vérifiez si le JDK est déjà installé en exécutant `javac -version`. Si la commande renvoie une version (ex. `javac 11.0.12`), vous êtes prêt. Sinon, téléchargez le JDK pour votre système d'exploitation [ici](https://www.oracle.com/java/technologies/downloads/).

2. **Utiliser `program.jar`** :
   - Le fichier `program.jar` de Ijava est déjà disponible dans le dossier [`resources/ijava`](./resources/ijava/ijava.jar).

3. **Compiler et exécuter les programmes** :
   - **Compilation** :
     - Linux/MacOS : `javac -cp ../resources/ijava/program.jar:. Hello.java`
     - Windows : `javac -cp "..\resources\ijava\program.jar;." Hello.java`
   - **Exécution** :
     - Linux/MacOS : `java -cp ../resources/ijava/program.jar:. Hello`
     - Windows : `java -cp "..\resources\ijava\program.jar;." Hello`

   > **ATTENTION :** Ces commandes supposent que le fichier `Hello.java` est dans le répertoire courant et que `program.jar` se trouve dans `resources/ijava`.

### Cours et apprentissage

Les cours hebdomadaires nous permettent d'acquérir les concepts fondamentaux de la programmation. Cette approche progressive nous aide à construire une base solide en développement, en utilisant un Java modifié comme langage d'apprentissage.

### Remerciements

Nous tenons à créditer **SECQ Yann et ABIDI Sofiene, ALMEIDA COCO Amadeu, BONEVA Iovka, CASTILLON
Antoine, DELECROIX Fabien, LEPRETRE Éric, SANTANA MAIA Deise** pour la création des diaporamas de cours, des TP, TD et pour la réalisation des SAE chaque semaine. Leur travail a été précieux pour notre apprentissage.

<br/>
<p align="center">
    <picture>
        <img alt="UnivLilleLogo" src="https://github.com/yannouuuu/IUT-SAE1.01/raw/main/.github/assets/footer_univlille.png">
    </picture>
</p>