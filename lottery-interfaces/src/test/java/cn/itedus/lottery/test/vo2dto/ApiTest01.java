package cn.itedus.lottery.test.vo2dto;

import cn.itedus.lottery.test.vo2dto.bbb.User;
import org.springframework.beans.BeanUtils;

import java.util.List;


/**
 * @description:Redis 普通对象转换
 * @author：1.9的阿云
 * @date: 2024/2/22
 * @Copyright： 沉淀、努力、成长，加油，早日找到心仪的工作，菩萨保佑别出BUG！
 */
public class ApiTest01 {

    public void test_vo2dto(User user) {
        UserDTO userDTO = new UserDTO();

    }

    public void test_vo2dto(List<User> userList) {
        for (User user : userList) {
            UserDTO userDTO = new UserDTO();

            BeanUtils.copyProperties(user, userDTO);

        }
    }

    public void test_vo2dto() {
        User user = this.queryUserById();

        UserDTO userDTO = new UserDTO();
    }

    private User queryUserById() {
        return null;
    }

}
