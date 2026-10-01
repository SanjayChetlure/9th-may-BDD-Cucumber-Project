package LibraryFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class UtilityClass
{

    public static void getPFData(String key) throws FileNotFoundException
    {
        FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\LibraryFiles\\PropertyFile.properties");
    }


}
