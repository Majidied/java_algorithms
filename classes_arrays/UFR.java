public class UFR {
    public static void main(String[] args) {
        // Création d'un professeur responsable
        Professeur responsable = new Professeur("NomResponsable", 1234, "responsable@example.com", "GradeResponsable");

        // Création d'une formation
        Formation formation = new Formation("IntituleFormation", responsable);

        // Création de quelques modules avec leurs heures respectives
        Module module1 = new Module("Module1", 2, 20, 10, 5, new Professeur());
        Module module2 = new Module("Module2", 3, 15, 8, 4, new Professeur());
        Module module3 = new Module("Module3", 4, 25, 12, 6, new Professeur());

        // Création de quelques semestres
        Semestre semestre1 = new Semestre(1);
        Semestre semestre2 = new Semestre(2);

        // Ajout des modules aux semestres
        semestre1.set(module1, 0);
        semestre1.set(module2, 1);
        semestre2.set(module3, 0);

        // Ajout des semestres à la formation
        formation.set(semestre1, 0);
        formation.set(semestre2, 1);

        // Affichage de la charge horaire de la formation
        System.out.println("Charge horaire de la formation: " + formation.getChargeHoraireFormation());

        // Création d'un module avec des heures de cours, TD et TP
        Module moduleTest = new Module("ModuleTest", 2, 20, 10, 5, new Professeur());

        // Création d'un semestre
        Semestre semestreTest = new Semestre(1);

        // Ajout du module au semestre
        semestreTest.set(moduleTest, 0);

        formation.afficher();

        // Affichage de la charge horaire du semestre
        System.out.println("Charge horaire du semestre: " + semestreTest.getChargeHoraireSemestre());

        // Affichage de la charge horaire du module
        System.out.println("Charge horaire du module: " + moduleTest.getChargeHoraireModule());

        // Création d'un étudiant
        Etudient etudiant = new Etudient("NomEtudiant", 5678, "etudiant@example.com");

        // Affichage des informations de l'étudiant
        etudiant.afficher();
    }
}
