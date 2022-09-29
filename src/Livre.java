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
        return super.toString()  + ", ISBN : " + this.ISBN + " (" + this.nbPages + " pages)";
    }
}