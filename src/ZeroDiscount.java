public class ZeroDiscount extends Rabattstrategie{
    public ZeroDiscount(String a) {
        super(a);
    }
    @Override
    public double getReduzierterPreis(double i){
        return i;
    }
}
