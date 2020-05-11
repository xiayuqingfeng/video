package com.video.dto.request;

import com.video.dto.BaseReqBody;

import java.io.Serializable;

/**
 * @Description: java类作用描述
 * @Author: yupengxia
 * @CreateDate: 2020-05-06 11:12
 * @UpdateUser: yupengxia
 * @UpdateDate: 2020-05-06 11:12
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class VideoNameReq extends BaseReqBody implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "VideoNameReq{" +
                "name='" + name + '\'' +
                '}';
    }
}