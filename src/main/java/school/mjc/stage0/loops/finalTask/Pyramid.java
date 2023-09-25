package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int length = cathetusLength;
        for (int i = 1; i <= cathetusLength; i++){
            length--;
            empty(length);
            left(i);
            right(i);
            System.out.println();
        }
    }

    private void empty(int height){
        for (int i = 1; i <= height; i++){
            System.out.print(" ");
        }
    }

    private void left(int height) {
        for (int j = height; j >= 2; j--){
            System.out.print(j);
        }
    }
    private void right(int height) {
        for (int j = 1; j <= height; j++){
            System.out.print(j);
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
