public abstract class Car {
    String model;
    int speed;
    String color;

    void gas(int gas){
        System.out.println("Gas: " +gas);
    }
    void brake(int brake) {
        System.out.println("Brake: " + brake);
    }
    abstract void description();

}
