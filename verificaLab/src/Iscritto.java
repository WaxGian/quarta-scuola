public class Iscritto {
    String nome;
    String cognome;
    int telefono;
    int eta;

    public Iscritto(String nome, String cognome, int telefono, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.telefono = telefono;
        this.eta = eta;
    }

    public void setNome(String input) {
        nome = input;
    }

    public void setCognome(String input) {
        cognome = input;
    }

    public void setTelefono(int input) {
        telefono = input;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getTelefono() {
        return telefono;
    }

    public int getEta() {
        return eta;
    }

}
