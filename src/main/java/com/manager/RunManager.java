package com.manager;

import com.huateng.bestpayunioninterf.svr.BestPayUnionExcute;
import com.mapper.TLivelihoodBodyMapper;
import com.model.TLivelihoodBodyDo;
import com.model.TLivelihoodBodyDoExample;
import com.model.TLivelihoodConfigDo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 描述
 * </p>
 * User: wangkecheng Date: 2019/6/26
 */
@Slf4j
@Service
public class RunManager {

    @Autowired
    private TLivelihoodBodyMapper tLivelihoodBodyMapper;

    @PostConstruct
    public void init(){
        BestPayUnionExcute bestPayUnionExcute = new BestPayUnionExcute();
        bestPayUnionExcute.start();
    }

    public List<TLivelihoodBodyDo> queryParameters(TLivelihoodBodyDo request){
        TLivelihoodBodyDoExample example = new TLivelihoodBodyDoExample();
        TLivelihoodBodyDoExample.Criteria criteria = example.createCriteria();
        if(null != request.getBarCode() && !"".equals(request.getBarCode())){
            criteria.andBarCodeEqualTo(request.getBarCode());
        }
        if(null != request.getOrgCode() && !"".equals(request.getOrgCode())){
            criteria .andOrgCodeEqualTo(request.getOrgCode());
        }
        return tLivelihoodBodyMapper.selectByExample(example);
    }

    public int queryParametersCount(TLivelihoodBodyDo request){
        TLivelihoodBodyDoExample example = new TLivelihoodBodyDoExample();
        TLivelihoodBodyDoExample.Criteria criteria = example.createCriteria();
        if(null != request.getBarCode() && !"".equals(request.getBarCode())){
            criteria.andBarCodeEqualTo(request.getBarCode());
        }
        if(null != request.getOrgCode() && !"".equals(request.getOrgCode())){
            criteria .andOrgCodeEqualTo(request.getOrgCode());
        }
        return (int)tLivelihoodBodyMapper.countByExample(example);
    }

    public void addBody(TLivelihoodBodyDo request) {
        request.setCreatedBy("system");
        request.setUpdatedBy("system");
        tLivelihoodBodyMapper.insertSelective(request);
    }

    public void delBody(Integer[] ids) {
        for(Integer id : ids){
            tLivelihoodBodyMapper.delBody(id);
        }
    }
}
