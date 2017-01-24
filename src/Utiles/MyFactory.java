package Utiles;

import java.io.FileInputStream;
import java.util.Properties;

public class MyFactory {

    public static Object getObject(String name) {
        FileInputStream fis = null;
        try {
// leo el archivo de propiedades donde se definen las implementaciones
            fis = new FileInputStream("src/utiles/factory.properties");
            Properties props = new Properties();
            props.load(fis);
            String sClazz = props.getProperty(name);
            return Class.forName(sClazz).newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                throw new RuntimeException(ex);
            }
        }
    }
}
