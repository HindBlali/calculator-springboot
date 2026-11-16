package com.example;

public class SommeArgent {
    private int montant;
    private String devise;

    public SommeArgent(int montant, String devise) {
        this.montant = montant;
        this.devise = devise;
    }

    public int getMontant() {
        return montant;
    }

    public String getDevise() {
        return devise;
    }

    // Méthode additionner (comme dans le TP)
    public SommeArgent additionner(SommeArgent autre) {
        if (!this.devise.equals(autre.devise)) {
            throw new IllegalArgumentException("Les devises sont différentes");
        }
        return new SommeArgent(this.montant + autre.montant, this.devise);
    }

    // Méthode add (demandée à la question 4)
    public SommeArgent add(SommeArgent autre) {
        if (!this.devise.equals(autre.devise)) {
            throw new IllegalArgumentException("Les devises doivent être identiques !");
        }
        return new SommeArgent(this.montant + autre.montant, this.devise);
    }

    // Méthode multiplier (Étape 2)
    public SommeArgent multiplier(int facteur) {
        return new SommeArgent(this.montant * facteur, this.devise);
    }

    // Redéfinition de equals pour que assertEquals fonctionne correctement
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        SommeArgent autre = (SommeArgent) obj;
        return montant == autre.montant && devise.equals(autre.devise);
    }

    // Redéfinition de hashCode (bonne pratique quand on redéfinit equals)
    @Override
    public int hashCode() {
        return 31 * montant + devise.hashCode();
    }

    @Override
    public String toString() {
        return montant + " " + devise;
    }
}