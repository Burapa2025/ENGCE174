package lab2 ;

import java.util.Scanner ;

public class Shopping_Cart {

    public static class Product {
        private String name ;
        private double price ;

        public Product(String name, double price)  {
            this.name = name ;
            this.price = price ;
        }

        public double getPrice() {
            return this.price ;
        }

        public String getName() {
            return this.name ;
        }
    }

    public static class ShoppingCart  {
        private Product[] items = new Product[10] ;
        private int itemCount = 0 ;

        public void addProduct(Product p) {
            if (itemCount >= items.length) {
                System.out.println("ตะกร้าเต็มแล้ว (สูงสุด 10 รายการ) ไม่สามารถเพิ่มสินค้าได้อีก") ;
                return;
            }
            items[itemCount] = p ;
            itemCount++ ;
        }

        public double calculateTotalPrice() {
            double sum = 0.0 ;
            for (int i = 0; i < itemCount; i++) {
                sum += items[i].getPrice() ;
            }
            return sum ;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter Product Number(Max10): ") ;
        int productCount = input.nextInt() ;

        if (productCount > 10) {
            System.out.println("จำนวนสินค้ามากกว่า 10 รายการ จะนับเฉพาะ 10 รายการแรก") ;
            productCount = 10 ;
        }

        if (productCount < 0) {
            System.out.println("จำนวนสินค้าไม่ถูกต้อง") ;
            input.close() ;
            return ;
        }

        ShoppingCart cart = new ShoppingCart() ;

        for (int i = 0; i < productCount; i++) {
            input.nextLine();

            System.out.print("Enter Product Name: ") ;
            String pname = input.nextLine() ;

            System.out.print("Enter Product Price: ") ;
            double price = input.nextDouble() ;
            if (price < 0) {
                System.out.println("ราคาสินค้าไม่ควรติดลบ จะถือว่าเป็น 0.0") ;
                price = 0.0 ;
            }

            Product products = new Product(pname, price) ;
            cart.addProduct(products) ;
        }

        double total = cart.calculateTotalPrice() ;
        System.out.println("Total price: " + total) ;
        
        input.close() ;
    }
}
