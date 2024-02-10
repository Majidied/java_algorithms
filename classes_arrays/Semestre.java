public class Semestre {
    int numero;
    Module[] modules;

    // constructor
    public Semestre(int n) {
        this.numero = n;
        this.modules = new Module[6];
    }

    public Semestre() {
        super();
    }

    // getters & setters
    public void setNumero(int n) {
        this.numero = n;
    }

    public int getNumero() {
        return this.numero;
    }

    public void set(Module module, int i) {
        if (i >= modules.length && i < 0) {
            System.out.println("index n'est pas correct!");
        } else {
            modules[i] = module;
        }
    }

    public Module get(int i) {
        return this.modules[i];
    }

    // Afficher de manière ordonnée les modules d'un semestre
    public void afficher() {
        System.out.println("\nSemestre " + this.getNumero() + ":");
        for (Module module : modules) {
            if (module != null) {
                module.Afficher();
            }
        }
    }

    // Charge horaire du semestre
    public double getChargeHoraireSemestre() {
        double sum = 0;
        for (Module module : modules) {
            if (module != null) {
                sum += module.getChargeHoraireModule();
            }
        }
        return sum;
    }
}
