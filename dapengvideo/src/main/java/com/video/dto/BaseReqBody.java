package com.video.dto;

import java.io.Serializable;

/**
 * CopyRight (c)1999-2019 : zhcw.com
 * Project :  zhcw-core-data
 * Comments : request base DTO
 * JDK version : JDK1.8
 * Create Date : 2019/10/23 16:57
 *
 * @author : Watson W
 * @version : 1.0
 * @since : 1.0
 */
public abstract class BaseReqBody implements Serializable {
  private static final long serialVersionUID = 1833630152223764972L;

  private String busiCode;

  public String getBusiCode() {
    return busiCode;
  }

  public BaseReqBody setBusiCode(String busiCode) {
    this.busiCode = busiCode;
    return this;
  }
}
