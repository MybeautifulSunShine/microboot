package cn.test.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by SJ217110601 on 2018/2/5.
 */
@RestController
public class HelloController {
    @RequestMapping(value = "/echo/{message}",method = RequestMethod.GET)
    public  String echo(@PathVariable("message") String msg){
        return "ECHO"+msg;
    }
    @RequestMapping("hum")
    public  Object num(int num){
        return num*111;
    }
    @RequestMapping("Object")
    public  String  object(HttpServletRequest request, HttpServletResponse response){
        System.out.println("***"+request.getRequestURI());
        //获取客户端相应编码
        System.out.println("***"+request.getCharacterEncoding());
        System.out.println("** "+request.getSession().getId());
        System.out.println("取得真正的 路劲"+request.getServletContext().getRealPath("/upload/"));
        return "";
    }
    @RequestMapping("hello")
    @ResponseBody
    public String home() {
        return "www.mldn.cm";
    }
}
