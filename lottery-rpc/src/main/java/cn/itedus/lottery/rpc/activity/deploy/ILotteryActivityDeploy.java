package cn.itedus.lottery.rpc.activity.deploy;

import cn.itedus.lottery.rpc.activity.deploy.req.ActivityPageReq;
import cn.itedus.lottery.rpc.activity.deploy.res.ActivityRes;

/**
 * @description:Redis 抽奖活动部署服务接口
 * @author：1.9的阿云
 * @date: 2024/2/22
 * @Copyright： 沉淀、努力、成长，加油，早日找到心仪的工作，菩萨保佑别出BUG！
 */
public interface ILotteryActivityDeploy {

    /**
     * 通过分页查询活动列表信息，给ERP运营使用
     *
     * @param req   查询参数
     * @return      查询结果
     */
    ActivityRes queryActivityListByPageForErp(ActivityPageReq req);

}
