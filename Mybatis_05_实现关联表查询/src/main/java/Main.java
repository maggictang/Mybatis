import domain.Classes;
import org.apache.ibatis.session.SqlSession;
import utils.MybatisUtil;

public class Main {

    public static void main(String[] args) {
        testGetClass1();
        testGetCalss2();
        testGetClass3();
        testGetClass4();
    }

    public static void testGetClass1() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        String statement = "domain.classMapper.getClass1";
        Classes classes = sqlSession.selectOne(statement, 1);
        sqlSession.close();
        System.out.println(classes);
    }

    public static void testGetCalss2() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        String statement = "domain.classMapper.getClass2";
        Classes classes = sqlSession.selectOne(statement, 1);
        sqlSession.close();
        System.out.println(classes);
    }

    public static void testGetClass3() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        String statement = "domain.classMapper.getClass3";
        Classes classes = sqlSession.selectOne(statement, 1);
        sqlSession.close();
        System.out.println(classes);
    }

    public static void testGetClass4() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        String statement = "domain.classMapper.getClass4";
        Classes classes = sqlSession.selectOne(statement, 1);
        sqlSession.close();
        System.out.println(classes);
    }
}
