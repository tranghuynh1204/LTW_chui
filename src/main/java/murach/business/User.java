package murach.business;

import java.io.Serializable;

public class User implements Serializable {
    private String dateofBirth;
    private String firstName;
    private String lastName;
    private String email;

    public String getKnowVia() {
        return knowVia;
    }

    public void setKnowVia(String knowVia) {
        this.knowVia = knowVia;
    }

    public String[] getYes() {
        return yes;
    }

    public void setYes(String[] yes) {
        this.yes = yes;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    private String knowVia;
    private String[] yes;
    private String contact;
    
    public User() {
        dateofBirth="";
        firstName = "";
        lastName = "";
        email = "";
        
    }
    
    public User(String dateofBirth, String firstName, String lastName, String email, String knowVia, String[] Yes, String Contact) {
        this.dateofBirth = dateofBirth;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.knowVia = knowVia;
        this.yes = Yes;
        this.contact = Contact;
    }
    
    public String getdateofBirth() {
        return dateofBirth;
    }
    
    public void setdateofBirth(String dateofBirth) {
        this.dateofBirth = dateofBirth;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
