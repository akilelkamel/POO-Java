
public class TestMethodeToString {

    public static void main(String args[]) {
        Voiture v1 = new Voiture("Toyota", "Rav4");
        System.out.println(v1); // ou System.out.println(v1.toString());

        Voiture v2 = new Voiture("Renault", "Megane");
        System.out.println(v2); // ou System.out.println(v2.toString());
    }
}

class Voiture {

    private String marque;
    private String modele;

    public Voiture(String marque, String modele) {
        this.marque = marque;
        this.modele = modele;
    }

    // Redéfinition de la méthode toString() 
    @Override
    public String toString() {
        return "Voiture [Marque = " + marque + ", Modèle = " + modele + "]";
    }
}
