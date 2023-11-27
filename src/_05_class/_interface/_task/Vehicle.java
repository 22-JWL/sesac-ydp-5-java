package _05_class._interface._task;

public abstract class Vehicle {
    String name;
    int maxSpeed;
    public Vehicle (String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public abstract void move();
}
