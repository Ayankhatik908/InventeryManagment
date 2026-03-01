import java.util.HashMap;

public class InventoryService implements InventoryOperations {

    private HashMap<Integer, Product> productMap = new HashMap<>();

    @Override
    public void addProduct(Product product) {
        productMap.put(product.getId(), product);
        System.out.println("Product Added Successfully.");
    }

    @Override
    public void updateProduct(int id, int quantity) {
        if(productMap.containsKey(id)) {
            productMap.get(id).setQuantity(quantity);
            System.out.println("Product Updated.");
        } else {
            System.out.println("Product Not Found.");
        }
    }

    @Override
    public void deleteProduct(int id) {
        if(productMap.containsKey(id)) {
            productMap.remove(id);
            System.out.println("Product Deleted.");
        } else {
            System.out.println("Product Not Found.");
        }
    }

    @Override
    public void viewAllProducts() {
        if(productMap.isEmpty()) {
            System.out.println("No Products Available.");
        } else {
            for(Product p : productMap.values()) {
                p.display();
            }
        }
    }
}