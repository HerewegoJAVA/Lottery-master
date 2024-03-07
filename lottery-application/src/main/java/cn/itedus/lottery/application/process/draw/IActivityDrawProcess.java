package cn.itedus.lottery.application.process.draw;

import cn.itedus.lottery.application.process.draw.req.DrawProcessReq;
import cn.itedus.lottery.application.process.draw.res.DrawProcessResult;
import cn.itedus.lottery.application.process.draw.res.RuleQuantificationCrowdResult;
import cn.itedus.lottery.domain.rule.model.req.DecisionMatterReq;

/**
 * @description:
 * @author：1.9的阿云
 * @date: 2024/2/22
 * @Copyright： 沉淀、努力、成长，加油，早日找到心仪的工作，菩萨保佑别出BUG！
 */
public interface IActivityDrawProcess {

    /**
     * 执行抽奖流程
     * @param req 抽奖请求
     * @return    抽奖结果
     */
    DrawProcessResult doDrawProcess(DrawProcessReq req);

    /**
     * 规则量化人群，返回可参与的活动ID
     * @param req   规则请求
     * @return      量化结果，用户可以参与的活动ID
     */
    RuleQuantificationCrowdResult doRuleQuantificationCrowd(DecisionMatterReq req);

}
