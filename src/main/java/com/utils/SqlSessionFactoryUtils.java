package com.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Auther: http://www.tanwei.com
 * @Date: 2020/7/5
 * @Description: com.utils
 * @versio: 1.0
 */
public class SqlSessionFactoryUtils {
    private final static Class<SqlSessionFactoryUtils> lock = SqlSessionFactoryUtils.class;
    private static SqlSessionFactory SqlSessionFactory = null;
    private SqlSessionFactoryUtils(){};

    public static SqlSessionFactory getSqlSessionFactory(){
        synchronized(lock){
            if(SqlSessionFactory!=null){
                return SqlSessionFactory;
            }

            String resource = "mybatis-config.xml";
            InputStream inputStream;
            try{
                inputStream = Resources.getResourceAsStream(resource);
                SqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return SqlSessionFactory;
        }
    }

    public static SqlSession openSqlSession(){
        if(SqlSessionFactory==null){
            getSqlSessionFactory();
        }
        return SqlSessionFactory.openSession();
    }
}
