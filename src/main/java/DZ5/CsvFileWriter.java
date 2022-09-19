package DZ5;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class CsvFileWriter {
    public void save(AppData appData) {
        try (OutputStream out = new BufferedOutputStream(new
                FileOutputStream("demo.txt"))) {
            String[] header = appData.header;
            for (int i = 0; i < header.length; i++) {
                if (i != header.length - 1) {
                    out.write((header[i] + ";").getBytes(StandardCharsets.UTF_8));
                } else {
                    out.write((header[i] + "\n").getBytes(StandardCharsets.UTF_8));
                }

            }
            int[][] data = appData.data;
            for (int i = 0; i < data.length; i++) {
                if (i != data.length - 1) {
                    for (int j = 0; j < data[i].length; j++) {
                        String stringData = String.valueOf(data[i][j]);
                        if (j != data[i].length - 1) {
                            out.write((data[i][j] + ";").getBytes(StandardCharsets.UTF_8));
                        } else {
                            out.write((stringData + "\n").getBytes(StandardCharsets.UTF_8));
                        }
                    }
                }
                else {
                    for (int j = 0; j < data[i].length; j++) {
                        String stringData = String.valueOf(data[i][j]);
                        if (j != data[i].length - 1) {
                            out.write((data[i][j] + ",").getBytes(StandardCharsets.UTF_8));
                        } else {
                            out.write((stringData + "\n").getBytes(StandardCharsets.UTF_8));
                        }
                    }
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
