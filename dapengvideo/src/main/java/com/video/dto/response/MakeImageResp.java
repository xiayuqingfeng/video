package com.video.dto.response;

import com.video.dto.BaseRespBody;

import java.io.Serializable;

/**
 * @Description: java类作用描述
 * @Author: yupengxia
 * @CreateDate: 2020-05-06 15:24
 * @UpdateUser: yupengxia
 * @UpdateDate: 2020-05-06 15:24
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class MakeImageResp extends BaseRespBody implements Serializable {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "makeImageResp{" +
                "message='" + message + '\'' +
                '}';
    }
}
