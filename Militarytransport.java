public class Militarytransport extends Airtransport {

    boolean thepresenceofacapitulationsystem;
    int numberofmissilesonboard;
    public Militarytransport(double powerls, double speedkmh, double weightkg, String carbrand, double wingspanm, double minimumrunwaylengthfortakeoff,  boolean thepresenceofacapitulationsystem, int numberofmissilesonboard) {
        super(powerls, speedkmh, weightkg, carbrand, wingspanm, minimumrunwaylengthfortakeoff);
        this.thepresenceofacapitulationsystem = thepresenceofacapitulationsystem;
        this.numberofmissilesonboard = numberofmissilesonboard;
    }

    public boolean getThepresenceofacapitulationsystem() {
        return thepresenceofacapitulationsystem;
    }

    public int getNumberofmissilesonboard() {
        return numberofmissilesonboard;
    }

    public void setThepresenceofacapitulationsystem(boolean thepresenceofacapitulationsystem) {
        this.thepresenceofacapitulationsystem = thepresenceofacapitulationsystem;
    }

    public void setNumberofmissilesonboard(int numberofmissilesonboard) {
        this.numberofmissilesonboard = numberofmissilesonboard;
    }
    public void shot() {
        if (numberofmissilesonboard==0) {
            System.out.println("Боеприпасы отсутствуют!");
        } else {
            System.out.println("Ракета пошла!");
        }
    }
    public void ejection() {
        if (thepresenceofacapitulationsystem=true) {
            System.out.println("Катапультирование прошло успешно!");
        } else {
            System.out.println("У Вас нет такой системы!");
        }
    }


}
