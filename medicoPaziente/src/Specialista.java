public class Specialista extends Medico {
    private String specializzazione;
    private int costo;

    public Specialista(String name, String surname, String telephoneNumber, String specializzazione, int costo) {
        super(name, surname, telephoneNumber);
        this.specializzazione = specializzazione;
        this.costo = costo;
    }

    public String toString() {
        return super.toString() + " " + specializzazione + " " + costo + "/hr";
    }

}
