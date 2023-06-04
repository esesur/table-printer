package tableprinter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> headers = Arrays.asList("NAME", "COST", "AMOUNT", "CATEGORY");
        List<List<String>> rows = new ArrayList<>();
        rows.add(Arrays.asList("Potato", "25", "14", "Food"));
        rows.add(Arrays.asList("Eggs", "30", "10", "Food"));
        rows.add(Arrays.asList("Bread", "37", "1", "Food"));
        rows.add(Arrays.asList("Cheese", "29", "2", "Also food"));
        TablePrinter tablePrinter = new TablePrinter();
        tablePrinter.print(headers, rows);
    }
}
