import java.util.ArrayList;

public class CatalogueArray {
    ArrayList<Article> cata;

    CatalogueArray(){
        this.cata = new ArrayList<Article>();
    }

    public void ajouterA(Article a){
        this.cata.add(a);
    }

    public void affichage(){
            System.out.println(cata.toString());
    }
}
