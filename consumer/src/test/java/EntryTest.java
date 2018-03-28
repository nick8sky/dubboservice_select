
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kx.consumer.CallHello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



/**
 * Created by sunkx on 2017/6/28.
 * 入金测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class EntryTest {

    @Autowired
    CallHello callHello ;

    @Test
    public void doCallHello() throws InterruptedException {

        callHello.sss();


    }



}
