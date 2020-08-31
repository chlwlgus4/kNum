import java.util.Arrays;

public class Application {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] bfArray;
        for (int i = 0; i < commands.length; i++) {
            bfArray = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(bfArray);
            int index = (commands[i][2]) - 1;
            answer[i] = bfArray[index];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(solution(array, commands));
    }
}
