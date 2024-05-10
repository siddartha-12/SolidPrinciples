package SolidPrinciples.DependencyInversion;

public class Windows5Machine {
    private StandardKeyboard standardKeyboard;
    private Monitor monitor;
    Windows5Machine()
    {
        standardKeyboard = new StandardKeyboard();
        monitor = new Monitor();
    }
    //here we are using standard keyboard but in future if we want to use another
    //keyboard it wont useful ,same for Monitor also
    //To overcome this we will create interface Keyboard and other keyboards should extend and we pass that object in constructor
}
