package com.huateng.bestpayunioninterf.svr;

import com.mapper.TLivelihoodBodyMapper;
import com.util.JdbcUtil;
import lombok.extern.slf4j.Slf4j;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.slf4j.MDC;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 描述
 * </p>
 * User: wangkecheng Date: 2019/1/3
 */
@Slf4j
@WebService
public class BestPayUnionExcute {

    //该方法就是要暴露给其他应用程序调用的方法
    public String exchange(String arg0){
        Map<String,String> map = parseText(arg0);
        String reqType = map.get("reqType");
        String resp="";
        log.info("账单类型：{}",reqType);
        if("A00001".equals(reqType)){//查询
            log.info("账单查询请求报文：{}",arg0);
            String sql = "SELECT * FROM t_livelihood_body t WHERE t.`bar_code` = "+ map.get("barCode") +" AND t.`org_code` = "+map.get("orgCode") +" AND t.`body_type` = 'req' ";
            resp = JdbcUtil.getValue(sql);
        }
        if("A00002".equals(reqType)){//销账
            log.info("账单缴费请求报文：{}",arg0);
            String sql = "SELECT * FROM t_livelihood_body t WHERE t.`bar_code` = "+ map.get("barCode") +" AND t.`org_code` = "+map.get("orgCode") +" AND t.`body_type` = 'rsp' ";
            resp = JdbcUtil.getValue(sql);
        }
        return resp;
    }

    private Map<String,String> parseText(String arg0) {
        Map<String,String > map = new HashMap<>();
        try {
            Document doc = DocumentHelper.parseText(arg0);// 报文转成doc对象
            Element root = doc.getRootElement();// 获取根元素，准备递归解析这个XML树
            String reqType = root.element("CTRL-INFO").attributeValue("WEBSVRCODE");
            if("A00001".equals(reqType)){//查询
                String barCode = root.element("PARAMETERS").elementText("ACCOUNTNO");
                map.put("barCode",barCode);
            }
            if("A00002".equals(reqType)){//销账
                String barCode = root.element("PARAMETERS").elementText("BILLNO");
                map.put("barCode",barCode);
            }
            String orgCode = root.element("PARAMETERS").elementText("BILLORGID");
            map.put("reqType",reqType);
            map.put("orgCode",orgCode);
        } catch (DocumentException e) {
            log.error(e.getMessage(),e);
        }
        return map;
    }

    public static void start() {
        String url = "http://172.31.40.25:8089/upc_msyy/services/BestPayUnionExcutePort?wsdl";
        //String url = "http://127.0.0.1:8088/upc_msyy/services/BestPayUnionExcutePort?wsdl";
        Endpoint.publish(url,new BestPayUnionExcute());
        log.info("Publish Success~");
    }

    public static void main(String[] args) {
        BestPayUnionExcute bestPayUnionExcute = new BestPayUnionExcute();
        bestPayUnionExcute.exchange("<?xml version=\"1.0\" encoding=\"UTF-8\"?><PayPlatRequestParameter><CTRL-INFO  WEBSVRNAME=\"账单查询\" WEBSVRCODE=\"A00001\" APPFROM=\"0990000001\" SERNUM=\"2019070100057241\" APPDATE=\"20190701\" APPTIME=\"204834\"/><PARAMETERS><BILLORGID>5100005119001001</BILLORGID><QUERYACCOUNTTYPE>1</QUERYACCOUNTTYPE><ACCOUNTNO>11103947</ACCOUNTNO><QUERYTYPE>1</QUERYTYPE><PASSWORD></PASSWORD><FROMMONTH></FROMMONTH><TOMONTH></TOMONTH><BILLSTATUS></BILLSTATUS><FROMPAGE></FROMPAGE><PAGESIZE></PAGESIZE><INVOICETITLE></INVOICETITLE><PAYMENTDATE></PAYMENTDATE><QUERYAMT></QUERYAMT><DISCOUNT></DISCOUNT><TEXT1></TEXT1><TEXT2></TEXT2><TEXT3></TEXT3><TEXT4></TEXT4><TEXT5></TEXT5><TEXT6></TEXT6><TEXT7></TEXT7></PARAMETERS><MAC>63FBDAFD0D72B2FBD3D3A9232B537EBB</MAC></PayPlatRequestParameter>");

    }
}
