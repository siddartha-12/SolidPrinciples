package SolidPrinciples.LiskovPrinciple;

public class MotorCar implements Car{
    @Override
    public void startEngine() {
        System.out.println("Engine started");
    }

    @Override
    public void accelerate() {
        System.out.println("accelerated");
    }

    @Override
    public void applyBreak() {
        System.out.println("break applied");
    }
}
