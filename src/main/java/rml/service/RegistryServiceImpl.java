package rml.service;

import org.springframework.stereotype.Service;

/**
 * Created by King on 2016/6/2.
 */
@Service("registryService")
public class RegistryServiceImpl implements RegistryService {
    public String sayHello(String name) {
        return "Hello," + name;
    }
}
