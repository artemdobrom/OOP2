public class Car extends MotorTransport {

    public Car(String modelName) {
        super(modelName, 4);
        System.out.println("Автомобиль " + getModelName()+" имеет "+ getWheelsCount()+" колеса ");
    }

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}
