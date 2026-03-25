import java.util.*;
interface Billing {
void addProduct(int productId, String name, int quantity, double unitPrice);
void generateBill(int orderNumber);
}
class Product {
int productId;
String name;
int quantity;
double unitPrice;
Product(int productId, String name, int quantity, double unitPrice) {
this.productId = productId;
this.name = name;
this.quantity = quantity;
this.unitPrice = unitPrice;
}
double getTotal() {
return quantity * unitPrice;
}
}
class BillGenerator implements Billing {
List<Product> products = new ArrayList<>();
public void addProduct(int productId, String name, int quantity, double unitPrice) {
products.add(new Product(productId, name, quantity, unitPrice));
    }

    public void generateBill(int orderNumber) {
        double netAmount = 0;

        System.out.println("\n===================== BILL (Order " + orderNumber + ") ====================");
        System.out.println("\n");
           System.out.println("----------------------------------------------------------");
        System.out.printf("%-10s %-15s %-10s %-12s %-10s\n",
                "ID", "Name", "Qty", "Unit Price", "Total");
                System.out.println("----------------------------------------------------------");
        for (Product p : products) {
            double total = p.getTotal();
            netAmount += total;

            System.out.printf("%-10d %-15s %-10d %-12.2f %-10.2f\n",
                    p.productId, p.name, p.quantity, p.unitPrice, total);
        }

        System.out.println("----------------------------------------------------------");
        System.out.printf("Net Amount: %.2f\n", netAmount);
    }
}

public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int repeat = 1; repeat <= 2; repeat++) {

            List<BillGenerator> allOrders = new ArrayList<>();

            System.out.print("Enter number of orders: ");
            int orders = sc.nextInt();

            for (int o = 1; o <= orders; o++) {
                BillGenerator bill = new BillGenerator();

                System.out.print("\nEnter number of products for Order " + o + ": ");
                int n = sc.nextInt();

                for (int i = 0; i < n; i++) {
                    System.out.println("Enter product " + (i + 1) + " details:");

                    System.out.print("Product ID: ");
                    int id = sc.nextInt();

                    System.out.print("Name: ");
                    String name = sc.next();

                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();

                    System.out.print("Unit Price: ");
                    double price = sc.nextDouble();

                    bill.addProduct(id, name, qty, price);
                }

                allOrders.add(bill);
            }

            int orderNumber = 1;
            for (BillGenerator bill : allOrders) {
                bill.generateBill(orderNumber++);
                System.exit(0);
            }
        }
    }
}
