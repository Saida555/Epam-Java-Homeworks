package ObjectsAndClasses.Sportsman;

public class Main {
    public static void main(String[] args) {
        Sportsman sportsman1 = new Sportsman();
        int average1 = sportsman1.averageScore(new int[]{50, 100, 60});
        Sportsman sportsman2 = new Sportsman();
        int average2 = sportsman2.averageScore(new int[]{90, 60});

        System.out.println("The average scores of sportsmen are " + average1 + " " + average2);
    }
}