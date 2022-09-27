public class Livre extends Article {
    int nbPages;
    String ISBN;

    Livre(String d, int q, double ph, int nb, String ISBN) {
        super(d, q, ph);
        this.nbPages = nb;
        this. ISBN = ISBN;
    }

    @Override
    public String toString(){
        return "/" + this.designation + "/     " + this.prix_ttc + " euros     " + "("+this.quantite + " en stock)" +
                ", ISBN : " + this.ISBN + " (" + this.nbPages + " pages)";
    }
}