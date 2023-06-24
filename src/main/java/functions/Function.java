package functions;

import io.quarkus.funqy.Funq;

/**
 * Your Function class
 */
public class Function {

    /**
     * Use the Quarkus Funqy extension for our function. This function simply echoes its input
     * @param input a Java bean
     * @return a Java bean
     */
    @Funq
    public Output function(Input input) {

        // Add business logic here

        return new Output(input.getMessage());
    }

    @Funq
    public String hello() {

        // Add business logic here
        return "Hello from RESTEasy Reactive - GREEN REVISION with Funqy";
    }

}
