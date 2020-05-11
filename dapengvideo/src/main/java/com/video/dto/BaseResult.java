package com.video.dto;


import com.video.dto.enums.ProtocolCodeMsg;

import java.io.Serializable;

/**
 * CopyRight (c)1999-2019 : zhcw.com
 * Project :  zhcw-core-data
 * Comments : base result DTO
 * JDK version : JDK1.8
 * Create Date : 2019/10/23 16:57
 *
 * @author : Watson W
 * @version : 1.0
 * @since : 1.0
 */
public class BaseResult implements Serializable {

  private static final long serialVersionUID = 2308006982409026357L;
  private BaseReqBody reqBody;
  private BaseRespBody respBody;

  private boolean hasError = false;

  private ProtocolCodeMsg msg;

  public BaseResult() {
  }

  public BaseResult(BaseReqBody body) {
    this.hasError = false;
    this.reqBody = body;
  }

  public BaseResult(BaseRespBody body) {
    this.hasError = false;
    this.respBody = body;
  }

  public BaseResult(ProtocolCodeMsg msg) {
    this.hasError = true;
    this.msg = msg;
  }

  public BaseReqBody getReqBody() {
    return reqBody;
  }

  public void setReqBody(BaseReqBody reqBody) {
    this.reqBody = reqBody;
  }

  public boolean isHasError() {
    return hasError;
  }

  public void setHasError(boolean hasError) {
    this.hasError = hasError;
  }

  public ProtocolCodeMsg getMsg() {
    return msg;
  }

  public void setMsg(ProtocolCodeMsg msg) {
    this.msg = msg;
  }

  public static BaseResult success(BaseReqBody body) {
    return new BaseResult(body);
  }

  public static BaseResult success() {
    BaseRespBody body = null;
    return new BaseResult(body);
  }

  public static BaseResult success(BaseRespBody body) {
    return new BaseResult(body);
  }

  public static BaseResult failure(ProtocolCodeMsg msg) {
    return new BaseResult(msg);
  }

  public static BaseResult failure(BaseRespBody body) {
    BaseResult result = new BaseResult(body);
    result.setHasError(true);
    result.setMsg(ProtocolCodeMsg.SUCCESS);
    return result;
  }

  public BaseRespBody getRespBody() {
    return respBody;
  }

  public BaseResult setRespBody(BaseRespBody respBody) {
    this.respBody = respBody;
    return this;
  }

}
