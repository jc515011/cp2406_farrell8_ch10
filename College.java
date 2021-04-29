import javax.swing.*;
/**
 * Created by Yating Lei 29/04/21
 */
public class College {
    public static void main(String[] args) {
        // Get inputs and write directly to person class instance
        Person student = new Person(JOptionPane.showInputDialog(null, "Enter First Name"), JOptionPane.showInputDialog(null, "Enter Last Name"), JOptionPane.showInputDialog(null, "Enter Street Address"), JOptionPane.showInputDialog(null, "Enter Zip Code"), JOptionPane.showInputDialog(null, "Enter Phone Number"));
        student.display();
    }
}