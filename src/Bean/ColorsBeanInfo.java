package Bean;

import java.beans.*;

public class ColorsBeanInfo extends SimpleBeanInfo {
    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            PropertyDescriptor rectangular = new PropertyDescriptor("rectangular", Colors.class);
            PropertyDescriptor pd[] = new PropertyDescriptor[10];
            pd[0] = rectangular;
            return pd;
        } catch (Exception e) {
            System.out.println("wyjątek: " + e);
        }
        return null;
    }
}
