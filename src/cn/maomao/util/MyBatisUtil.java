package cn.maomao.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtil {
    private static SqlSessionFactory factory;
    private static ThreadLocal<SqlSession> tl = new ThreadLocal<>();
    //随着类的加载而执行，而且只执行一次
    static {
        try {
            //读取全局配置文件
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            //实例化工厂
            factory = new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //获取SqlSession
    public static SqlSession getSession(){
        //获取线程容器中的Session对象
        SqlSession session = tl.get();
        //若null则重新放入Session
        if (session == null){
            tl.set(factory.openSession());
        }
        return tl.get();
    }
    //关闭SqlSession
    public static void closeSession(){
        SqlSession session = tl.get();
        //若线程容器中的Session非null则关闭，并置Session为null
        if (session != null){
            session.close();
        }
        tl.set(null);
    }
}
