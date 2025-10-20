public class MidiDiscount extends Rabattstrategie{

    public MidiDiscount(String a) {
        super(a);
    }
    @Override
    public double getReduzierterPreis(double i){
        return i*85/100;
    }
}
