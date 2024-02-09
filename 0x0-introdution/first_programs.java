import javax.swing.JOptionPane;

public class first_programs {
    //Partie 1. L'exercice "série harmonique".

    /**
     * serieHarmonique - Calcule récursivement d'un nombre dans une série harmonique.
     * @param n : nombre des termes.
     * @return : somme des termes de la série harmonique jusqu'à n.
     */

    double serieHarmonique(int n) {
        if (n == 1)
            return 1;
        return (1.0 / n) + serieHarmonique(n - 1);
    }

    /**
     * SommeHarmonique - appeler la fonction serieHarmonique pour obtenir la somme des termes.
     * Return: Rien.
     */

    public void SommeHarmonique() {
        int n;

        System.out.println("Insérer la valeur de 'n' : ");
        n = Integer.parseInt(JOptionPane.showInputDialog("Insérer la valeur de 'n' : "));

        try {
            if (n < 1) {
                throw new IllegalArgumentException("n doit être supérieur ou égal à 1");
            }

            Partie_1 partie = new Partie_1();
            double somme = partie.serieHarmonique(n);
            System.out.printf("La somme des %d termes de la série harmonique est de %.2f%n", n, somme);
        } catch (IllegalArgumentException e) {
            System.err.println("Erreur : " + e.getMessage());
        } finally {
        }
    }

    // Partie 1. L'exercice "Triangle isocèle"
    
    /**
     * TriangleIsocele - affiche un triangle isocèle à partir d'une hauteur. 
     * @param height : Dimension du haut du triangle.
     * @return : Rien.
     */

    public void TriangleIsocele(int height) {
        for (int i = 0; i < height; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j <= i; j++) {
                line.append("*");
            }
            System.out.println(line);
        }
    }

    // Partie 1. L'exercice "Cadre du caractère blanc".

    /**
     * Cadre - met en forme et affiche une chaîne de caractères sous forme de "Cadre".
     * @param hauteur : hauteur du cadre.
     * @param largeur : largeur du cadre.
     * @param epaisseur : taille d'épaisseur du cadre.
     * Return: Rien.
     */

    public void Cadre(int hauteur, int largeur, int epaisseur) {
        for (int i = 0; i < hauteur + 2 * epaisseur; i++) {
            for (int j = 0; j < largeur + 2 * epaisseur; j++) {
                if (i < epaisseur || i >= hauteur + epaisseur || j < epaisseur || j >= largeur + epaisseur) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Tests pour l'exercice

    /**
     * main - teste les 3 fonctions.
     * Return: Rien.
     */

    public static void main(String[] args) {
        int height;
        int hauteur, largeur, epaisseur;
        Partie_1 p = new Partie_1();
    
        p.SommeHarmonique();
        System.out.println();
    
        height = Integer.parseInt(JOptionPane.showInputDialog("Entrer la hauteur : "));
    
        p.TriangleIsocele(height);
        System.out.println();
    
        System.out.println("Entrer la hauteur : ");
        hauteur = Integer.parseInt(JOptionPane.showInputDialog("Entrer la hauteur : "));
        System.out.println("Entrer la largeur : ");
        largeur = Integer.parseInt(JOptionPane.showInputDialog("Entrer la largeur : "));
        System.out.println("Entrer l'épaisseur : ");
        epaisseur = Integer.parseInt(JOptionPane.showInputDialog("Entrer l'épaisseur : "));
        p.Cadre(hauteur, largeur, epaisseur);
    }    
}
