package com.example.ecole;

public class TestIntegration {
    public static void main(String[] args) {
        System.out.println("=== DÉBUT DU TEST D'INTÉGRATION MANUEL ===");

        // 1. Création des objets
        Student bob = new Student("S002", "Bob", 12.0);
        Course math = new Course("Mathématiques", "M. Dupont");
        NotificationService notifier = new NotificationService();
        EnrollmentService service = new EnrollmentService(notifier);

        // 2. Inscription de l'étudiant au cours
        System.out.println("Action : Inscription de Bob au cours de Mathématiques...");
        service.enroll(bob, math);

        System.out.println("\nVérifiez que le message de notification s'affiche correctement ci-dessus.");
        System.out.println("=== FIN DU TEST D'INTÉGRATION ===");
    }
}