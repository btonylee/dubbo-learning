package tony.dubbo.demo.provider.parent;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Tony on 16/7/15.
 */
public class Provider {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"classpath*:spring/appcontext-provider-parent.xml"}
                );
        context.start();

        System.in.read(); // 按任意键退出
    }

}