/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mmola
 */
import java.util.Scanner;

public class MattressSalesExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Single array for product names
        String[] products = {
            "Cozy Nights Monarch", 
            "Restonic Barbados", 
            "Sealy Phuket"
        };
        
        // Two-dimensional array for sales (3 products, 3 months)
        int[][] sales = new int[3][3];

        // Loop to capture input matching the sample screenshot format
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter number of sales for month " + (j + 1) + " for " + products[i] + ": ");
                sales[i][j] = scanner.nextInt();
            }
        }

        System.out.println();

        // Instantiate business logic and print classes
        Product prodLogic = new Product(sales, products);
        PrintProduct printer = new PrintProduct();
        
        // Print the report
        printer.printReport(prodLogic);
    }
}
