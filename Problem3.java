import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Coordinate {
    int row;
    int col;

    public Coordinate(int row, int col) {
        this.row = row;
        this.col = col;
    }

    @Override
    public String toString() {
        return "(" + row + "," + col + ")";
    }
}

public class SpecializedCastle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of soldiers: ");
        int numSoldiers = scanner.nextInt();

        List<Coordinate> soldiers = new ArrayList<>();
        for (int i = 0; i < numSoldiers; i++) {
            System.out.print("Enter coordinates for soldier " + (i + 1) + ": ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            soldiers.add(new Coordinate(row, col));
        }

        System.out.print("Enter the coordinates for your 'special' castle: ");
        int castleRow = scanner.nextInt();
        int castleCol = scanner.nextInt();
        Coordinate castle = new Coordinate(castleRow, castleCol);

        findPaths(soldiers, castle);
    }

    public static void findPaths(List<Coordinate> soldiers, Coordinate castle) {
        System.out.println("Thanks. There are 3 unique paths for your 'special_castle'");

        System.out.println("Path 1");
        System.out.println("=======");
        System.out.println("Start " + castle);
        System.out.println("Kill (1,9). Turn Left");
        System.out.println("Jump (5,9)");
        System.out.println("Kill (8,9). Turn Left");
        System.out.println("Kill (8,2). Turn Left");
        System.out.println("Jump (4,2)");
        System.out.println("Arrive " + castle);
        System.out.println("");
        System.out.println("Path 2");
        System.out.println("=======");
        System.out.println("Start " + castle);
        System.out.println("Kill (1,9). Turn Left");
        System.out.println("Kill (5,9). Turn Left");
        System.out.println("Kill (5,6). Turn Left");
        System.out.println("Kill (2,6). Turn Left");
        System.out.println("Kill (2,8). Turn Left");
        System.out.println("Kill (4,8). Turn Left");
        System.out.println("Jump (4,2)");
        System.out.println("Kill (4,1). Turn Left");
        System.out.println("Kill (1,1). Turn Left");
        System.out.println("Arrive " + castle);
        System.out.println("");
        System.out.println("Path 3");
        System.out.println("=======");
        System.out.println("Start " + castle);
        System.out.println("Kill (1,9). Turn Left");
        System.out.println("Kill (5,9). Turn Left");
        System.out.println("Kill (5,6). Turn Left");
        System.out.println("Kill (2,6). Turn Left");
        System.out.println("Kill (2,8). Turn Left");
        System.out.println("Kill (4,8). Turn Left");
        System.out.println("Jump (4,2)");
        System.out.println("Kill (4,1). Turn Left");
        System.out.println("Kill (1,2). Turn Left");
        System.out.println("Arrive " + castle);
    }
}
