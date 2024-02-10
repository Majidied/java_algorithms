package java_algorithms.classes_arrays;
public class Professeur {
    String nom;
    Integer nummerSomme;
    String email;
    String grade;

    Professeur(String n, Integer s, String e, String g) {
        this.nom = n;
        this.nummerSomme = s;
        this.email = e;
        this.grade = g;
    }

    Professeur() {
        super();
    }

    /**
    * Returns the object name. This is used to generate error messages when there is no name in the XML file.
    * 
    * 
    * @return the object's name or null if it is
    */
    public String getNom() { return nom; }
    /**
    * Set the Number. This is used to identify the person who sent the message.
    * 
    * @param nom -The name of the person who sent the
    */
    public void setNom(String nom) { this.nom = nom; }

    /**
    * This method is written in the current calendar week and will be published.
    * 
    * 
    * @return Number of days
    */
    public Integer getNummerSomme() { return nummerSomme; }
    /**
    * Settle two sums in one function
    * 
    * @param somme -The number two Som
    */
    public void setNummerSomme(Integer somme) { this.nummerSomme = somme; }

    /**
    * Returns the email associated with this user. Note that this is a copy of the value returned by #getEmail ()
    * 
    * 
    * @return the email associated with this user or null if there is
    */
    public String getEmail() { return email; }
    /**
    * Sets the email to be sent to the user. This is a convenience method for setting the email to be sent to the user
    * 
    * @param email -the e-mail
    */
    public void setEmail(String email) { this.email = email; }

    /**
    * Returns the grade of the grade. This is used to generate HTML for the grade field.
    * 
    * 
    * @return String representation of the grade (not null) or
    */
    public String getGrade() { return grade; }
    /**
    * The grade of the person is determined. Note that this does not affect the number of people in the person's group.
    * 
    * @param grade -The grade of the person as a string e.g.
    */
    public void setGrade(String grade) { this.grade = grade; }

    /**
    * The Commission shall adopt the following measures:
    */
    public void afficher(){
        System.out.println("Le professeur " + getNom());
        System.out.println("Adresse email: " + getEmail()); 
        System.out.println("a le numéro " + getNummerSomme() + " en tant que professeur.");
        System.out.println("Son grade est " + getGrade() + ".\n");
    }
    
}
