package com.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 公有元素管理类
 * </p>
 * User: wangkecheng Date: 2018/12/4
 */
@Slf4j
@Controller
public class BaseController {
    /**
     * 功能 :发送页面消息
     * @param response
     * @param json
     */
    public void sendMessages(HttpServletResponse response, String json) {
        response.setCharacterEncoding("UTF-8");
        try{
            response.getWriter().print(json);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
