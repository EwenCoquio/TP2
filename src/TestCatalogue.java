import java.io.IOException;
import java.util.Scanner;

public class TestCatalogue {
    public static void main(String[] argv) {
        boolean next = true;
        boolean algo = true;
        int choix;
        String choix2;
        Catalogue c = null;
        Scanner scan = new Scanner(System.in);
        System.out.println("Comment souhaitez vous faire votre catalogue ?     1 -> tableau / 2 -> arrayList");
        choix = scan.nextInt();
        if (choix == 1) {
            c = new CatalogueTab();
            System.out.println("choix : tableau");
        } else if (choix == 2) {
            c = new CatalogueArray();
            System.out.println("choix : ArrayList");
        }
        while (next) {
            System.out.println("Voulez vous ajouter un article ?  o/n");
            choix2 = scan.next();
            if (choix2.equals("n")) {
                next = false;
            } else if (choix2.equals("o")) {
                System.out.println("Voulez vous renseigner un article simple OU detaille ?  1/2");
                choix = scan.nextInt();
                if (choix == 1 && c != null) {
                    System.out.println("Veuillez rentrer un nom d'article, une quantite et un prix");
                    String s = scan.next();
                    int q = scan.nextInt();
                    double p = scan.nextDouble();
                    c.ajouter(new Article(s, q, p));
                    c.affiche();
                } else if (choix == 2 && c != null) {
                    System.out.println("Est-ce un livre ou un CD ?  1/2");
                    choix = scan.nextInt();
                    if (choix == 1) {
                        System.out.println("Veuillez rentrer un nom d'article, une quantite, un prix, un nb de page et un ISBN");
                        c.ajouter(new Livre(scan.next(), scan.nextInt(), scan.nextDouble(), scan.nextInt(), scan.next()));
                        c.affiche();
                    } else if (choix == 2) {
                        System.out.println("Veuillez rentrer un nom d'article, une quantite, un prix, un genre et un auteur");
                        c.ajouter(new CD(scan.next(), scan.nextInt(), scan.nextDouble(), scan.next(), scan.next()));
                        c.affiche();
                    }
                } else {
                    System.out.println(" !! erreur de saisie !!");
                    next = false;
                }
            } else {
                System.out.println("!! erreur de saisie !!");
                next = false;
            }
        }
    }

}

