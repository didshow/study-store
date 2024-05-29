package dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@Repository
public abstract class BaseDao <T>{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    protected Logger log=Logger.getAnonymousLogger();
    public Integer Insert(Class<T> entity,Object ... args){
        StringBuilder stringBuf1=new StringBuilder();
        StringBuilder sql=new StringBuilder();
        StringBuilder stringBuilder=new StringBuilder();

        Field[] declaredFields = entity.getDeclaredFields();
        stringBuilder.append("(");
        for (Field declaredField : declaredFields) {
            stringBuf1.append(declaredField.getName()).append(",");
            stringBuilder.append("?,");
        }
        stringBuf1.delete(stringBuf1.length()-1,stringBuf1.length());
        stringBuilder.delete(stringBuilder.length()-1,stringBuilder.length());
        stringBuilder.append(")");
        sql.append("insert into ").append(entity.getSimpleName().toLowerCase()).append("(").
                append(stringBuf1.toString()).append(")").append("values").append(stringBuilder);
        String relSQL=sql.toString();
    log.info(relSQL+"Values:"+ Arrays.toString(args));
    return jdbcTemplate.update(relSQL,args);

    }
    public List<Map<String,Object>> select(String tableName){
        String SQL="SELECT * FROM "+tableName;
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(SQL);
        return maps;
    }

}
