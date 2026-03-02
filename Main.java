import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        InventoryService inventory = new InventoryService();
        TransportService transport = new TransportService();

        while(true) {

            System.out.println("\n1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. View All Products");
            System.out.println("5. Transport Selection");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    Product p = new Product(id, name, qty, price);
                    inventory.addProduct(p);
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    int uid = sc.nextInt();

                    System.out.print("Enter New Quantity: ");
                    int newQty = sc.nextInt();

                    inventory.updateProduct(uid, newQty);
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    int did = sc.nextInt();

                    inventory.deleteProduct(did);
                    break;

                case 4:
                    inventory.viewAllProducts();
                    break;

                case 5:
                    transport.selectCheapestTransport();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
            }

        }
    }
}