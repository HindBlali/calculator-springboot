package com.example.ecole;

public class TestUnitaire {
    public static void main(String[] args) {
        System.out.println("=== DÉBUT DES TESTS UNITAIRES MANUELS (Student) ===");

        // Test 1 : Création avec note initiale
        System.out.println("\nTest 1 : Création d'un étudiant");
        Student alice = new Student("S001", "Alice", 15.0);
        if (alice.getGrade() == 15.0) {
            System.out.println("Résultat attendu : 15.0 | Obtenu : " + alice.getGrade() + " => OK");
        } else {
            System.out.println("Résultat attendu : 15.0 | Obtenu : " + alice.getGrade() + " => KO");
        }

        // Test 2 : Mise à jour avec une note valide
        System.out.println("\nTest 2 : Mise à jour avec une note valide (18)");
        alice.updateGrade(18.0);
        if (alice.getGrade() == 18.0) {
            System.out.println("Résultat attendu : 18.0 | Obtenu : " + alice.getGrade() + " => OK");
        } else {
            System.out.println("Résultat attendu : 18.0 | Obtenu : " + alice.getGrade() + " => KO");
        }

        // Test 3 : Mise à jour avec une note invalide (> 20)
        System.out.println("\nTest 3 : Mise à jour avec une note invalide (25)");
        try {
            alice.updateGrade(25.0);
            System.out.println("Résultat attendu : Exception | Obtenu : Aucune exception => KO");
        } catch (IllegalArgumentException e) {
            System.out.println("Résultat attendu : Exception | Obtenu : " + e.getMessage() + " => OK");
        }

        // Test 4 : Mise à jour avec une note invalide (< 0)
        System.out.println("\nTest 4 : Mise à jour avec une note invalide (-5)");
        try {
            alice.updateGrade(-5.0);
            System.out.println("Résultat attendu : Exception | Obtenu : Aucune exception => KO");
        } catch (IllegalArgumentException e) {
            System.out.println("Résultat attendu : Exception | Obtenu : " + e.getMessage() + " => OK");
        }

        System.out.println("\n=== FIN DES TESTS UNITAIRES ===");
    }
}