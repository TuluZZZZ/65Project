public class Airtransport extends Transport {

    double wingspanm;
    double minimumrunwaylengthfortakeoff;

    public Airtransport(double powerls, double speedkmh, double weightkg, String carbrand, double wingspanm, double minimumrunwaylengthfortakeoff) {
        super(powerls, speedkmh, weightkg, carbrand);
        this.wingspanm = wingspanm;
        this.minimumrunwaylengthfortakeoff = minimumrunwaylengthfortakeoff;
    }

    public double getWingspanm() {
        return wingspanm;
    }

    public double getNinimumrunwaylengthfortakeoff() {
        return minimumrunwaylengthfortakeoff;
    }

    public void setWingspanm(int wingspanm) {
        this.wingspanm = wingspanm;
    }

    public void setMinimumrunwaylengthfortakeoff(double minimumrunwaylengthfortakeoff) {
        this.minimumrunwaylengthfortakeoff = minimumrunwaylengthfortakeoff;
    }


}
