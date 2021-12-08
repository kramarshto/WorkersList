import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CSVConverterTest {

    @Test
    void toList() {
        CSVConverter converter = new CSVConverter("foreign_names.csv");
        List<Worker> workerList = new ArrayList<>(converter.toList());
        boolean notNull = true;
        for (int i = 0; i < 1000; i++) {
            if(!checkNotNull(workerList.get(i)))
                notNull = false;
        }
        Assertions.assertTrue(notNull);
    }

    private boolean checkNotNull(Worker worker) {
        return worker.getId() != 0 && worker.getName() != null && worker.getGender() != null && worker.getBirthDate() != null && worker.getDivisionClass() != null && worker.getSalary() != 0;
    }
}