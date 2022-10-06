public class Article implements SpecifArticle {
    private final String designation;
    private int quantite;
    private double prix_ht;
    private final double prix_ttc;
    private final double TVA = 1.196;

    Article(String d, int q, double ph){
        this.designation = d;
        this.quantite = q;
        this.prix_ttc = ph * TVA;
    }

    @Override
    public String getDesignation(){
        return this.designation;
    }

    @Override
    public int getQuantite(){
        return this.quantite;
    }

    @Override
    public double getPrix_ht(){
        return this.prix_ht;
    }

    @Override
    public double getPrix_ttc(){
        return this.prix_ttc;
    }

    @Override
    public void ajouter(int q){
        this.quantite +=q;
    }

    @Override
    public void retirer(int q){
        this.quantite -=q;
    }

   public String toString(){
        return "[" + this.designation + "]  :  " + this.prix_ttc + " euros  " + "("+this.quantite + " en stock)";
    }
}