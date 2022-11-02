package Day3.Exc3;

import java.util.Objects;

public class Name implements Cloneable, Comparable<Name> {

    enum Prefix{
        Mrs,
        Ms,
        Mr,
        Dr,
        Prof
    }
    private String firstName;
    private String lastName;
    private Prefix prefix;
    public Name(Prefix prefix, String firstName, String lastName) {
        this.prefix = prefix;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object name) {
        if (this == name) return true;
        if (name == null || getClass() != name.getClass()) return false;
        Name name1 = (Name) name;
        return Objects.equals(firstName, name1.firstName) && Objects.equals(lastName, name1.lastName);
    }


    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, prefix);
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", prefix=" + prefix +
                '}';
    }

    @Override
    protected Name clone() throws CloneNotSupportedException {
        try{
            Name clone = (Name) super.clone();
            clone().firstName = new String(firstName);
            clone().lastName = new String(lastName);
            clone().prefix = Prefix.valueOf(String.valueOf(prefix));
            return clone;
        } catch (CloneNotSupportedException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public int compareTo(Name name) {
        if(this.firstName.compareTo(name.firstName) == -1){
            return -1;
        };
        if (this.firstName.compareTo(name.firstName) == 1){
            return 1;
        }
        else {
            if(this.lastName.compareTo(name.lastName) == -1){
                return -1;
            }
            if (this.lastName.compareTo(name.lastName) == 1){
                return 1;
            }
            else {
                return 0;
            }
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Prefix getPrefix() {
        return prefix;
    }
}
