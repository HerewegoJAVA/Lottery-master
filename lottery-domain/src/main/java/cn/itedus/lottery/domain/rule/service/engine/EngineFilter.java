package cn.itedus.lottery.domain.rule.service.engine;

import cn.itedus.lottery.domain.rule.model.res.EngineResult;
import cn.itedus.lottery.domain.rule.model.req.DecisionMatterReq;

/**
 * @description:规则过滤器引擎
 * @author：1.9的阿云
 * @date: 2024/2/22
 * @Copyright： 沉淀、努力、成长，加油，早日找到心仪的工作，菩萨保佑别出BUG！
 */
public interface EngineFilter {

    /**
     * 规则过滤器接口
     *
     * @param matter      规则决策物料
     * @return            规则决策结果
     */
    EngineResult process(final DecisionMatterReq matter);

}
