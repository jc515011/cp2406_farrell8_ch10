import javax.swing.*;
/**
 * Created by Yating Lei 29/04/21
 */
public class DemoHorses
{
    public static void main(String[] args)
    {
        // Declare vars
        String name, colour;
        int year, races;
        // Get inputs
        name = JOptionPane.showInputDialog(null, "Enter horse's name");
        colour = JOptionPane.showInputDialog(null, "Enter horse's color");
        year = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter horse's age"));
        races = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter 0 or number of races competed in"));
        if(races!=0) {
            RaceHorse horse = new RaceHorse(name, colour, year, races);
            horse.display();
        }
        else
        {
            Horse horse = new Horse(name, colour, year);
            horse.display();
        }
    }
}