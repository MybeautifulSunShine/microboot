package cn.test;

import cn.test.Controller.MessageController;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

@SpringBootTest(classes = SpringbootBaseApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestMessageController {
    @Resource
    private MessageController messageController;

   /* @Test
    public void testEcho() {
        System.out.println(this.messageController.echo("mldnjava"));
    }*/
  /* @Test
    public  void  TestIndex(){
       System.out.println(this.messageController.index());*/
   }