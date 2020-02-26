package classwork;

import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Invoice invoice1 = new Invoice();
        Invoice invoice2 = new Invoice();
        
        invoice1.setPartNum("Part001");
        invoice2.setPartNum("Part002");
        
        invoice1.setPartDescription("This is part 1.");
        invoice2.setPartDescription("This is part 2.");
        
        invoice1.setPrice(10.00);
        invoice2.setPrice(5.00);
        
        System.out.println("Enter the part you want to buy (1 or 2): ");
        int part = in.nextInt();
        
        System.out.println("Enter the amount you want to buy: ");
        int amount = in.nextInt();
        
        System.out.println("Your order has been placed.");
        
        if(part == 1){
            invoice1.setQuantity(amount);
            System.out.printf("Total due is $%.2f.%n", invoice1.getInvoiceAmount());
        }
        else if(part == 2){
            invoice2.setQuantity(amount);
            System.out.printf("Total due is $%.2f.%n", invoice2.getInvoiceAmount());
        }
    }
}
