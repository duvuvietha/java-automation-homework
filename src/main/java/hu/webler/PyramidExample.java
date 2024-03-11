package hu.webler;

public class PyramidExample {

    public static void main(String[] args) {

        drawingHalfOfPyramid(8);

    }
    private static void drawingHalfOfPyramid(int edge) {
        for (int i = 1; i <= edge; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("+ ");
            }
            System.out.println();
        }
    }
}
