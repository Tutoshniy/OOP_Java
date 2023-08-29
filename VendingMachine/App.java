package VendingMachine;
import java.util.ArrayList;
import java.util.List;

import Domen.Bottle;
import Domen.HotDrink;
import Domen.Product;
import Services.CoinDispenser;
import Services.Holder;
import Services.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
        List<Product> assort = new ArrayList<Product>();

        Product item1 = new Product("Lays", 100);
        Product item2 = new Product("Cola", 50);
        Product item3 = new Bottle("Mineral Water", 70,(float)1.5);
        Product item4 = new HotDrink("Coffee", 80, 20);

        assort.add(item1);
        assort.add(item2);
        assort.add(item3);
        assort.add(item4);

        Holder hold1 = new Holder(10, 10);
        CoinDispenser coinDisp = new CoinDispenser(200);
        
        VendingMachine venMach1 = new VendingMachine(hold1, coinDisp, assort);

        for (Product prod: venMach1.getProductList()){
            System.out.println(prod);
        }

    }
}