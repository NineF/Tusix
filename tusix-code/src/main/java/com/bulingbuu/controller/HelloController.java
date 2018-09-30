package com.bulingbuu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author bulingbuu
 * @date 18-9-30 下午3:54
 */
@Controller
@RequestMapping("hello")
public class HelloController {

    @RequestMapping(value = "name", method = RequestMethod.GET)
    public @ResponseBody
    Object helloName(String name) {
        System.out.println(name);
        return "return:" + name;
    }
}
