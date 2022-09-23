public class Livre extends Article {
    int nbPages;
    String ISBN;

    Livre(String d, int q, double ph, int nb, String ISBN) {
        super(d, q, ph);
        this.nbPages = nb;
        this. ISBN = ISBN;
    }
}
