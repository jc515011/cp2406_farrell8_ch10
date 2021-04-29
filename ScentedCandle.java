import javax.swing.*;
/**
 * Created by Yating Lei 29/04/21
 */
public class ScentedCandle extends Candle
{
    protected String scent;
    private static int price=3;

    public ScentedCandle(String color, int height, String scented)
    {
        super(color, height);
        scent = scented;
    }
    public String getScent(){return scent;}
    public void display()
    {
        JOptionPane.showMessageDialog(null,"Mick's Wicks, " + scent + " sented, " + getColour() + ", " + getHeight() + " inches tall candle, will cost $" + (getHeight()*price));
    }
}