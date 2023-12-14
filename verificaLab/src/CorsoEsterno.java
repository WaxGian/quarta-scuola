public class CorsoEsterno extends Corso {
    String localita;
    int costo_di_trasporto;

    public void setLocalita(String input) {
        localita = input;
    }

    public void setCostoDiTrasporto(int input) {
        costo_di_trasporto = input;
    }

    public String getLocalita() {
        return localita;
    }

    public int getCostoDiTrasporto() {
        return costo_di_trasporto;
    }

    public int incassoGlobale() {
        return super.incassoGlobale() + costo_di_trasporto * iscritti.size();
    }
}
