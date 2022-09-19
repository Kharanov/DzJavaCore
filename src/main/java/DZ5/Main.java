package DZ5;

public class Main {
    public static void main(String[] args) {
        String[] header = {"Value 1", "Value 2", "Value 3"};
        int[][] data = new int[2][3];
        data[0][0] = 5000;
        data[0][1] = 6000;
        data[0][2] = 7586;
        data[1][0] = 467967;
        data[1][1] = 9854;
        data[1][2] = 8768767;

        CsvFileWriter fileWriter = new CsvFileWriter();
        AppData appData = new AppData(header, data);
        fileWriter.save(appData);

        CsvFileReader fileReader = new CsvFileReader();
        fileReader.read();
    }
}
