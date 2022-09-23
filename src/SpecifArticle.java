public interface SpecifArticle {

    String getDesignation();

    int getQuantite();

    double getPrix_ht();

    double getPrix_ttc();

    void ajouter(int q);

    void retirer(int q);
}
