package java_algorithms.classes_arrays;
import java_algorithms.classes_arrays.Professeur;

public class Module {

    private String libelle;
    private Integer coefficient;
    private Integer nbrHeuresCours;
    private Integer nbrHeuresTD;
    private Integer nbrHeuresTP;
    private Professeur enseignent;
    
    Module(String libelle, Integer coefficient, Integer nbrHeuresCours, Integer nbrHeuresTD, Integer nbrHeuresTP, Professeur enseignent) {
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

    public void setNbrHeuresCours(Integer nbrHeuresCours) {
        this.nbrHeuresCours = nbrHeuresCours;
    }

    public Integer getNbrHeuresCours() {
        return this.nbrHeuresCours;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return this.libelle;
    }

    public void setEnseignant(Professeur enseignant) {
        this.enseignent = enseignant;
    }

    public Professeur getEnseignant() {
        return this.enseignent;
    }

    public void setNbrHeuresTD(Integer nbrHeuresTD) {
        this.nbrHeuresTD = nbrHeuresTD;
    }

    public Integer getNbrHeuresTD() {
        return this.nbrHeuresTD;
    }

    public void setNbrHeuresTP(Integer nbrHeuresTP) {
        this.nbrHeuresTP = nbrHeuresTP;
    }

    public Integer getNbrHeuresTP() {
        return this.nbrHeuresTP;
    }
}
