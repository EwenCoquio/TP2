import java.util.Scanner;
public class TestCatalogue {
    public static void main(String[] argv){
        boolean next = true;
        int choix;
        Scanner scan = new Scanner(System.in);
        System.out.println("Comment souhaitez vous faire votre catalogue ?");
        choix = scan.nextInt();
        if (choix == 1){
            CatalogueTab c = new CatalogueTab();
            System.out.println("choix : tableau");
        }
        else if (choix == 2){
            CatalogueArray c = new CatalogueArray();
            System.out.println("choix : tableau");
        }
        while(next){



        }
        CatalogueTab c = new CatalogueTab();
        Scanner scan2 = new Scanner(System.in);
        c.ajouter(new Article(scan2.nextLine(), scan2.nextInt() , scan2.nextDouble()));
        c.affiche();
    }

}
