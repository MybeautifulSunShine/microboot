package cn.test.util.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by SJ217110601 on 2018/2/5.
 */
public  abstract class BaseController {
    @Autowired
    private MessageSource messageSourcel;//自动注入此资源对象
    public String getMessage(String key, String... args){
        return this.messageSourcel.getMessage(key,args,Locale.getDefault() );
    }
    @InitBinder
    public  void initBider(WebDataBinder binder){//在程序中需要对日期格式进行处理
        //首先建立一个可以将字符串转化为日期的工具类抽程序
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        //明确的描述此时需要注协一个日期格式的转化类程序
        binder.registerCustomEditor(Date.class,new CustomDateEditor(format,true));

    }

}
