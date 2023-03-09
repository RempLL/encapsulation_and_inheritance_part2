public class ServiceStation {

    public void check(Car car) {
        print(car);
        if (car != null) {
            car.checkEngine();
        }
    }

    public void check(Truck truck) {
        print(truck);
        if (truck != null) {
            truck.checkEngine();
            truck.checkTrailer();
        }
    }

    public void check(Bicycle bicycle) {
        print(bicycle);
    }

    private void print(Transport transport) {
        if (transport != null) {
            System.out.println("Обслуживаем " + transport.getModelName());
            for (int i = 0; i < transport.getWheelsCount(); i++) {
                transport.updateTyre();
            }
        }
    }
}
