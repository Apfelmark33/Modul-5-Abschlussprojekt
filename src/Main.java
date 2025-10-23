import java.util.Calendar;
import java.util.GregorianCalendar;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Angebot angebot1 = new Angebot(150.35, new GregorianCalendar(1920 , Calendar.JANUARY, 5),"213123");
        Angebot angebot2 = new Angebot(150.35, new GregorianCalendar(1920 , Calendar.FEBRUARY, 5),"213123");
        Angebot angebot3 = new Angebot(150.35, new GregorianCalendar(1920 , Calendar.JULY, 5),"213123");
        System.out.println("------- MaxiDiscount -------");
        System.out.println("rabattierter Preis: " + angebot1.getReduzierterPreis());
        System.out.println("------- MidiDiscount -------");
        System.out.println("rabattierter Preis: " + angebot2.getReduzierterPreis());
        System.out.println("------- ZeroDiscount -------");
        System.out.println("rabattierter Preis: " + angebot3.getReduzierterPreis());
    }
}