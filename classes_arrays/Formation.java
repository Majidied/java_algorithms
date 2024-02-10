public class Formation {
    private String intitule;
    private Professeur responsable;
    private Semestre[] semestres;

    public Formation(String intitule, Professeur responsable) {
        this.intitule = intitule;
        this.responsable = responsable;
        this.semestres = new Semestre[9];
    }

    public Formation() {
        super();
    }

    // getters & setters
    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public Professeur getResponsable() {
        return responsable;
    }

    public void setResponsable(Professeur responsable) {
        this.responsable = responsable;
    }

    public Semestre get(int i) {
        return semestres[i];
    }

    public void set(Semestre s, int i) {
        if (i < 0 && i >= semestres.length) {
            System.out.println("Semestre non ajoute : index invalide");
        } else {
            semestres[i] = s;
        }
    }

    // . Ajouter une méthode afficher qui affiche l’intitule, les informations du professeur et les informations de tous les semestres.
    public void afficher() {
        System.out.print("\nFormation : " + intitule);
        System.out.println("\nResponsable : " + responsable.getNom());
        for (Semestre s: semestres) {
            if (s != null) {
                s.afficher();
            }
        }
    }
    public double getChargeHoraireFormation() {
        double somme = 0;
        for (Semestre s : semestres) {
            if (s != null) {

                somme += s.getChargeHoraireSemestre();
            }
        }
        return somme;
    }

}
