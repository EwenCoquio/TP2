import java.util.Scanner;

public class Main {
    public static void main(String[] argv) {
        System.out.println("Hello world!");
       /* Article test = new Article("test", 5, 9.59);
        System.out.println(test.toString());
        Article ze = new Livre("Dune", 200, 25.3, 918, "978-2-266-32048-1" );
        System.out.println(ze.toString());
        Article rt = new CD("ZZCCMXTP", 13 , 12.59, "mixtape legendraire", "krono, ronare et pandrezz");
        System.out.println(rt.toString());*/
      /*  Catalogue c = new Catalogue();
        Scanner scan = new Scanner(System.in);
        c.ajouter(new Article(scan.nextLine(), scan.nextInt() , scan.nextDouble()));
        c.ajouter(new Article("bchjklz", 15 ,45 ));
        c.ajouter(new Article("bcsejhfgl", 421 ,5 ));
        c.affiche();*/

        CatalogueArray c1 = new CatalogueArray();
        c1.ajouterA(new Article("azaz", 45, 12.56));
        c1.ajouterA(new Article("dzaz", 96, 346));
        c1.ajouterA(new Article("afge", 6, 166));
        c1.affichage();

    }
}