import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Angebot {
double regulärpreis;
GregorianCalendar flugdatum;
String flugnummer;
double reduzierterPreis;
Rabattstrategie rabattstrategie;

    public Angebot(double regulärpreis, GregorianCalendar flugdatum, String flugnummer) {
        this.regulärpreis = regulärpreis;
        this.flugdatum = flugdatum;
        this.flugnummer = flugnummer;

        SimpleDateFormat reformat = new SimpleDateFormat("MMMM");
        String newFormat = reformat.format(flugdatum.getTime());

        if (newFormat.equals("Januar") || newFormat.equals("April") || newFormat.equals("Oktober")) {
            this.rabattstrategie = new MaxiDiscount("MaxiDiscount");
        } else if (newFormat.equals("Februar") || newFormat.equals("März")) {
            this.rabattstrategie = new MidiDiscount("MidiDiscount");
        } else {
            this.rabattstrategie = new ZeroDiscount("ZeroDiscount");
        }
    }

    public double getRegulärpreis() {
        return regulärpreis;
    }

    double getReduzierterPreis() {
        return rabattstrategie.getReduzierterPreis(regulärpreis);
    }

    public void setRegulärpreis(double regulärpreis) {
        this.regulärpreis = regulärpreis;
    }

    public GregorianCalendar getFlugdatum() {
        return flugdatum;
    }

    public void setFlugdatum(GregorianCalendar flugdatum) {
        this.flugdatum = flugdatum;
    }

    public String getFlugnummer() {
        return flugnummer;
    }

    public void setFlugnummer(String flugnummer) {
        this.flugnummer = flugnummer;
    }


    @Override
    public String toString() {
        return "Angebot{" +
                "regulärpreis=" + regulärpreis +
                ", flugdatum=" + flugdatum +
                ", flugnummer='" + flugnummer + '\'' +
                '}';
    }
}
