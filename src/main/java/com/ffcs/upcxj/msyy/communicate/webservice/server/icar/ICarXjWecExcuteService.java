package com.ffcs.upcxj.msyy.communicate.webservice.server.icar;

import lombok.extern.slf4j.Slf4j;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * <p>
 * 描述
 * </p>
 * User: wangkecheng Date: 2019/5/24
 */
@Slf4j
@WebService
public class ICarXjWecExcuteService {

    //该方法就是要暴露给其他应用程序调用的方法
    public String exchange(String arg0){
        System.out.println("aaaaaaaa");
        return "aa";
    }

    public static void main(String[] args) {
        //http\\://135.224.55.83\\:8081/upc_msyy/services/ICarXjWecExcutePort?wsdl
        //172.17.165.36
        Endpoint.publish("http://127.0.0.1:8099/upc_msyy/services/ICarXjWecExcutePort?wsdl",new ICarXjWecExcuteService());
        System.out.println("Publish Success~");
    }
}
