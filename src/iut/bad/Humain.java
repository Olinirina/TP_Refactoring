package iut.bad;

import java.util.ArrayList;
import java.util.List;

public class Humain implements Consommation {
    protected String nom;
    protected String prenom;
    protected int age;
    protected List<Humain> amis;

    public Humain() {
        super();
        amis = new ArrayList<>();
    }

    public Humain(String nom, String prenom, int age) {
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        amis = new ArrayList<>();
    }

    @Override
    public void manger() {
        System.out.println(nom + " est en train de manger.");
    }

    @Override
    public void boire() {
        System.out.println(nom + " est en train de boire.");
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age;
    }
    public void ami(Humain autre, int dureeAmitie) {
        amis.add(autre);
        autre.amis.add(this);
        System.out.println(this.nom + " est maintenant ami avec " + autre.nom + " pour une durée de " + dureeAmitie + " jours.");
    }

    public void ami(Humain autre) {
        ami(autre, 100); // Valeur par défaut de 100 jours
    }


}


