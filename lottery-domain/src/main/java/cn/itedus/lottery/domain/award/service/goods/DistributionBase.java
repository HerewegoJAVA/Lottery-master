package cn.itedus.lottery.domain.award.service.goods;

import cn.itedus.lottery.domain.award.repository.IOrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

/**
 * @description:配送货物基础共用类
 * @author：1.9的阿云
 * @date: 2024/2/22
 * @Copyright： 沉淀、努力、成长，加油，早日找到心仪的工作，菩萨保佑别出BUG！
 */
public class DistributionBase {

    protected Logger logger = LoggerFactory.getLogger(DistributionBase.class);

    @Resource
    private IOrderRepository awardRepository;

    protected void updateUserAwardState(String uId, Long orderId, String awardId, Integer grantState) {
        awardRepository.updateUserAwardState(uId, orderId, awardId, grantState);
    }

}
