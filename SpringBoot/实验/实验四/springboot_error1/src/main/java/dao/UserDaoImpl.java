package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public int getById(int uid) {
        String sql = "select * from user where uid =?";
        return jdbcTemplate.update("select * from user where uid =?");
    }
}
