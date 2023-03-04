import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Search {

    public int searchMaxProfit(int[] data) {
        List<Integer> profits = new ArrayList<>();
        int count;
        int lastProfit;
        for (int i = 0; i < data.length; i++) {
            count = 1;
            lastProfit = data[i];
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] < data[j]) {
                    if (lastProfit < data[j]) {
                        count++;
                        lastProfit = data[j];
                    }
                }
            }
            profits.add(count);
        }

        return Collections.max(profits);
    }


    public static void main(String argv[]) {
        Search a = new Search();
        int[] arr = {-1, -2, 5, -2, 10, -1, 0, 2, 11};
        int max = a.searchMaxProfit(arr);
        System.out.println(max);
    }
}
