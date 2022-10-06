public class CD extends Article {

    private final String rubrique;
    private final String auteur;

    CD(String d, int q, double ph, String r, String a) {
        super(d, q, ph);
        this.rubrique = r;
        this.auteur = a;
    }

    public String getRubrique() {
        return rubrique;
    }

    public String getAuteur() {
        return auteur;
    }

    @Override
    public String toString(){
        return super.toString()  + ", rubrique : " + this.rubrique + " (ecrit par " + this.auteur + ")";
    }
}
