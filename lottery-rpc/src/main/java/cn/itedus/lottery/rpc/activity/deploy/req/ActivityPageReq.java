package cn.itedus.lottery.rpc.activity.deploy.req;

import cn.itedus.lottery.common.PageRequest;

import java.io.Serializable;


/**
 * @description:Redis 分页查询活动
 * @author：1.9的阿云
 * @date: 2024/2/22
 * @Copyright： 沉淀、努力、成长，加油，早日找到心仪的工作，菩萨保佑别出BUG！
 */
public class ActivityPageReq extends PageRequest implements Serializable {

    /**
     * ERP ID，记录谁在操作
     */
    private String erpId;

    /**
     * 活动ID
     */
    private Long activityId;

    /**
     * 活动名称
     */
    private String activityName;

    public ActivityPageReq(int page, int rows) {
        super(page, rows);
    }

    public ActivityPageReq(String page, String rows) {
        super(page, rows);
    }

    public String getErpId() {
        return erpId;
    }

    public void setErpId(String erpId) {
        this.erpId = erpId;
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

}
