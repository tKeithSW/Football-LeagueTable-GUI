import java.io.*;
import java.nio.charset.StandardCharsets;

public class LeagueTableFileWriter {
    public static void write(String league, File file) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        bufferedWriter.write(league);
        bufferedWriter.close();
        outputStreamWriter.close();
    }
}
