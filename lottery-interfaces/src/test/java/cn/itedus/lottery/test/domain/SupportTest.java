package cn.itedus.lottery.test.domain;

import cn.itedus.lottery.common.Constants;
import cn.itedus.lottery.domain.support.ids.IIdGenerator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @description:支撑领域测试
 * @author：1.9的阿云
 * @date: 2024/2/22
 * @Copyright： 沉淀、努力、成长，加油，早日找到心仪的工作，菩萨保佑别出BUG！
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SupportTest {

    private Logger logger = LoggerFactory.getLogger(SupportTest.class);

    @Resource
    private Map<Constants.Ids, IIdGenerator> idGeneratorMap;

    @Test
    public void test_ids() {
        logger.info("雪花算法策略，生成ID：{}", idGeneratorMap.get(Constants.Ids.SnowFlake).nextId());
        logger.info("日期算法策略，生成ID：{}", idGeneratorMap.get(Constants.Ids.ShortCode).nextId());
        logger.info("随机算法策略，生成ID：{}", idGeneratorMap.get(Constants.Ids.RandomNumeric).nextId());
    }

}
