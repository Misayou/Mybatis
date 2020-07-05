import com.mapper.userMapper;
import com.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * @Auther: http://www.tanwei.com
 * @Date: 2020/7/5
 * @Description: PACKAGE_NAME
 * @versio: 1.0
 */
public class Main {

    public static void main(String[] args){
        SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession();
        userMapper userMapper = sqlSession.getMapper(userMapper.class);
        System.out.println(userMapper.getUser(2).toString());
    }
}
