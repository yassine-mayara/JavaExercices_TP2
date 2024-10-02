class Livre {
    private String titre, auteur;
    private float nbPages;
    private double prix;
    private boolean prixFixe = false;
    public static final double TVA = 0.07; 

    public Livre(String auteur, String titre, float nbPages, double prix) {
        this.auteur = auteur;
        this.titre = titre;
        this.nbPages = nbPages;
        this.setPrix(prix);
    }

    public Livre(String titre, float nbPages, double prix) {
        this.auteur = "Inconnu";
        this.titre = titre;
        this.nbPages = nbPages;
        this.setPrix(prix);
    }

    public Livre(String auteur, String titre, float nbPages) {
        this.auteur = auteur;
        this.titre = titre;
        this.nbPages = nbPages;
    }

    public Livre(String auteur, String titre) {
        this.auteur = auteur;
        this.titre = titre;
    }

    public Livre() {
        this.auteur = "Inconnu";
        this.titre = "Inconnu";
        this.nbPages = 0;
    }

    public double getPrix() {
        return prix;
    }

    public double getPrixAvecTVA() {
        return prix + (prix * TVA);
    }

    public void setPrix(double prix) {
        if (!prixFixe) {
            this.prix = prix;
            this.prixFixe = true;
        } else {
            System.out.println("Le prix a deja ete fixe et ne peut pas etre modifie.");
        }
    }

    public boolean testPrix() {
        return prixFixe;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public float getNbPages() {
        return nbPages;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setNbPages(float nbPages) {
        if (nbPages > 20) {
            this.nbPages = nbPages;
        } else {
            System.out.println("Le nombre de pages est trop faible");
        }
    }

    public String toString() {
        return "Livre intitule \"" + titre + "\" de " + auteur + ", contenant " + nbPages + " pages, prix: " + prix + " DT (avec TVA: " + getPrixAvecTVA() + " DT).";
    }

    public void decrire() {
        System.out.println(this.toString());
    }
}
