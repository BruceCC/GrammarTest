package org.leave.grammar.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class UtilTest {
    public static void main(String[] args) {
        Properties props = null;
        InputStream is = null;
        try {
            is = Thread.currentThread().getContextClassLoader().getResourceAsStream(ConfigConstant.CONFIG_FILE);
            if(is == null){
                throw new FileNotFoundException(ConfigConstant.CONFIG_FILE + " file not found!");
            }
            props = new Properties();
            props.load(is);
            System.out.println(props.containsKey(ConfigConstant.APP_BASE_PACKAGE));
            System.out.println(props.getProperty(ConfigConstant.APP_BASE_PACKAGE));
        } catch (IOException e){

        }
    }
}
