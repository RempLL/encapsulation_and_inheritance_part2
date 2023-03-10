public class Truck extends Transport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyre() {
        super.updateTyre();
        checkEngine();
        checkTrailer();
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
