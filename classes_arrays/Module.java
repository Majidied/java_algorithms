public class Module {

    private String libelle;
    private int coefficient;
    private int nbrHeuresCours;
    private int nbrHeuresTD;
    private int nbrHeuresTP;
    private Professeur enseignent;
    
    Module(String libelle, int coefficient, int nbrHeuresCours, int nbrHeuresTD, int nbrHeuresTP, Professeur enseignent) {
        this.libelle = libelle;
        this.coefficient = coefficient;
        this.nbrHeuresCours = nbrHeuresCours;
        this.nbrHeuresTD = nbrHeuresTD;
        this.nbrHeuresTP = nbrHeuresTP;
        this.enseignent = enseignent;
    }

    Module() {
        super();
    }

    /**
    * Détermine le nombre d'heures.
    * 
    * @param nbrHeuresCours -le nombre d'heures
    */
    public void setNbrHeuresCours(int nbrHeuresCours) {
        this.nbrHeuresCours = nbrHeuresCours;
    }

    /**
    * Retourne le nombre d'heures cours. Il est utilisé pour déterminer combien de personnes ont de précipitation dans le
    * 
    * 
    * @return Nombre intégral des heures de cours dans le jeu
    */
    public int getNbrHeuresCours() {
        return this.nbrHeuresCours;
    }

    /**
    * Réglage de la libelle d'un fichier.
    * 
    * @param libelle -Le libelle du fichier
    */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    /**
    * Retour sur le libelle d'une commande.
    * 
    * 
    * @return L'affichage de libelle du comman
    */
    public String getLibelle() {
        return this.libelle;
    }

    /**
    * Détermine le coefficient du polynôme.
    * 
    * @param coefficient -le coefficient à la fin de la
    */
    public void setCoefficient(int coefficient) {this.coefficient = coefficient;}

    /**
    * Retourne le coefficient du polynôme.
    * 
    * 
    * @return coefficient du polynôme ou du nuls si ce n'est pas réglé
    */
    public int getCoefficient() {return this.coefficient;}

    /**
    * C'est un ensemble d'enseignants qui sert à créer une personne qui fait partie d'une alliance.
    * 
    * @param enseignant -Professeur à désigner
    */
    public void setEnseignant(Professeur enseignant) {
        this.enseignent = enseignant;
    }

    /**
    * Il est revenu, professeur, nul si il n'est pas présent.
    * 
    * 
    * @return Profil de l'enseignant nul si
    */
    public Professeur getEnseignant() {
        return this.enseignent;
    }

    /**
    * Détermine les heuristiques utilisées pour déterminer le nombre de cellules dans la grille.
    * 
    * @param nbrHeuresTD -le nombre de cellules dans le
    */
    public void setNbrHeuresTD(int nbrHeuresTD) {
        this.nbrHeuresTD = nbrHeuresTD;
    }

    /**
    * Retourne le nombre d'heures TD. Ceci est utilisé pour déterminer combien de données à afficher lorsque l'
    * 
    * 
    * @return Nombre intégral Le nombre d'heures TD que l'utilisateur a
    */
    public int getNbrHeuresTD() {
        return this.nbrHeuresTD;
    }

    /**
    * Définit le nombre d'heures à afficher dans la topographie.
    * 
    * @param nbrHeuresTP -Nombre d'heures à effectuer
    */
    public void setNbrHeuresTP(int nbrHeuresTP) {
        this.nbrHeuresTP = nbrHeuresTP;
    }

    /**
    * Retourne le nombre d'heures dans la télépathie.
    * 
    * 
    * @return le nombre d'heures dans la télépathie
    */
    public int getNbrHeuresTP() {
        return this.nbrHeuresTP;
    }

    /**
    * Afficher le cours de la classe enseignante et le coefficient
    */
    public void Afficher() {
        System.out.println("Le cours: " + this.getLibelle());
        System.out.println("Le coefficeint: " + this.getCoefficient());
        System.out.println("Nombre d'heures: " + this.getNbrHeuresCours());
        System.out.println("Enseignent: ");
        this.getEnseignant().afficher();
    }

    /**
    * Retour sur le prix horaire d'un champion.
    * 
    * 
    * @return Chargement de l'annuaire.
    */
    public double getChargeHoraireModule() {
        return nbrHeuresCours * 1.5 + nbrHeuresTD + nbrHeuresTP * 0.75;
    }
}
