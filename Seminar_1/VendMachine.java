package Seminar_1;
import java.util.ArrayList;
import java.util.List;
public class VendMachine {
    private List<Product> productList;

    public List<Product> getproductList() {
        return productList;
    }
    
    public Product getProductByName(String name) {
        for(Product product : productList) {
            if(product.getName().contains(name)) {
                return product;
            }
        }
        return null;
    }
    public ArrayList<Product> getProductByCost(double cost) {
        ArrayList<Product> isfind = new ArrayList<Product>();
        for(Product product : productList) {
            if(product.getCost() <= cost) {
                isfind.add(product);
                // return product;
            }
        }
        if (!isfind.isEmpty()){
            return isfind;
        } //переделать, возвращает только один элемент
        return null;
    }

    public VendMachine() {
        this.productList = new ArrayList<Product>();
    }
}
