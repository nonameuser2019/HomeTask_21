public class HisCar implements CarInterface {


    public void gas(int gas)

    {
        System.out.println("Gas: " + gas);
    }

    public void brake(int brake)

    {
        System.out.println("Brake: " + brake);
    }
    public void description(String model, int speed, String color) {
        System.out.println("Model: " + model);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
    }

    public static void main(String[] args) {
        HisCar Zaz = new HisCar();
        Zaz.gas(100);
        Zaz.brake(30);
        Zaz.description("Lanos", 120, "Blue");

    }
    /*HisCar(String model, int speed, String color)
    {
        this.model = model;
        this.speed = speed;
        this.color = color;
    }*/

}
