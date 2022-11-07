package Day3.Exc3;

import java.util.Objects;

public class Contact implements Cloneable, Comparable<Contact> {
    Name name;
    PhoneNumber phoneNumber;

    public Contact(Name name, PhoneNumber phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }


    @Override
    public boolean equals(Object cont) {
        if (this == cont) return true;
        if (cont == null || getClass() != cont.getClass()) return false;
        Contact contact = (Contact) cont;
        return Objects.equals(name, contact.name) && Objects.equals(phoneNumber, contact.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNumber);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name=" + name +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    @Override
    protected Contact clone() throws CloneNotSupportedException {
        try {
            Contact clone = (Contact) super.clone();
            clone().name =  new Name(clone.name.getPrefix(),clone.name.getFirstName(),clone.name.getLastName());
            clone().phoneNumber = new PhoneNumber(clone.phoneNumber.getAreaCode(),clone.phoneNumber.getNumber());
            return clone;
        } catch (CloneNotSupportedException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public int compareTo(Contact contact) {
        if ((this.name.compareTo(contact.name)) == 0) {
            if(this.phoneNumber.compareTo(contact.phoneNumber) == 0){
                return 0;
            }
        }
            return -1;
    }
}
