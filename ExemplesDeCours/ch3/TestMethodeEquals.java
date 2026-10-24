
public class TestMethodeEquals {

    public static void main(String[] args) {
        Personne p1 = new Personne("Ali", 22);
        Personne p2 = new Personne("Ali", 22);
        Personne p3 = new Personne("Mohamed", 21);
        System.out.println(p1 == p2);       // false, car deux objets différents
        System.out.println(p1.equals(p2));  // true, equals teste l'égalité du contenu
        System.out.println(p1.equals(p3));  // false
        System.out.println(p1 == p3);       // false
        p1 = p3;
        System.out.println(p1 == p3);       // true
    }
}

class Personne {

    private String nom;
    private int age;

    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        // 1. Vérification de l'identité (même adresse mémoire)
        if (this == o) {
            return true;
        }
        // 2. Vérification de la nullité et de la correspondance des classes
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        // 3. Conversion de l'objet (Casting)
        Personne p = (Personne) o;
        // 4. Comparaison des valeurs des attributs
        return age == p.age && nom.equals(p.nom);
    }
}
