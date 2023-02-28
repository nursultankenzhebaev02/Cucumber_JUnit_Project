package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //1. Create the Properties object(create object)
    //Make it "private" so we are limiting access to the object
    //"static" is to make sure its created and loaded before everything else.
    public static Properties properties = new Properties();



    //4. Use "properties" object to read from the file (read properties)

    static {
        //2. Open file using FileInputStream
        try {
            FileInputStream file = new FileInputStream("config.properties");
            //3. Load the "properties" object with "file"(load properties)

            properties.load(file);

            //close the file memory
            file.close();

        }catch (IOException e){
            e.printStackTrace();
            System.out.println("FILE NOT FOUND WITH GIVEN PATH!!! ");
        }
    }

    //Create utility method to use the object to read
    //4. Use "properties" object to read from the file (read properties)
    public static String getProperty(String keyword){

        return properties.getProperty(keyword);

    }


}
