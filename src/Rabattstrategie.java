public class Rabattstrategie {
    String bezeichnung;

public Rabattstrategie(String bezeichnung){
    this.bezeichnung = bezeichnung;
}
public double getReduzierterPreis(double preis) {
    return preis;
}

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }
}
