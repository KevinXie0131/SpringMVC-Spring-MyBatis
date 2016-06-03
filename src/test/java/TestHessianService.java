import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import rml.service.HelloService;

import java.net.MalformedURLException;

/**
 * Created by King on 2016/6/3.
 */
public class TestHessianService {
    @SuppressWarnings("resource")
    @Test
    public void testService() throws MalformedURLException {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "hessian-client.xml");
        HelloService hello = (HelloService) context.getBean("hessianClient");
        System.out.println(hello.helloWorld("jimmy.yang"));
    }
}
