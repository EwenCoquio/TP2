import java.util.ArrayList;

public class CatalogueArray implements Catalogue{
    ArrayList<Article> cata;

    CatalogueArray(){
        this.cata = new ArrayList<Article>();
    }

    public void ajouter(Article a){
        this.cata.add(a);
    }

    public void affiche(){
            System.out.println(cata.toString());
    }
}
