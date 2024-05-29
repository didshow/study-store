package dao;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.jws.soap.SOAPBinding;
import java.util.List;
@Repository
public class UserDaoImpl extends BaseDao<User> implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 更新：主要是insert
     * @param
     * @param
     * @return
     */
    @Override
    public int update(User user) {

        return this.Insert(User.class,user.getUid(),user.getUname(),user.getUage(),user.getUsex());
    }

    /**
     * 查询方法select
     * @param sql
     * @param param
     * @return
     */
    @Override
    public List<User> query(String sql, Object[] param) {

        return null;
    }

}
