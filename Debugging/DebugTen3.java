// A PhoneBook is a Book with a city
import javax.swing.*;
public class FixDebugTen3
{
   public static void main(String[] args)
   {
      String area, inStr;
      int pages;
      area = JOptionPane.showInputDialog(null, "Enter city for phone book");
      inStr = JOptionPane.showInputDialog(null, "Enter number of pages in " + area + "'s phone book");
      pages = Integer.parseInt(inStr);
      FixDebugPhoneBook pb = new FixDebugPhoneBook(pages,area);
      pb.display();
   }
}