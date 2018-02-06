package cn.test.Controller;

import cn.test.error.Member;
import cn.test.util.Controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.Iterator;

/**
 * Created by SJ217110601 on 2018/2/5.
 */
@Controller
public class MessageController extends BaseController {
    /*  @RequestMapping(value = "/eee", method = RequestMethod.GET)
      public String echo(String mid) {
          System.out.println("【*** 访问地址 ***】" + super.getMessage("member.add.action"));
          return super.getMessage("welcome.msg", mid);
      }*/
    /*@Resource

    private ImessageService imessageService;
    @RequestMapping(value = "/",method =RequestMethod.GET)
    public  String  index(){
        return this.imessageService.info();
    }*/
    @RequestMapping(value = "/addpre", method = RequestMethod.GET)
    public String AddPre(String mid, Model model) {
        return "message/member_add"; // 此处只返回一个路径， 该路径没有设置后缀，后缀默认是*.html
    }

    @RequestMapping(value = "add",method = RequestMethod.POST)
    @ResponseBody
    public Object echo(@Valid Member vo, BindingResult result) {//增加前的准备操作路劲
        //@Valid  表示要进行检测
        if (result.hasErrors()){
            Iterator<ObjectError> iterator = result.getAllErrors().iterator();
            while (iterator.hasNext()){
                ObjectError next = iterator.next();//取出没一个错误
                System.out.println("错误信息:"+next.getCode()+"message"+next.getDefaultMessage());
            }
            return result.getAllErrors();
        }else {
            return vo;
        }
    }
}
