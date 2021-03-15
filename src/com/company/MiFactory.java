package com.company;

import java.io.*;
import java.util.Properties;

public class MiFactory {
    public static Object getInstance(String fileName) throws FileNotFoundException {
        File archivo = new File(fileName);
        try (InputStream inputStream = new FileInputStream(archivo)) {
            Properties prop = new Properties();
            prop.load(inputStream);
            Sorter sorter = (Sorter) Class.forName(prop.getProperty("sorter")).newInstance();
            return sorter;
        } catch (IOException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            return e;
        }
    }
}
