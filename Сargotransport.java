public class Сargotransport extends Groundtransport {
    double loadapacityt;

    public Сargotransport(double powerls, double speedkmh, double weightkg, String carbrand, int numberofwheels, double fuelconsumptionl, double loadapacityt) {
        super(powerls, speedkmh, weightkg, carbrand, numberofwheels, fuelconsumptionl);
        this.loadapacityt = loadapacityt;

    }

    public double getLoadapacityt() {
        return loadapacityt;
    }

    public void setLoadapacityt(int loadapacityt) {
        this.loadapacityt = loadapacityt;
    }
    public void loadingtransport(double weight) {
        if (loadapacityt >= weight) {
            System.out.println("Грузовик загружен!");
        } else {
            System.out.println("Вам нужен грузовик побольше!");
        }
    }

}
