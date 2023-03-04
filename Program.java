import java.util.Random;

public class Program {
    public static void main(String[] args) {
        int[] mas = new int[14];
        for (int i = 0; i < mas.length; i++) {
            Random ran = new Random();
            int x = ran.nextInt(11) + 0;
            Student kontr = new Student("№" + (i + 1), 65, x);
            if (x == 9 | x == 10) {
                kontr.displayInfo();
                System.out.println("отличник группы   №" + kontr.group);
            }
        }
    }
}




