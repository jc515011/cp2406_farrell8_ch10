import javax.swing.*;
public class FixDebugPhoneBook extends FixDebugBook
{
   private String area;
   private String size;
   private final int CUTOFF = 30;
   public FixDebugPhoneBook(int page, String city)
   {
      super(page);
      area = city;
      if(page > CUTOFF){size = "big";}else{size = "small";}
   }
   public void display()
   {
      JOptionPane.showMessageDialog(null,"The phone book for " + area + " has " + pages + " pages.\nThat is a " + size + " phone book.");
   }
}