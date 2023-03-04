public class Passengertransport extends Groundtransport {
    String bodytype;
    int numberofpassengers;
    double result;
    double result1;
    double distance;

    public Passengertransport(double powerls, double speedkmh, double weightkg, String carbrand, int numberofwheels, double fuelconsumptionl, String bodytype, int numberofpassengers) {
        super(powerls, speedkmh, weightkg, carbrand, numberofwheels, fuelconsumptionl);
        this.bodytype = bodytype;
        this.numberofpassengers = numberofpassengers;
    }

    public String getBodytype() {
        return bodytype;
    }

    public int getNumberofpassengers() {
        return numberofpassengers;
    }

    public void setBodytype(String bodytype) {
        this.bodytype = bodytype;
    }

    public void setPower(int numberofpassengers) {
        this.numberofpassengers = numberofpassengers;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void powercalculation() {
        result = super.powerls * 0.74;
            }

    public void displayInfo() {
        powercalculation();
        System.out.println("Мощность в л/с  -" + super.getPowerls() + "   Скорость в км/ч   -" + super.getSpeedkmh() + "    Масса в кг  -" + super.getweightkg() + "   Марка   -" + super.getCarbrand() + "     Количество колес   -" + super.getNumberofwheels() + "     Расход топлива (л/100 км)   -" + super.getFuelconsumptionl() + "     Тип кузова   -" + bodytype + "     Колличество пассажиров   -" + numberofpassengers + "     Мощность в кВ   -" + result);
    }

    private void calculationoffuelconsumption() {
        result1 = distance * super.fuelconsumptionl / 100;
    }

    public void calculationofhowmanykmthecarwilltravel(double time) {
        distance = time * super.speedkmh;
        calculationoffuelconsumption();
        System.out.println("за время -" + time + " ч, автомобиль -  " + super.carbrand + "   двигаясь с максимальной скоростью- " + super.speedkmh + "  км/ч, и проедет " + distance + "   -  км и израсходует " + result1 + " л топлива");
    }


}
