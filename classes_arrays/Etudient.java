
public class Etudient {
    String nom;
    int nummerEtudiant;
    String email;

    Etudient (String nom, int nummerEtudiant, String email) {
        this.nom = nom;
        this.nummerEtudiant = nummerEtudiant;
        this.email = email;
    }
    Etudient () {
        super();
    }

    /**
    * Définit la valeur Nom. Cette valeur est utilisée pour déterminer le type d'objet qui sera créé et utilisé dans la recherche
    * 
    * @param nom -Value nominale à définir pour cet objet
    */
    void setNom(String nom) {
        this.nom = nom;
    }
    /**
    * Retourne le nom de l'objet. Ceci est utilisé pour générer des messages d'erreur lorsqu'il y a
    * 
    * 
    * @return le nom de la
    */
    String getNom() {
        return this.nom;
    }

    /**
    * La méthode de mise en place de l'ensemble doit être mise en œuvre.
    * 
    * @param n -Les noms des étudiants
    */
    // Nombre d'étudiants exécutés
    void setNummerEtudiant(int n) { this.nummerEtudiant=n;}

    /**
    * La méthodologie des résultats d'un constructeur est publiée.
    * 
    * 
    * @return Nombre d'étudiants de l'université
    */
    int getNummerEtudiant() { return this.nummerEtudiant; }

    /**
    * Définit l'adresse e-mail. Il doit contenir des caractères @ and.com. Ceci est utilisé pour envoyer
    * 
    * @param email -l'adresse e-mail à définir comme le
    */
    void setEmail(String email) {
        // Définir l'adresse e-mail de l'utilisateur.
        if(!email.contains("@") || !email.contains(".com")) throw new IllegalArgumentException();
        else this.email = email;
    }
    /**
    * Retourne le courriel associé à cet utilisateur. Notez que c'est une copie de la propriété #email
    * 
    * 
    * @return l'e-mail associé à cet utilisateur ou nul si il y a
    */
    String getEmail() {return this.email;}

    /**
    * Les informations d'une adresse en fonction de la
    */
    public void afficher(){
        System.out.println("Nom: " + this.getNom());
        System.out.println("Numéro d'étudiant: " + this.getNummerEtudiant());
        System.out.println("Adresse e-mail: " + this.getEmail());
    }
    
}
