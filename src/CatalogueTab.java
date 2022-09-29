public class CatalogueTab implements Catalogue{

    Article[] cata;
    int nbrArt;

    CatalogueTab() {
        this.cata = new Article[999999];
        this.nbrArt = 0;
    }

    public void ajouter(Article a) {
        this.cata[nbrArt] = a;
        nbrArt++;
    }

    public void affiche() {
        for(int i=0;i<nbrArt;i++){
            System.out.println(cata[i].toString());
        }
    }

}
