package com;

import com.manager.RunManager;
import com.model.TLivelihoodBodyDo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 描述
 * </p>
 * User: wangkecheng Date: 2019/6/28
 */
public class DBTest extends BaseSpringTest {

    @Autowired
    private RunManager runManager;

    @Test
    public void Test(){
        TLivelihoodBodyDo bodyDo = new TLivelihoodBodyDo();
        bodyDo.setOrgCode("123");
        bodyDo.setOrgName("这是一个测试");
        runManager.addBody(bodyDo);
    }
}
