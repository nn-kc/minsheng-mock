package com.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * json响应DTO
 * <p>
 * 方法描述列表
 * </p>
 * User: Jwxa Date: 2018/5/17 ProjectName: ecurrency-gamerecharge Version: 1.0
 */
@Getter
@Setter
@ToString
public class JsonRespDTO<T> {

    /**
     * 状态码
     */
    private String code;

    /**
     * 状态信息
     */
    private String msg;

    /**
     * 总条数
     */
    private int count;

    /**
     * 响应数据实体类
     */
    private T data;

    public JsonRespDTO() {
        this.code = "0";
        this.count = 0;
        this.msg = "成功";
    }
}
