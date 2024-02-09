import java.math.BigInteger;
import java.lang.String;

public class BigInteger_Random {
    // Exercice 1. Question 1:
    /**
     * factorielle1 - calcul de la factorielle en utilisant la méthode récursive.
     * 
     * @param n : nombre pour lequel calculer la factorielle.
     * @return : la factorielle de n en "long".
     */
    static long factorielle1(int n) {
        if (n < 0)
            return 0;
        else if (n == 0 || n == 1)
            return 1;
        else
            return n * factorielle1(n - 1);
    }

    // Exercice 1. Question 2:
    /**
     * debordement - le nombre de fois qu'un thread est entré ou sorti d'un bloc
     * synchronisé.
     * 
     * @return : le nombre n.
     */
    static int debordement() {
        int n = 1;

        while (true) {
            long currentFactorial = factorielle1(n);
            long previousFactorial = factorielle1(n - 1);
            double Ratio = (double) currentFactorial / previousFactorial;

            System.out.printf("n = %d, Ratio: %d / %d = %.2f\n", n, currentFactorial, previousFactorial, Ratio);

            if (Ratio != n)
                break;

            n++;
        }
        return n;
    }

    // Exercice 1. Question 3:
    /**
     * factorielle2 - calcul de la factorielle en utilisant des BigIntegers pour
     * gérer les nombres très grands.
     * 
     * @param n : nombre pour lequel calculer la factorielle.
     * @return : BigInteger représentant la factorielle de n.
     */
    static BigInteger factorielle2(int n) {
        BigInteger resultat = BigInteger.ONE;

        for (int i = 2; i <= n; i++)
            resultat = resultat.multiply(BigInteger.valueOf(i));

        return resultat;
    }

    /**
     * debordement2 - le nombre de fois qu'un thread est entré ou sorti d'un bloc
     * synchronisé.
     * 
     * @return : le nombre n.
     */
    static int debordement2() {
        int n = 1;

        while (true) {
            BigInteger currentFactorial = factorielle2(n);
            BigInteger previousFactorial = factorielle2(n - 1);
            double ratio = currentFactorial.doubleValue() / previousFactorial.doubleValue();

            System.out.printf("n = %d, Ratio: %s / %s = %.2f\n", n, currentFactorial, previousFactorial, ratio);

            if (ratio != n)
                break;

            n++;
        }
        return n;
    }

    // Exercice 1. Question 4:
    /**
     * On ne peut pas donner le même nom aux fonctions factorielle1 et factorielle2
     * :
     * Erreur : Duplicate method factorielle1(int) in type Partie_2Java(67109219)
     */

    // Exercice 2. Question 1:

    /**
     * RandomNumbers - génère n nombres aléatoires entre 0 et 1.
     * 
     * @param n : Nombre de nombres aléatoires à générer.
     * @return : Un tableau contenant les nombres aléatoires générés.
     */
    static double[] RandomNumbers(int n) {
        double[] randomNumbers = new double[n];
        for (int i = 0; i < n; i++) {
            randomNumbers[i] = Math.random();
        }
        return randomNumbers;
    }

    /**
     * Moyenne - calcul de la moyenne d'une suite.
     * 
     * @param rand : Tableau de nombres aléatoires pour calculer la moyenne.
     * @return : La valeur moyenne du tableau de nombres aléatoires donné.
     */
    static double Moyenne(double[] rand) {
        double somme = 0;
        for (int i = 0; i < rand.length; i++)
            somme += rand[i];
        return somme / rand.length;
    }

    /**
     * EcareType - retourne l'écart-type d'un ensemble de valeurs.
     * 
     * @param rand : Tableau de nombres aléatoires pour calculer l'écart-type.
     * @return : L'écart-type du tableau de nombres aléatoires donné.
     */
    static double EcareType(double[] rand) {
        double variance = 0, moyenne = Moyenne(rand);

        for (double d : rand) {
            variance += Math.pow(d - moyenne, 2);
        }
        variance = variance / rand.length;
        return Math.sqrt(variance);
    }

    // Exercice 3. Question 1:

    /**
     * _FloatToString1 - Convertit un nombre réel en une chaîne de caractères,
     * Utilisant la classe Float.
     * 
     * @param f : nombre float à convertir en chaîne de caractères.
     * @return : Représentation de chaîne du nombre float donné.
     */
    static String _FloatToString1(float f) {
        return Float.toString(f);
    }

    /**
     * _FloatToString2 - Convertit un nombre réel en une chaîne de caractères,
     * Utilisant la classe String.
     * 
     * @param f : nombre float à convertir en chaîne de caractères.
     * @return : Représentation de chaîne du nombre float donné.
     */
    static String _FloatToString2(float f) {
        return String.valueOf(f);
    }

    // Exercice 3. Question 2:

    /**
     * _StringToFloat1 - Convertit une chaîne de caractères en un nombre réel,
     * Utilisant la classe Float.
     * 
     * @param str : Chaîne à convertir en nombre float.
     * @return : Valeur float représentée par la chaîne donnée.
     */
    static float _StringToFloat1(String str) {
        if (str == null || !str.matches("[-+]?[0-9]*\\.?[0-9]+")) {
            System.out.println("La chaîne ne peut pas être convertie en nombre à virgule");
            return 0.0F;
        }
        return Float.parseFloat(str);

    }

    /**
     * _StringToFloat2 - Convertit une chaîne de caractères en un nombre réel,
     * Utilisant la classe Float.(deuxième méthode)
     * 
     * @param str : Chaîne à convertir en nombre float.
     * @return : Valeur float représentée par la chaîne donnée.
     */
    static float _StringToFloat2(String str) {
        if (str == null || !str.matches("[-+]?[0-9]*\\.?[0-9]+")) {
            System.out.println("La chaîne ne peut pas être convertie en nombre à virgule");
            return 0.0F;
        }
        return Float.valueOf(str);
    }

    // Fonction qui vérifie le type de variable si la variable est de type float ou
    // String.
    public static void TypeOfVariable(Object o) {
        if (o instanceof Float) {
            System.out.println("Le type de cette variable est Float.");
        } else if (o instanceof String) {
            System.out.println("Le type de cette variable est String.");
        } else {
            System.out.println("Le type de cette variable n'est ni Float ni String.");
        }
    }

    public static void main(String[] args) {
        int n;
        n = debordement();
        System.out.println(n);
        n = debordement2();
        System.out.println(n);
        System.out.println(factorielle2(10).toString());
        double[] tabRand = RandomNumbers(10000000);

        System.out.printf("La moyenne est %f\n", Moyenne(tabRand));
        System.out.printf("L'écart-type est %f\n", EcareType(tabRand));

        System.out.println("\n" + _FloatToString1(11.2f));
        TypeOfVariable(_FloatToString1(11.2f));

        System.out.println("\n" + _FloatToString2(13.4f));
        TypeOfVariable(_FloatToString2(13.4f));

        System.out.println("\n" + _StringToFloat1("543.2"));
        TypeOfVariable(_StringToFloat1("15.78"));

        System.out.println("\n" + _StringToFloat2("16.45"));
        TypeOfVariable(_StringToFloat2("16.45"));
    }
}
