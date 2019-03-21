package mapper;

import domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper {

    @Insert("insert into users(name,age) values(#{name},#{age})")
    public int addUser(User user);

    @Delete("delete from users where id = #{id}")
    public int deleteUser(int id);

    @Update("update users set name = #{name}, age =#{age} where id = #{id}")
    public int updateUser(User user);

    @Select("select * from users where id = #{id}")
    public User getById(int id);

    @Select("select * from users")
    public List<User> getAll();

}
