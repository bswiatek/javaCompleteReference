package util;

import java.util.ListResourceBundle;

public class SampleRB extends ListResourceBundle {
    protected Object[][] getContents(){

        Object[][] resources = new Object[3][2];

        resources[0][0] = "title";
        resources[0][1] = "Mój program";

        resources[1][0] = "StopText";
        resources[1][1] = "Zatrzymaj";

        resources[2][0] = "StartText";
        resources[2][1] = "Uruchom";

        return resources;
    }
}
