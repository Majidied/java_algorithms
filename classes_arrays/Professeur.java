public class Professeur {
    String nom;
    int nummerSomme;
    String email;
    String grade;

    Professeur(String n, int s, String e, String g) {
        this.nom = n;
        this.nummerSomme = s;
        this.email = e;
        this.grade = g;
    }

    Professeur() {
        super();
    }

    /**
    * Retourne le nom de l'objet. Ceci est utilisé pour générer des messages d'erreur lorsqu'il n'
    * 
    * 
    * @return le nom de l'objet ou nul si c'est le cas
    */
    public String getNom() { return nom; }
    /**
    * Définir le numéro. Il est utilisé pour identifier la personne qui a envoyé le message.
    * 
    * @param nom -Nom de la personne qui a envoyé le
    */
    public void setNom(String nom) { this.nom = nom; }

    /**
    * Cette méthode est rédigée dans la semaine civile en cours et sera publiée.
    * 
    * 
    * @return Nombre de jours
    */
    public int getNummerSomme() { return nummerSomme; }
    /**
    * Régler deux sommes dans une fonction
    * 
    * @param somme -Le numéro deux Som
    */
    public void setNummerSomme(int somme) { this.nummerSomme = somme; }

    /**
    * Retourne le courrier électronique associé à cet utilisateur. Notez que c'est une copie de la
    * 
    * 
    * @return l'e-mail associé à cet utilisateur ou nul si il y a
    */
    public String getEmail() { return email; }
    /**
    * Définit le courrier électronique à envoyer à l'utilisateur.
    * 
    * @param email -le courrier électronique
    */
    public void setEmail(String email) { this.email = email; }

    /**
    * Retourne la note de la note. Ceci est utilisé pour générer HTML pour le champ de note.
    * 
    * 
    * @return représentation en chaîne de la note (pas nulle) ou
    */
    public String getGrade() { return grade; }
    /**
    * Le niveau de la personne est déterminé, ce qui n'affecte pas le nombre de personnes dans le groupe.
    * 
    * @param grade -La note de la personne comme une chaîne par exemple
    */
    public void setGrade(String grade) { this.grade = grade; }

    
    public void afficher(){
        System.out.println("Le professeur " + getNom());
        System.out.println("Adresse email: " + getEmail()); 
        System.out.println("a le numéro " + getNummerSomme() + " en tant que professeur.");
        System.out.println("Son grade est " + getGrade() + ".\n");
    }
    
}
