package enumsAnnotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by bswiatek on 11.06.2016.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyRepeatedAnnos {
    MyAnno[] value();
}
