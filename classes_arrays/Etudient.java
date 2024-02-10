package java_algorithms.classes_arrays;

public class Etudient {
    String nom;
    Integer nummerEtudiant;
    String email;

    Etudient (String nom, Integer nummerEtudiant, String email) {
        this.nom = nom;
        this.nummerEtudiant = nummerEtudiant;
        this.email = email;
    }

    Etudient () {
        super();
    }

    /**
    * Sets the Nom value. This is used to determine the type of object that will be created and used in the search.
    * 
    * @param nom -Nom value to be set for this object
    */
    void setNom(String nom) {
        this.nom = nom;
    }
    /**
    * Returns the object name. This is used to generate error messages when there is an error in the XML
    * 
    * 
    * @return the name of the
    */
    String getNom() {
        return this.nom;
    }

    /**
    * The method to set up the set should be implemented.
    * 
    * @param n -The names of the students
    */
    // Number of students who have been executed
    void setNummerEtudiant(Integer n) { if(n != null) this.nummerEtudiant=n;}

    /**
    * The methodology for the results of a constructor is published.
    * 
    * 
    * @return The number of students of the university
    */
    Integer getNummerEtudiant() { return this.nummerEtudiant; }

    /**
    * Sets the email address. Must contain @ and.com characters. This is used to send emails to the user when they log in
    * 
    * @param email -the e-mail address to be set as the
    */
    void setEmail(String email) {
        // Set the email address of the user.
        if(!email.contains("@") || !email.contains(".com")) throw new IllegalArgumentException();
        else this.email = email;
    }
    /**
    * Returns the email associated with this user. Note that this is a copy of the #email property.
    * 
    * 
    * @return the email associated with this user or null if there is
    */
    String getEmail() {return this.email;}

    /**
    * The information of an address in function of the
    */
    public void afficher(){
        System.out.println("Nom: " + this.getNom());
        System.out.println("Numéro d'étudiant: " + this.getNummerEtudiant());
        System.out.println("Adresse e-mail: " + this.getEmail());
    }
    
}
