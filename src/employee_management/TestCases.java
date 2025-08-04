package employee_management;

public class TestCases {
    public static FullTimeEmployee fullTimeEmployeeKoto(){
        return new FullTimeEmployee(1, "Koto", 3_000_000);
    }

    public static PartTimeEmployee partTimeEmployeeLita(){
        return new PartTimeEmployee(1, "Lita", 22, 11_750);
    }

    public static void main(String[] args) {
        FullTimeEmployee koto = fullTimeEmployeeKoto();
        PartTimeEmployee lita = partTimeEmployeeLita();

        // On ne peut plus faire de modification directe
        try {
            lita.setHourlyRate(-10_000_000); // Va lancer une exception
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur: " + e.getMessage());
        }

        // Affichage toString (pas d’info sensible)
        System.out.println("Details about Koto : " + koto);
        System.out.println("Details about Lita : " + lita);

        // Création d’un département
        Department devDept = new Department("Département Développement");
        devDept.addEmployee(koto);
        devDept.addEmployee(lita);

        // Affichage RH
        System.out.println("\n📄 Infos RH:");
        devDept.showDetailsForHR();
    }
}
