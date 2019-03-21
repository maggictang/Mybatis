import domain.Order;
import org.apache.ibatis.session.SqlSession;
import utils.MybatisUtil;

public class Main {

    public static void main(String[] args) {
        new Main().testGetOrderById();
        new Main().testSelectOrder();
        new Main().testSelectOrderReultMap();
    }

    public void testGetOrderById() {
        SqlSession session = MybatisUtil.getSqlSession();
        String statement = "domain.orderMapper.getOrderById";
        Order order = session.selectOne(statement, 1);
        session.close();
        System.out.println(order);
    }

    public void testSelectOrder() {
        SqlSession session = MybatisUtil.getSqlSession();
        String statement = "domain.orderMapper.selectOrder";
        Order order = session.selectOne(statement, 1);
        session.close();
        System.out.println(order);
    }

    public void testSelectOrderReultMap() {
        SqlSession session = MybatisUtil.getSqlSession();
        String statement = "domain.orderMapper.selectOrderReultMap";
        Order order = session.selectOne(statement, 1);
        session.close();
        System.out.println(order);
    }
}
