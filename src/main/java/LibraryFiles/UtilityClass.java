package LibraryFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UtilityClass
{

    //this method is use to get data from property file, provide String key as input & returns String value
    //@Author: Sanjay
    public static String getPFData(String key) throws IOException {
        //1: navigate to property file path
        FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\LibraryFiles\\PropertyFile.properties");

        //2: open property file
        Properties p=new Properties();
        p.load(file);

        //3:read data from property file using key
        String value=p.getProperty(key);
        return value;
    }


}
