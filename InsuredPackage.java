import javax.swing.*;
/**
 * Created by Yating Lei 29/04/21
 */
public class InsuredPackage extends Package
{
    public InsuredPackage(int w, char s)
    {
        super(w,s);
    }
    public void display()
    {
        JOptionPane.showMessageDialog(null,
                "-----------------------------------------------------------------------\n" +
                "  Shipping Cost Before Insurance ($)            Additional Cost ($)    \n" +
                "-----------------------------------------------------------------------\n" +
                "   0 to 1.00                                             2.45          \n" +
                "   1.01 to 3.00                                          3.05          \n" +
                "   3.01 and over                                         5.55          \n" +
                "-----------------------------------------------------------------------");
    }

}
