package Chapter1;

import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;


public interface Exercise9<T> extends Collection {

    default void forEachIf(Consumer<T> action, Predicate<T> filter) {


    }


}
