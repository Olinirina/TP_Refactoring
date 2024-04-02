package iut.bad;

public class Femme extends Humain {
    public Femme() {
        super();
    }

    public Femme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    public static void main(String[] args) {
        Homme homme = new Homme("John", "Doe", 30);
        Femme femme = new Femme("Jane", "Doe", 28);

        homme.ami(femme);
    }
}

