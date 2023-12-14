import java.util.ArrayList;

public class Corso {
    protected String nome;
    protected String data_di_inizio;
    protected int costo;
    protected ArrayList<Iscritto> iscritti;

    public Corso() {
        iscritti = new ArrayList<>();
    }

    public Corso(String nome, String data_di_inizio, int costo) {
        this.nome = nome;
        this.data_di_inizio = data_di_inizio;
        this.costo = costo;
        iscritti = new ArrayList<>();
    }

    public int quantiMaggiorenni() {
        int counter = 0;
        for (Iscritto iscritto : iscritti) {
            if (iscritto.getEta() >= 18) {
                counter += 1;
            }
        }
        return counter;
    }

    public int incassoGlobale() {
        int incasso = 0;
        for (Iscritto iscritto : iscritti) {
            if (iscritto.getEta() >= 18) {
                incasso += costo;
                continue;
            }
            incasso += costo * 80 / 100;
        }
        return incasso;
    }

    public int compareTo(Corso altro_corso) {
        int result = this.quantiMaggiorenni() - altro_corso.quantiMaggiorenni();
        if (result == 0) {
            return 0;
        }
        return (result > 0) ? 1 : -1;
    }

    public void setNome(String input) {
        nome = input;
    }

    public void setDataDiInizio(String input) {
        data_di_inizio = input;
    }

    public void setCosto(int input) {
        costo = input;
    }

    public String getNome() {
        return nome;
    }

    public String getDataDiInizio() {
        return data_di_inizio;
    }

    public int getCosto() {
        return costo;
    }
}