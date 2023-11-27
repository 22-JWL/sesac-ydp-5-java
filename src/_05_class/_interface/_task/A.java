package _05_class._interface._task;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A {
    public static void main(String[] args) {

        Car c = new Car("car", 100);
        Airplane a = new Airplane("plane", 10000);
        List<Vehicle> Vehicle = new ArrayList<Vehicle>(Arrays.asList(c, a));
        for (Vehicle v : Vehicle) {
            v.move();
            if (v instanceof Airplane) {
                ((Airplane) v).fly();
            }
        }
    }
}
