public class Livre extends Article {
    private final int nbPages;
    private final String ISBN;

    Livre(String d, int q, double ph, int nb, String ISBN) {
        super(d, q, ph);
        this.nbPages = nb;
        this.ISBN = ISBN;
    }

    public int getNbPages() {
        return nbPages;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return super.toString() + ", ISBN : " + this.ISBN + " (" + this.nbPages + " pages)";
    }
}