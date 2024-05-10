package SolidPrinciples.InterfaceSegregation;

public interface Zookeeper {
    public void cleanZoo();
    public void feedAnimals();
    public void petAnimals();// some zookeeper don't like to do this pet animals job but with this who ever zookeeper he must do this
    //so solve this we can split this methods in to different interfaces
}
