import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
@Documented
@Target({ElementType.FIELD, ElementType.TYPE, ElementType.CONSTRUCTOR})
public  @interface Tabela {
    String value();
}
