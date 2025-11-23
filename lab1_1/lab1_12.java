package lab1_1 ;

import java.util.Scanner ;

public class lab1_12 {

    public static int findProductIndex(int[] productId, int searchId) {
        for (int i = 0; i < productId.length; i++) {
            if (productId[i] == searchId) {
                return i ;
            }
        }
        return -1 ;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in) ;
        try {
            System.out.println("InventoryManagement") ;
            System.out.print("Please Enter Number of Size Item : ") ;

            if (!input.hasNextInt()) {
                System.out.println("Enter only Number") ;
                return ;
            }

            int n = input.nextInt() ;

            if (n <= 0) {
                System.out.println("Enter only Number") ;
                return ;
            }

            int[] productId = new int[n] ;
            int[] quantity = new int[n] ;

            for (int i = 0; i < n; i++) {
                System.out.print("Enter Product ID [Item" + (i + 1) + "] : ") ;
                if (!input.hasNextInt()) {
                    System.out.println("Enter only Number") ;
                    return ;
                }
                productId[i] = input.nextInt() ;

                System.out.print("Enter Stock Quantity [Item" + (i + 1) + "] : ") ;
                if (!input.hasNextInt()) {
                    System.out.println("Enter only Number") ;
                    return ;
                }
                quantity[i] = input.nextInt() ;

            }

            System.out.print("Enter Product ID to search : ") ;
            if (!input.hasNextInt()) {
                System.out.println("Enter only Number") ;
                return ;
            }

            int searchId = input.nextInt() ;
            int idx = findProductIndex(productId, searchId) ;

            if (idx >= 0) {
                System.out.println(quantity[idx]) ;
            }else{
                System.out.println("Product : " + searchId + " not found") ;
            }

        }finally{
            input.close() ;
        }
    }
}
