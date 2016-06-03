package rml.service;

/**
 * Created by King on 2016/6/3.
 */

public class HelloServiceImpl implements HelloService {

    @Override
    public String helloWorld(String message) {
        return "Hello," + message;
    }

}
