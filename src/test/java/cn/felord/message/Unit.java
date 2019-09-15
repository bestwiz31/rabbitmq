package cn.felord.message;

import java.util.Properties;

/**
 * @author dax.
 * @version v1.0
 * @since 2018/2/23 13:59
 */

public class Unit {

    public static void main(String[] args) {
       Properties properties= System.getProperties();
        System.out.println(properties.getProperty("user.dir"));
    }
}
