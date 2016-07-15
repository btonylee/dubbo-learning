package tony.dubbo.demo.provider;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import tony.dubbo.demo.DemoService;
import tony.dubbo.demo.DemoService2;

/**
 * Created by Tony on 16/7/15.
 */
public class DemoServiceImpl implements DemoService, ApplicationContextAware {

    private static ApplicationContext applicationContext;

    public String sayHello(String name) {
        DemoService2 demoService2 = (DemoService2) applicationContext.getBean("demoService2");
        return demoService2.saySomething() + " " + name;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
