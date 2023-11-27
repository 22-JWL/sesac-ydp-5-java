package _07_generic._Tesk;

class Calculator<T extends Number> {
    private T num1, num2;

    public Calculator(T num1, T num2) {
        super();
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return num1.doubleValue() + num2.doubleValue();
    }
}

public class B {
    public static void main(String[] args) {
        Calculator<Integer> calculator1 = new Calculator<>(12, 10);
        Calculator<Double> calculator2 = new Calculator<>(2.43, 1.9);

        System.out.println("Integer Sum : " + calculator1.add());
        System.out.println("Double Sum : " + calculator2.add());
    }
}
