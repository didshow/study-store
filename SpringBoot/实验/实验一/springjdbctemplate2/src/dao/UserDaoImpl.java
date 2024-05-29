package dao;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class UserDaoImpl implements UserDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 更新：主要是insert
     * @param sql
     * @param param
     * @return
     */
    @Override
    public int update(String sql, Object[] param) {
        return jdbcTemplate.update(sql,param);
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
