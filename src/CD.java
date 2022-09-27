public class CD extends Article {

    String rubrique;
    String auteur;

    CD(String d, int q, double ph, String r, String a) {
        super(d, q, ph);
        this.rubrique = r;
        this.auteur = a;
    }

    @Override
    public String toString(){
        return "/" + this.designation + "/     " + this.prix_ttc + " euros     " + "("+this.quantite + " en stock)" +
                ", rubrique : " + this.rubrique + " (ecrit par " + this.auteur + ")";
    }
}
