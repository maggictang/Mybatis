import org.apache.ibatis.session.SqlSession;
import utils.MybatisUtil;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        testGetUserCount();
    }

    public static void testGetUserCount() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        String statement = "domain.userMapper.getUserCount";
        Map<String, Integer> parameterMap = new HashMap<String, Integer>();
        parameterMap.put("sex_id", 1);
        parameterMap.put("user_count", -1);
        sqlSession.selectOne(statement, parameterMap);
        Integer result = parameterMap.get("user_count");
        System.out.println(result);
        sqlSession.close();
    }
}
