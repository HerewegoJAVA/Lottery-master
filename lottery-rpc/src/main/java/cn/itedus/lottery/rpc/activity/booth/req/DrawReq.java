package cn.itedus.lottery.rpc.activity.booth.req;

import java.io.Serializable;


/**
 * @description:Redis 抽奖请求
 * @author：1.9的阿云
 * @date: 2024/2/22
 * @Copyright： 沉淀、努力、成长，加油，早日找到心仪的工作，菩萨保佑别出BUG！
 */
public class DrawReq implements Serializable {

    /** 用户ID */
    private String uId;
    /** 活动ID */
    private Long activityId;

    public DrawReq() {
    }

    public DrawReq(String uId, Long activityId) {
        this.uId = uId;
        this.activityId = activityId;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }
}
