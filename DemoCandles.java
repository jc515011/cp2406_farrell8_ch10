import javax.swing.*;
/**
 * Created by Yating Lei 29/04/21
 */
public class DemoCandles {
    public static void main(String[] args) {
        // Declare vars
        int height;
        String color, scent="";
        // Get inputs
        color = JOptionPane.showInputDialog(null, "Enter colour of candle");
        height = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter height of candle in inches"));
        scent = JOptionPane.showInputDialog(null, "Enter scent or \"no\" if not scented");
        if (!scent.equalsIgnoreCase("NO")) {
            ScentedCandle purchase = new ScentedCandle(color, height, scent);
            purchase.display();
        } else {
            Candle purchase = new Candle(color, height);
            purchase.display();
        }
    }
}