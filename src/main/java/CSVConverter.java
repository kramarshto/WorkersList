import au.com.bytecode.opencsv.CSVReader;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * class is converting data from CSV files to other forms.
 */
public class CSVConverter {
    private final String csvFilePath;

    /**
     * constructor
     * @param csvFilePath — path to file, which has String format
     */
    public CSVConverter(String csvFilePath) {
        this.csvFilePath = csvFilePath;
    }

    /**
     * this function converting workers data to List
     * @return List of Workers
     */
    public List<Worker> toList() {
        List<Worker> list = new ArrayList<>();
        try (InputStream in = getClass().getClassLoader().getResourceAsStream(csvFilePath);
             CSVReader reader = in == null ? null : new CSVReader(new InputStreamReader(in), ';')) {
            if (reader == null) {
                throw new FileNotFoundException(csvFilePath);
            }
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                Worker w = new Worker();
                w.setId(Integer.parseInt(nextLine[0]));
                w.setName(nextLine[1]);
                w.setGender(nextLine[2]);
                w.setBirthDate(nextLine[3]);
                w.setDivision(new Division(nextLine[4]));
                w.setSalary(Integer.parseInt(nextLine[5]));
                list.add(w);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}