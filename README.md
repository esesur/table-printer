# table-printer
Prints formatted table.  
Usage:
```
List<String> headers = Arrays.asList("NAME", "COST", "AMOUNT", "CATEGORY");
List<List<String>> rows = new ArrayList<>();
rows.add(Arrays.asList("Potato", "25", "14", "Food"));
rows.add(Arrays.asList("Eggs", "30", "10", "Food"));
rows.add(Arrays.asList("Bread", "37", "1", "Food"));
rows.add(Arrays.asList("Cheese", "29", "2", "Also food"));
TablePrinter tablePrinter = new TablePrinter();
tablePrinter.print(headers, rows);
```
Output:
```
+--------+------+--------+-----------+
| NAME   | COST | AMOUNT | CATEGORY  |
+--------+------+--------+-----------+
| Potato | 25   | 14     | Food      |
| Eggs   | 30   | 10     | Food      |
| Bread  | 37   | 1      | Food      |
| Cheese | 29   | 2      | Also food |
+--------+------+--------+-----------+
```
