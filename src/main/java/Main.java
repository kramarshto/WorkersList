import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CSVConverter converter = new CSVConverter("foreign_names.csv");
        List<Worker> workerList = new ArrayList<>(converter.toList());
        for (int i = 0; i < 5; i++) {
            System.out.println(workerList.get(i));
        }
    }
}
