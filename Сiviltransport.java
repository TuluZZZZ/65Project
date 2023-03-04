public class Сiviltransport extends Airtransport {

    int numberofpassengers;
    boolean availabilityofbusinessclass;

    public Сiviltransport(double powerls, double speedkmh, double weightkg, String carbrand, double wingspanm, double minimumrunwaylengthfortakeoff, int numberofpassengers, boolean availabilityofbusinessclass) {
        super(powerls, speedkmh, weightkg, carbrand, wingspanm, minimumrunwaylengthfortakeoff);
        this.numberofpassengers = numberofpassengers;
        this.availabilityofbusinessclass = availabilityofbusinessclass;
    }

    public int getNumberofpassengers() {
        return numberofpassengers;
    }

    public boolean getAvailabilityofbusinessclass() {
        return availabilityofbusinessclass;
    }

    public void setNumberofpassengers(int numberofpassengers) {
        this.numberofpassengers = numberofpassengers;
    }

    public void setAvailabilityofbusinessclass(boolean availabilityofbusinessclass) {
        this.availabilityofbusinessclass = availabilityofbusinessclass;
    }
    public void passengercapacity(int numberofpassengers1) {
        if (numberofpassengers >= numberofpassengers1) {
            System.out.println("Самолет загружен!");
        } else {
            System.out.println("Вам нужен самолет побольше!");
        }
    }



}
