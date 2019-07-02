package com.controller;

import com.alibaba.fastjson.JSON;
import com.huateng.bestpayunioninterf.svr.BestPayUnionExcute;
import com.manager.RunManager;
import com.model.JsonRespDTO;
import com.model.TLivelihoodBodyDo;
import com.model.TLivelihoodConfigDo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 描述
 * </p>
 * User: wangkecheng Date: 2019/6/26
 */
@Slf4j
@Controller
public class RunController extends BaseController{

    @Autowired
    private RunManager runManager;

    @RequestMapping("/queryParameters.html")
    public void queryParameters(TLivelihoodBodyDo  request, HttpServletResponse response){
        JsonRespDTO<List<TLivelihoodBodyDo>> result = new JsonRespDTO<>();
        //解决跨域
        response.addHeader("Access-Control-Allow-Origin","*");

        log.info("查询请求/响应配置信息,parameters:{}",request);
        List<TLivelihoodBodyDo> list = new ArrayList<>();
        try {
            list = runManager.queryParameters(request);
            int count = runManager.queryParametersCount(request);
            log.info("查询请求/响应配置信息返回，resp:{}",list);
            result.setData(list);
            result.setCount(count);
        } catch (Exception e) {
            e.printStackTrace();
        }
        sendMessages(response, JSON.toJSONString(result));
    }

    /**
     * 新增请求/响应信息 跳转
     * @param
     */
    @RequestMapping("/toBodyAddJsp.html")
    public String toBodyAddJsp(){
        return "page/system/bodyadd";
    }

    /**
     * 新增请求/响应信息
     * @param
     */
    @RequestMapping("/addBody.html")
    public String addBody(TLivelihoodBodyDo request, HttpServletResponse response, HttpServletRequest req){
        try {
            req.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        log.info("添加请求/响应信息，request:{}",request);
        JsonRespDTO result = new JsonRespDTO<>();
        runManager.addBody(request);
        //解决跨域
        return "page/system/parameters";
    }

    /**
     * 新增请求/响应信息
     * @param
     */
    @RequestMapping("/delBody.html")
    public void delBody(Integer[] ids,HttpServletResponse response){
        String result = "success";
        log.info("添加请求/响应信息，ids:{}",ids);
        runManager.delBody(ids);
        sendMessages(response,JSON.toJSONString(result));
    }

}
