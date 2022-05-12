import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//has runtime visibility, and we can apply it to types (classes)

/**
 * @author Hasan.KOZLJAK
 * interface to save metadata
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyAnnotation {
    int value() default 1;
}
