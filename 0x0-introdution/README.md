# # Partie 1 : Algorithmique
Pour chaque question une méthode appelle par la méthode main.
1) Ecrire un programme calculant la somme des n premiers termes de la série 
harmonique. La valeur n est donnée dans le programme.
2) Ecrire un programme qui affiche un triangle isocèle formé d’étoiles. La hauteur du 
triangle sera fournie en données, comme l’exemple suivant :
*
**
***
****
3) Écrire un programme qui dessine un cadre de largeur par hauteur caractères blancs, 
entouré d’un cadre d’épaisseur caractères #, L’appel à boite(5,4,2) devra donc afficher 
# # Partie 2 : Utilisation SDK
# Exercice 1 : 
A. Écrivez une classe exécutable avec une méthode : static long factorielle1(int n) 
qui calcule la factorielle de n, c’est-à-dire le nombre n ! = n × (n – 1) × (n – 2) × ... × 3 × 2 × 
1.
B. Trouvez la valeur de n à partir de laquelle les débordements des valeurs entières rendent 
cette méthode inutilisable. N.B. Une manière de vérifier que la valeur de n! est juste, sachant 
que celle de (n – 1)! l’est, consiste à afficher le rapport n! / (n – 1)!
C. Pour pallier ce problème de débordement, écrivez une nouvelle fonction utilisant des objets 
java.math.BigInteger : static BigInteger factorielle2(int n) 
et constatez que maintenant on peut aller pratiquement aussi loin qu’on veut. Pour résoudre 
cet exercice vous aurez besoin de lire posément la documentation de cette classe. 
D. Aurions-nous pu donner le même nom aux fonctions factorielle1 et factorielle2 ?
# Exercice 2 
Pour tester la méthode java.lang.Math.random(), écrivez un programme qui obtient n 
nombres « au hasard » (par exemple, n = 100 000) et qui calcule la moyenne et l’écart-type de 
la suite obtenue. 
Pour produire des nombres aléatoires utilisez la méthode java.lang.Math.random() (cela se 
lit : « la méthode random de la classe Math du paquetage java.lang »), sur laquelle vous 
trouverez des indications dans la documentation de l'API. 
Un des buts de cet exercice est justement de vous initier à la consultation de cette 
documentation. Pour cela, ouvrez un navigateur sur la doc de l’API (chez Sun, 
http://docs.oracle.com/javase/7/docs/api/) ; dans le volet gauche supérieur sélectionnez le 
paquetage java.lang et, alors, dans le volet gauche inférieur sélectionnez la classe Math. Parmi les méthodes de cette classe, cherchez random et lisez-en la documentation. 
Rappel de formules : si n est le nombre de termes d’une suite, S = x1 + x2 + ... + xn la somme 
de ces termes et Q=x12 +x22 +...+xn2 la somme de leurs carrés,alors la moyenne est 
m=S/n l’écart-type s est la racine carrée de la variance V, donnée par V = ( Q / n ) – m2 
N.B. Si la distribution des valeurs renvoyées par la fonction random est uniforme, quand n 
devient de plus en plus grand m doit tendre vers 0,5 et s vers 0,288675134595 (la racine 
carrée de 1/12). 
# Exercice 3 (utilisation des classes enveloppes)
Le package java.lang fournit une classe "enveloppe" pour chaque type primitif : Boolean, 
Character, Integer, Float, etc… Ces classes fournissent des méthodes permettant d'effectuer 
des conversions de données de type primitif en objet (par ex : boolean en Boolean ou String) 
et réciproquement.
On s'intéresse ici aux conversions float  String. Utilisez la documentation du SDK, et 
plus précisément les méthodes des classes String et Float pour :
1) passer d'une valeur de type primitif float à une String
2) passer d'une String à une valeur de type primitif float (si possible).
Trouver plusieurs réponses pour chaque question