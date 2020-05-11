package com.video.dto.enums;

/**
 * CopyRight (c)1999-2019 : zhcw.com
 * Project :  zhcw-core-data
 * Comments : <对此类的描述，可以引用系统设计中的描述>
 * JDK version : JDK1.8
 * Create Date : 2019/10/23 16:57
 *
 * @author : Watson W
 * @version : 1.0
 * @since : 1.0
 */
public enum ProtocolCodeMsg {


  JSON_PARSE_ERROR("000002", "JSON解析错误"),
  TYPE_DOES_NOT_MATCH("000003", "类型不匹配"),
  MESSAGEID_NOT_ASSIGNED("000004", "messageID未赋值"),
  TIMESTAMP_NOT_ASSIGNED("000005", "timeStamp未赋值"),
  TRANSACTIONTYPE_NOT_ASSIGNED("000006", "transactionType未赋值"),
  DIGEST_VERIFICATION_FAILED("000007", "digest校验不通过"),
  HEAD_NOT_ASSIGNED("000008", "请求head未赋值"),
  BODY_NOT_ASSIGNED("000009", "请求body未赋值"),
  CHANNEL_NUMBER_NOT_ASSIGNED("000010", "渠道号未赋值"),
  VERSION_NOT_ASSIGNED("000011", "版本未赋值"),
  CMDCODE_NOT_ILLEGAL("000012", "transactionType不存在"),

  LOTTERY_ID_NOT_ILLEGAL("000013", "lotteryId未赋值"),
  PAGE_NUM_VERIFICATION_FAILED("000014", "页码校验不通过"),
  PAGE_SIZE_VERIFICATION_FAILED("000015", "条数校验不通过"),
  REFLECT_EXCEPTION("000016", "获取bean实现异常"),
  LOTTERY_INFO_ISSUE_NOT_ASSIGNED("000017", "期次不能为空"),
  MATCH_ID_NOT_ASSIGNED("000018", "赛事ID不能为空"),
  LOTTERY_TYPE_NOT_ASSIGNED("000019", "lotteryType不能为空"),

  SUCCESS("000000", "成功"),
  FAIL("444444", "失败"),
  UNKNOWN_EXCEPTION("999999", "系统处理未知异常"),
  DATABASE_EXCEPTION("888888", "数据库操作异常"),


  //开奖中奖情况(福彩 、 足彩 、 传统足彩)列表分页
  PAST_THE_LOTTERY_TYPE_NOT_ASSIGNED("100101", "类型未赋值"),
  PAST_THE_LOTTERY_TYPE_NOT_MATCH("100102", "类型不匹配"),
  PAST_THE_LOTTERY_ISSUE_COUNT_NOT_ASSIGNED("100103", "期数未赋值"),
  PAST_THE_LOTTERY_DATE_NOT_ASSIGNED("100104", "时间间隔未赋值"),
  PAST_THE_LOTTERY_ISSUE_NOT_ASSIGNED("100105", "期次间隔未赋值"),

  FB_MATCH_TEAM_REC_DATA_TID_NOT_ASSIGNED("210801", "队伍编号不能为空"),

  FB_MATCH_TEAM_REC_DATA_FIELD_NOT_ASSIGNED("210802", "主客场类型校验不通过"),

  FB_MATCH_TEAM_REC_DATA_PAGESIZE_NOT_ASSIGNED("210803", "条数未校验通过"),

  FB_MATCH_TEAM_REC_DATA_LOCAL_MATCH_ID_NOT_ASSIGNED("210804", "赛事编号不能为空"),

  FB_MATCH_FUTUER_MATCHES_TID_NOT_ASSIGNED("211201", "队伍编号不能为空"),
  FB_MATCH_FUTUER_MATCHES_PAGESIZE_NOT_ASSIGNED("211202", "条数未校验通过"),

  //赛事积分榜（足球）
  SCORE_BOARD_INFO_MID_ORDER_TYPE_NOT_ASSIGNED("210901", "主客场类型校验不通过"),

  //竞猜--历史交锋（足球）
  HISTORY_STATISTICS_FOOTBALL_FIELD_NOT_ASSIGNED("211001","主客场不能为空"),
  HISTORY_STATISTICS_FOOTBALL_FIELD_TYPE_NOT_ASSIGNED("211002","主客场类型校验不通过"),
  HISTORY_STATISTICS_FOOTBAL_NBAID_NOT_ASSIGNED("211003","本赛事不能为空"),

  //主客队数据统计（篮球）
  HA_STATISTICS_BASKETBALL_TID_NOT_ASSIGNED("221001", "队伍编号不能为空"),
  HA_STATISTICS_BASKETBALL_NBAID_NOT_ASSIGNED("221001", "赛事类型不能为空"),
  HA_STATISTICS_BASKETBALL_DATE_NOT_ASSIGNED("221002", "开赛日期不能为空"),
  HA_STATISTICS_BASKETBALL_FIELD_NOT_ASSIGNED("221003", "主客场类型校验不通过"),
  HA_STATISTICS_BASKETBALL_CALCULATE_TYPE_NOT_ASSIGNED("221004", "计算类型校验不通过"),
  HA_STATISTICS_BASKETBALL_PRIZE_TYPE_NOT_ASSIGNED("221005", "奖项校验不通过"),

  //赛事详情-让分胜负（篮球）
  LET_SCORE_DETAILS_BASKETBALL_FIELD_NOT_ASSIGNED("221301", "主客场类型校验不通过"),
  LET_SCORE_DETAILS_BASKETBALL_PRIZE_TYPE_NOT_ASSIGNED("221302", "奖项校验不通过"),

  //彩种期号查询(福彩、足彩、传统足彩)
  LOTTERY_ISSUE_QUERY_COUNT_NOT_ASSIGNED("100301", "期数不能为空"),

  //竞篮开奖
  MATCH_RESULT_BASKETBALL_DATE_NOT_ASSIGNED("221501", "赛事日期不能为空"),
  MATCH_RESULT_BASKETBALL_DATE_MAX_ASSIGNED("221501", "最多可查看7日数据"),

  //竞足开奖
  MATCH_RESULT_FOOTBALL_DATE_NOT_ASSIGNED("211401", "赛事日期不能为空"),
  MATCH_RESULT_FOOTBALL_DATE_MAX_ASSIGNED("211401", "最多可查看7日数据"),

  //传统足彩期次查询
  TRADITION_FOOTBALL_ISSUE_KEY_NO_ASSIGNED("130101", "赛事类型不能为空"),

  //竞蓝大小分详情
  SIZES_DETAILS_BASKETBALL_FIELD_NOT_ASSIGNED("221201","主客场不能为空"),
  SIZES_DETAILS_BASKETBALL_FIELD_TYPE_NOT_ASSIGNED("221202","主客场类型校验不通过"),
  SIZES_DETAILS_BASKETBALL__PRIZE_TYPE_NOT_ASSIGNED("221203", "奖项校验不通过")
  ;

  private String code;

  private String msg;

  ProtocolCodeMsg(String code, String msg) {
    this.code = code;
    this.msg = msg;
  }

  public String getCode() {
    return code;
  }

  public ProtocolCodeMsg setCode(String code) {
    this.code = code;
    return this;
  }

  public String getMsg() {
    return msg;
  }

  public ProtocolCodeMsg setMsg(String msg) {
    this.msg = msg;
    return this;
  }
}
