Présentation de Wa-Tor
===================
Logiciel proposant une simulation écologique basée sur une modélisation basique dans laquelle 2 espèces (requins et thons) évoluent dans un environnement, chaque espèce ayant ses règles :

* les thons se déplacement aléatoirement sur une case voisine
* les requins mangent un thon au hasard sur une case voisine s'ils peuvent, sinon, comme les thons, ils se déplacent au hasard sur une case libre 

À ce stade, les comportements de reproduction et de famine n'ont pas été implémentés.

## Utilisation

Afin d'utiliser le projet, il suffit de taper les commandes suivantes:

./compile.sh
//compilation des fichiers présents dans 'src' et création des fichiers '.class' dans 'classes'

./run.sh Wator
//lancement de la simulation
