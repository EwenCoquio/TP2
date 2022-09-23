public class Article implements SpecifArticle {
    String designation;
    int quantite;
    double prix_ht;
    double prix_ttc;

    Article(String d, int q, double ph){
        this.designation = d;
        this.quantite = q;
        this.prix_ht = ph;
        this.prix_ttc = ph * 1.196;
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
}
