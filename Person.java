import javax.swing.*;
/**
 * Created by Yating Lei 29/04/21
 */
public class Person {
    private String firstName;
    private  String lastName;
    private  String street;
    private  String zipCode;
    private  String phone;
    public Person(String fName, String lName, String st, String zip, String ph)
    {
        setFirstName(fName);
        setLastName(lName);
        setAddress(st);
        setZipCode(zip);
        setPhone(ph);
    }
    public void setFirstName(String fName){this.firstName = fName;}
    public void setLastName(String lName){this.lastName = lName;}
    public void setAddress(String address){this.street = address;}
    public void setZipCode(String zip){this.zipCode = zip;}
    public void setPhone(String phon){this.phone = phon;}

    public String getFirstName(){return this.firstName;}
    public String getLastName(){return this.lastName;}
    public String getAddress(){return this.street;}
    public String getZipCode(){return this.zipCode;}
    public String getPhone(){return this.phone;}

    public void display()
    {
        JOptionPane.showMessageDialog(null, "Student " + getFirstName() + " " + getLastName() + " of " + getAddress() + " " + getZipCode() + " has the phone number " + getPhone());
    }
}
