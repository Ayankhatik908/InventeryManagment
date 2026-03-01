public interface InventoryOperations {

    void addProduct(Product product);

    void updateProduct(int id, int quantity);

    void deleteProduct(int id);

    void viewAllProducts();
}