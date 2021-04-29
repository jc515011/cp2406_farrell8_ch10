import javax.swing.*;
/**
 * Created by Yating Lei 29/04/21
 */
public class Package
{
    protected int weight;
    protected char shipping;
    protected double cost=0.00;

    public Package(int w, char s)
    {
        weight=w;
        shipping = Character.toUpperCase(s);
        calculateCost();
    }
    private String dollars(Double adam)
    {
        // convert double to string with two decimal places
        return String.format("%1$.2f", adam);
    }
    public void calculateCost()
    {
        int small=8, medium=16;
        if (weight<=small)
        {
            switch (shipping)
            {
                case 'A':  cost = (weight*2.00);
                    break;
                case 'T':  cost = (weight*1.50);
                    break;
                case 'M':  cost = (weight*0.50);
                    break;
            }
        }
        else if (weight<=medium)
        {
            switch (shipping)
            {
                case 'A':  cost = (weight*3.00);
                    break;
                case 'T':  cost = (weight*2.35);
                    break;
                case 'M':  cost = (weight*1.50);
                    break;
            }
        }
        else
        {
            switch (shipping)
            {
                case 'A':  cost = (weight*4.50);
                    break;
                case 'T':  cost = (weight*3.25);
                    break;
                case 'M':  cost = (weight*.15);
                    break;
            }
        }
        JOptionPane.showMessageDialog(null,"Shipping a package " + weight + " ounces in weight, via " + whichShipping(shipping) + " shipping, will cost $" + dollars(cost));
    }
    protected String whichShipping(char s)
    {
        String temp="ERROR";
        s = Character.toUpperCase(s);
        switch (s)
        {
            case 'A':  temp = "Air";
                break;
            case 'T':  temp = "Truck";
                break;
            case 'M':  temp = "Mail";
                break;
        }
        return temp;
    }
    public void display()
    {
        JOptionPane.showMessageDialog(null,"-----------------------------------------------------------------------\n" +
                                           "  Weight (oz.)          Air ($)           Truck ($)          Mail ($)  \n" +
                                           "-----------------------------------------------------------------------\n" +
                                           "  1 to 8                2.00              1.50                .50      \n" +
                                           "  9 to 16               3.00              2.35               1.50      \n" +
                                           "  17 and over           4.50              3.25               2.15      \n" +
                                           "-----------------------------------------------------------------------");
    }
}
