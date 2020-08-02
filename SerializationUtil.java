import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializationUtil {

    private SerializationUtil(){

    }
 
    @SuppressWarnings("unchecked")
     public static ArrayList<DatedMatchResult> deserialize(File file) throws FileNotFoundException, IOException, ClassNotFoundException {
        ArrayList<DatedMatchResult> clubs = null;
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
        clubs = (ArrayList<DatedMatchResult>) in.readObject(); //casting to a parameterized type (in this case ArrayList<DatedMatchResult>. DatedMatchResult is the parameterized type) will always result in an unchecked warning from the compiler.
        in.close();
        return clubs;
    }

	public static void serialized(File file, List<DatedMatchResult> matchResults) throws FileNotFoundException, IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(matchResults);
        objectOutputStream.close();
        fileOutputStream.close();
	}

}
