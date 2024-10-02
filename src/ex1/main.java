public class main {
    public static void main(String[] args) {
        Livre[] livres = new Livre[3];

        livres[0] = new Livre("Coelho", "L'alchimiste", 225, 25.99);
        livres[1] = new Livre("La Tunisie", 508, 18.99);
        livres[2] = new Livre("JK Rowling", "Harry Potter");

        for (int i = 0; i < livres.length; i++) {
            livres[i].decrire();
        }

        System.out.println("\nModification du premier livre:");
        livres[0].setAuteur("Paulo Coelho");
        livres[0].setPrix(25.99); 

        System.out.println("\nFixation du troisieme livre:");
        livres[2].setNbPages(461);
        livres[2].setPrix(35.99);

        System.out.println("\nmodification du prix du troisième livre:");
        livres[2].setPrix(40.00);

        System.out.println("\nApres les modifications :");

        for (int i = 0; i < livres.length; i++) {
            livres[i].decrire();
        }

        System.out.println("\nListe des auteurs des livres :");
        for (int i = 0; i < livres.length; i++) {
            System.out.println(livres[i].getAuteur());
        }
    }
}
