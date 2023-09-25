package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    private int height;
    public void printHalfPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++){
            for (int j = cathetusLength - i; j >= 1; j--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
