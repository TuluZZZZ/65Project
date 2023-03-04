public class Cat {
    String name;
    int age;
    int feedquantity;

    public Cat(String name, int age, int feedquantity) {
        this.name = name;
        this.age = age;
        this.feedquantity = feedquantity;
    }

    public static boolean feeding(int feedquantity) {
        if (feedquantity > 100) {
            System.out.println("Кот наелся!");
            return true;
        } else {
            System.out.println("Кот не наелся!");
            return false;
        }
    }
}




