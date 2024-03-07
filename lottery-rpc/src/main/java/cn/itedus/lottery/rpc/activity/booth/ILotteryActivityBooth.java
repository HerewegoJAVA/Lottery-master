package cn.itedus.lottery.rpc.activity.booth;

import cn.itedus.lottery.rpc.activity.booth.req.DrawReq;
import cn.itedus.lottery.rpc.activity.booth.req.QuantificationDrawReq;
import cn.itedus.lottery.rpc.activity.booth.res.DrawRes;


/**
 * @description:Redis 抽奖活动展台接口
 * @author：1.9的阿云
 * @date: 2024/2/22
 * @Copyright： 沉淀、努力、成长，加油，早日找到心仪的工作，菩萨保佑别出BUG！
 */
public interface ILotteryActivityBooth {

    /**
     * 指定活动抽奖
     * @param drawReq 请求参数
     * @return        抽奖结果
     */
    DrawRes doDraw(DrawReq drawReq);

    /**
     * 量化人群抽奖
     * @param quantificationDrawReq 请求参数
     * @return                      抽奖结果
     */
    DrawRes doQuantificationDraw(QuantificationDrawReq quantificationDrawReq);

}
