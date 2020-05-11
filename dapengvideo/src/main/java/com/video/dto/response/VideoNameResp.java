package com.video.dto.response;

import com.video.dto.BaseRespBody;

import java.io.Serializable;

/**
 * @Description: java类作用描述
 * @Author: yupengxia
 * @CreateDate: 2020-05-06 12:49
 * @UpdateUser: yupengxia
 * @UpdateDate: 2020-05-06 12:49
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class VideoNameResp extends BaseRespBody implements Serializable {

    private String iamgeOne;
    private String iamgeTow;
    private String iamgeThree;

    public String getIamgeOne() {
        return iamgeOne;
    }

    public void setIamgeOne(String iamgeOne) {
        this.iamgeOne = iamgeOne;
    }

    public String getIamgeTow() {
        return iamgeTow;
    }

    public void setIamgeTow(String iamgeTow) {
        this.iamgeTow = iamgeTow;
    }

    public String getIamgeThree() {
        return iamgeThree;
    }

    public void setIamgeThree(String iamgeThree) {
        this.iamgeThree = iamgeThree;
    }

    @Override
    public String toString() {
        return "VideoNameResp{" +
                "iamgeOne='" + iamgeOne + '\'' +
                ", iamgeTow='" + iamgeTow + '\'' +
                ", iamgeThree='" + iamgeThree + '\'' +
                '}';
    }
}
