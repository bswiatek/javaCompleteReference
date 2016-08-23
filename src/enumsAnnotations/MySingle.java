package enumsAnnotations;

import java.lang.annotation.*;

/**
 * Created by bswiatek on 11.06.2016.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MySingle {
    int value();
}
