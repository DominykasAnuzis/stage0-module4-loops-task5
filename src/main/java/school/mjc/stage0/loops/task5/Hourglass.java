package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 1; i <= height; i++){
            for (int j = 1; j <= height; j++){
                if(i == 1 ||
                        i == height ||
                        i == j ||
                        j == height - i + 1 ||
                        j > i && j < height - i + 1 ||
                        j < i && j > height - i + 1
                ){
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
