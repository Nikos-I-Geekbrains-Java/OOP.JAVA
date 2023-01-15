package Seminar_1;

import java.util.List;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        VendMachine vendingMachine = new VendMachine();
        vendingMachine.getproductList().add(new Product("Яблоко", 10));
        vendingMachine.getproductList().add(new Product("Груша", 20));
        vendingMachine.getproductList().add(new Product("Яблоко1", 10));
        vendingMachine.getproductList().add(new Baton("Батончик Марс", 10, 10.4324324234234));
        vendingMachine.getproductList()
                .add(new SuperBaton("БОЛЬШОЙ Батончик Марс", 10, 10.4324324234234, TypeSize.BIG));
        vendingMachine.getproductList().add(new Peanut("Джаз", 15, "арахис", TypeSize.SMALL));
        for (Product product : vendingMachine.getproductList()) {
            System.out.println(product);
        }

        System.out.println("------");
        var find1 = vendingMachine.getProductByName("Джаз");
        System.out.println(find1);

        System.out.println("------");
        var find2 = vendingMachine.getProductByCost(15);
        System.out.println(find2);
        
    }

}
