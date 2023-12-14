import java.util.ArrayList;

public class Medico extends Persona {

    protected ArrayList<Persona> pazienti;

    public Medico(String inputName, String inputSurname, String inputTelephoneNumber) {
        super(inputName, inputSurname, inputTelephoneNumber);
        pazienti = new ArrayList<>();
    }

    public void addPaziente(Persona paziente) {
        pazienti.add(paziente);
    }

    public String toString() {
        return super.toString();
    }

    public Persona[] getPazienti() {
        pazienti.sort(new PersonComparator());
        return pazienti.toArray(new Persona[pazienti.size()]);
    }

}
