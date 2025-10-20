public class MaxiDiscount extends Rabattstrategie{

    public MaxiDiscount(String a) {
        super(a);
    }
@Override
public double getReduzierterPreis(double i){
    return i*70/100;
}
}
