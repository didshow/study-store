package config;

import dao.UserDao;
import dao.UserDaoImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
@ComponentScan(basePackages = {"dao", "service"})
@PropertySource(value = {"classpath:jdbc.properties"},ignoreResourceNotFound = true)
public class SpringJDBCConfig {
    /**
     * 注入属性文件中的各个属性
     */
    @Value("${jdbc.url}")
    private String jdbcUrl;
    @Value("${jdbc.driverClassName}")
    private String jdbcDriverClassName;
    @Value("${jdbc.username}")
    private String jdbcUsername;
    @Value("${jdbc.password}")
    private String jdbcPassword;

    /**
     * 配置数据源
     * @return
     */
    @Bean
    public DriverManagerDataSource dataSource(){
        DriverManagerDataSource myDataSource = new DriverManagerDataSource();
        myDataSource.setDriverClassName(jdbcDriverClassName);
        myDataSource.setUrl(jdbcUrl);
        myDataSource.setUsername(jdbcUsername);
        myDataSource.setPassword(jdbcPassword);
        return myDataSource;
    }

    /**
     * 配置JdbcTemplate
     * @return
     */
    @Bean(value = "jdbcTemplate")
    public JdbcTemplate getJdbcTemplate(){
        return new JdbcTemplate(dataSource());
    }
//    @Bean
//    public UserDao makDao(){
//        return new UserDaoImpl();
//    }
}
