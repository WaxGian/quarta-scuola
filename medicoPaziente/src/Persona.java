
public class Persona {
    protected String name;
    protected String surname;
    protected String telephoneNumber;
    // default is public for some godforsaken reason
    // i mean tf normally in OOP everything should be private unless specified

    public Persona(String inputName, String inputSurname, String inputTelephoneNumber) {
        name = inputName;
        surname = inputSurname;
        telephoneNumber = inputTelephoneNumber;
    }

    public String toString() {
        return name + " " + surname + " " + telephoneNumber;
    }

    public void setNome(String input) {
        name = input;
    }

    public void setSurname(String input) {
        surname = input;
    }

    public void setTelephoneNubmer(String input) {
        telephoneNumber = input;
    }

}
