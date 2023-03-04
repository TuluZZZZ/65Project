public class Transport {
    public double powerls;
    public double speedkmh;
    public double weightkg;
    public String carbrand;

    public Transport(double powerls, double speedkmh, double weightkg, String carbrand) {
        this.powerls = powerls;
        this.speedkmh = speedkmh;
        this.weightkg = weightkg;
        this.carbrand = carbrand;
    }
    public double getPowerls() {
        return powerls;
    }
    public double getSpeedkmh() {
        return speedkmh;
    }
    public double getweightkg() {
        return weightkg;
    }
    public String getCarbrand() {
        return carbrand;
    }
    public void setPower(double powerls) {
        this.powerls = powerls;
    }
    public void setSpeedkmh(double speedkmh) {
        this.speedkmh = speedkmh;
    }
    public void setWeightkg(double weightkg) {
        this.weightkg = weightkg;
    }
    public void setcarbrand(String carbrand) {
        this.carbrand = carbrand;
    }
}
