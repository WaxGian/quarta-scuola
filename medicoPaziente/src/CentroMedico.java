import java.util.ArrayList;

public class CentroMedico {
    private ArrayList<Persona> pazienti;
    private ArrayList<Medico> medici;

    public CentroMedico() {
        pazienti = new ArrayList<>();
        medici = new ArrayList<>();
    }

    public void printPazienti() {
        pazienti.sort(new PersonComparator());
        for (int i = 0; i < pazienti.size(); i++) {
            System.out.println((i + 1) + ". " + pazienti.get(i).toString());
        }
    }

    public void printMedici() {
        medici.sort(new PersonComparator());
        for (int i = 0; i < medici.size(); i++) {
            System.out.println((i + 1) + ". " + medici.get(i).toString());
        }
    }

    public void addMedico(Medico medico) {
        medici.add(medico);
    }

    public void addPaziente(Persona paziente) {
        pazienti.add(paziente);
    }
}
