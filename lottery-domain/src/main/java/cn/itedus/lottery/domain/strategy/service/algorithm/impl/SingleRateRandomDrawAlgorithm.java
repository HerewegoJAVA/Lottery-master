package cn.itedus.lottery.domain.strategy.service.algorithm.impl;

import cn.itedus.lottery.common.Constants;
import cn.itedus.lottery.domain.strategy.annotation.Strategy;
import cn.itedus.lottery.domain.strategy.service.algorithm.BaseAlgorithm;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * @description:单项随机概率抽奖，抽到一个已经排掉的奖品则未中奖
 * @author：1.9的阿云
 * @date: 2024/2/22
 * @Copyright： 沉淀、努力、成长，加油，早日找到心仪的工作，菩萨保佑别出BUG！
 */
@Component("singleRateRandomDrawAlgorithm")
@Strategy(strategyMode = Constants.StrategyMode.SINGLE)
public class SingleRateRandomDrawAlgorithm extends BaseAlgorithm {

    @Override
    public String randomDraw(Long strategyId, List<String> excludeAwardIds) {

        // 获取策略对应的元祖
        String[] rateTuple = super.rateTupleMap.get(strategyId);
        assert rateTuple != null;

        // 随机索引
        int randomVal = this.generateSecureRandomIntCode(100);
        int idx = super.hashIdx(randomVal);

        // 返回结果
        String awardId = rateTuple[idx];

        // 如果中奖ID命中排除奖品列表，则返回NULL
        if (excludeAwardIds.contains(awardId)) {
            return null;
        }

        return awardId;
    }

}
