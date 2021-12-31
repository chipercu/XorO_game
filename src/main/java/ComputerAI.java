import java.util.ArrayList;
import java.util.List;

public class ComputerAI {


    public static int[][] array;
    public static boolean [] cellCheck;

    public ComputerAI(int [][] array, boolean[] cellCheck) {
        this.array = array;
        this.cellCheck = cellCheck;
    }

    public int computerMedium() {
        int cell = 3;
        int[] arr = {0, array[1][5], array[5][5], array[9][5], array[1][15], array[5][15], array[9][15], array[1][24], array[5][24], array[9][24]};
        List<Integer> stage = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            if (arr[i] > 0) {
                stage.add(arr[i]);

            }
        }
        if (stage.size() == 1 && arr[5] == 3) {
            cell = StartGame.Rnd.getInt(1, 4);
            switch (cell) {
                case 1:
                    cell = 1;
                    break;
                case 2:
                    cell = 3;
                    break;
                case 3:
                    cell = 7;
                    break;
                case 4:
                    cell = 9;
                    break;
            }
        } else if (stage.size() == 1 && (arr[1] == 3 || arr[3] == 3 || arr[7] == 3 || arr[9] == 3)) {
            cell = StartGame.Rnd.getInt(1, 5);
            switch (cell) {
                case 1:
                    cell = 2;
                    break;
                case 2:
                    cell = 4;
                    break;
                case 3:
                    cell = 6;
                    break;
                case 4:
                    cell = 8;
                    break;
                case 5:
                    cell = 5;

            }
        } else if (stage.size() >= 2) {
            cell = StartGame.Rnd.getInt(1, 9);
            while (cellCheck[cell]) {
                cell = StartGame.Rnd.getInt(1, 9);
            }
        }
        return cell;
    }
}
