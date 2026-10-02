import LibraryFiles.UtilityClass;

import javax.swing.text.Utilities;
import java.io.IOException;

public class Demo
{
    public static void main(String[] args) throws IOException {


        String name = UtilityClass.getPFData("browserName");
        System.out.println(name);

    }
}
