package SolidPrinciples.LiskovPrinciple;

public class ElectricCar implements Car{

    @Override
    public void startEngine() {
        throw new AssertionError("No motor engine for electric vechile");
        //it violates the interface contract without implementing method;
        //one way we can avoid is we can this method as optinal in interface.
    }

    @Override
    public void accelerate() {
        System.out.println("accelerated");
    }

    @Override
    public void applyBreak() {
        System.out.println("break applied.");
    }
}
