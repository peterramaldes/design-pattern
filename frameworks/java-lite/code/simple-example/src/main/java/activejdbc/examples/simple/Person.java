package activejdbc.examples.simple;

import org.javalite.activejdbc.Model;

/**
 * @author Igor Polevoy on 11/16/15.
 */
public class Person extends Model {

    public Person() {}

    public Person(String name){
        set("name", name);
    }
}
