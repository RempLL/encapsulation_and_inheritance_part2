public class Car extends Transport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyre() {
        super.updateTyre();
        checkEngine();
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
