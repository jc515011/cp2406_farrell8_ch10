import javax.swing.*;
/**
 * Created by Yating Lei 29/04/21
 */
public class Horse
{
    private String name;
    private String colour;
    private int year;

    public Horse(String aname, String acolour, int ayear)
    {
        name=aname;
        colour=acolour;
        year=ayear;
    }
    public String getName()
    {
        return name;
    }
    public String getColour()
    {
        return colour;
    }
    public int getAge(){ return year; }
    public void display()
    {
        JOptionPane.showMessageDialog(null,"Your horse named " + name + " has nice " + colour + " hair, and is " + year + " years old.");
    }
}