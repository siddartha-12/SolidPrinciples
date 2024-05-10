package SolidPrinciples.DependencyInversion;

public class WindowsLatestMachine {
    private Keyboard keyboard;
    private Monitor monitor;
    WindowsLatestMachine(Keyboard keyboard, Monitor monitor)
    {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
    //now it will work for any type of keyboard
    //similarly we need to use same approach for Monitor
}
