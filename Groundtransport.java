class Groundtransport extends Transport {
    int numberofwheels;
    double fuelconsumptionl;
    public Groundtransport(double powerls, double speedkmh, double weightkg, String carbrand, int numberofwheels, double fuelconsumptionl) {
        super(powerls, speedkmh, weightkg, carbrand);
        this.numberofwheels = numberofwheels;
        this.fuelconsumptionl = fuelconsumptionl;
    }
    public double getNumberofwheels() {
        return numberofwheels;
    }
    public double getFuelconsumptionl() {
        return fuelconsumptionl;
    }

    public void setNumberofwheels(int numberofwheels) {
        this.numberofwheels = numberofwheels;
    }

    public void setFuelconsumptionl(double fuelconsumptionl) {
        this.fuelconsumptionl = fuelconsumptionl;
    }


}
