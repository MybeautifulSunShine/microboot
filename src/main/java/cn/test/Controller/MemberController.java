package cn.test.Controller;

import cn.test.util.Controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by SJ217110601 on 2018/2/6.
 */
@Controller
public class MemberController extends BaseController {
    @RequestMapping(value = "get")
    @ResponseBody
    public String get() {
        System.out.println("除发计算:"+(10/0));
        return "helloworld";
    }
}
