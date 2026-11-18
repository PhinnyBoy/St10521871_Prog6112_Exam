/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mmola
 */
public class ProductCalculations implements IProductCalculations {
    private double price;

    // Constructor to receive the product price
    public ProductCalculations(double price) {
        this.price = price;
    }
   //Gets the VAT which is multiplied with 0.15
    @Override
    public double GetVat() {
        return price * 0.15;
    }
   //Which gets the commission which is multiplied with 0.05
    @Override
    public double GetCommission() {
        return price * 0.05;
    }
   //Which gets the Total of the Vat and Commssion and they are added
    @Override
    public double GetTotal() {
        return price + GetVat() + GetCommission();
    }
}
