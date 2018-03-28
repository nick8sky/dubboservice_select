package nick;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by sunkx on 2017/6/2.
 */
public class Start {


    public static void main(String ...s) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        context.start();
        System.out.println("stared...");
        System.in.read();
    }
}
