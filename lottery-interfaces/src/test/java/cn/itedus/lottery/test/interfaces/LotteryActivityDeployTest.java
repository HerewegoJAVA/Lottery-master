package cn.itedus.lottery.test.interfaces;

import cn.itedus.lottery.rpc.activity.deploy.ILotteryActivityDeploy;
import cn.itedus.lottery.rpc.activity.deploy.req.ActivityPageReq;
import cn.itedus.lottery.rpc.activity.deploy.res.ActivityRes;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @description:Redis 活动部署测试
 * @author：1.9的阿云
 * @date: 2024/2/22
 * @Copyright： 沉淀、努力、成长，加油，早日找到心仪的工作，菩萨保佑别出BUG！
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LotteryActivityDeployTest {

    private Logger logger = LoggerFactory.getLogger(LotteryActivityDeployTest.class);

    @Resource
    private ILotteryActivityDeploy lotteryActivityDeploy;

    @Test
    public void test_queryActivityListByPageForErp() {
        ActivityPageReq req = new ActivityPageReq(1, 10);
        req.setErpId("xiaofuge");

        ActivityRes res = lotteryActivityDeploy.queryActivityListByPageForErp(req);

        logger.info("请求参数：{}", JSON.toJSONString(req));
        logger.info("测试结果：{}", JSON.toJSONString(res));
    }

}
