package SalesSystem;
public class Main {
    public static void main(String[] args){
        Costumers customer = new Costumers("John Doe", "johndoe@example.com");

// Tạo đối tượng sản phẩm
Products product1 = new Products("Product 1", 10);
Products product2 = new Products("Product 2", 20);

// Tạo đối tượng đơn hàng và thêm sản phẩm vào giỏ hàng
Oders order = new Oders(customer);
order.addProduct(product1);
order.addProduct(product2);

// Tính tổng số tiền
double total = order.calculateTotal();
System.out.println("Total: " + total);
    }
}
