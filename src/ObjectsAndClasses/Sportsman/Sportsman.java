package ObjectsAndClasses.Sportsman;

public class Sportsman {
    int[] contestScore;

    public int averageScore(int[] contestScore) {
        int sum = 0;
        int average = 0;
        for (int i = 0; i < contestScore.length; i++) {
            sum += contestScore[i];
        }
        average = sum / contestScore.length;
        return average;
    }
}