public class MyCar extends Car{

    @Override
    void description() {
        System.out.println("Model: " + model);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
    }

    public static void main(String[] args) {
        MyCar Chevrolet = new MyCar("Aveo", 120, "Blue");
        Chevrolet.gas(150);
        Chevrolet.brake(50);
        Chevrolet.description();

    }
    MyCar(String model, int speed, String color){
        this.model = model;
        this.speed = speed;
        this.color = color;
    }

}
