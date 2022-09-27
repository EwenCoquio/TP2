import org.junit.Test;
import java.util.Scanner;

public class TestCatalogue {
    @Test
    public void test1(){
        Catalogue c = new Catalogue();
        Scanner scan = new Scanner(System.in);
        c.ajouter(new Article(scan.nextLine(), scan.nextInt() , scan.nextDouble()));
        c.affiche();
    }

}
