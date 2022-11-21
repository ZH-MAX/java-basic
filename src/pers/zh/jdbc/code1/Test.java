package pers.zh.jdbc.code1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhanghu
 * @date 2022/11/21 8:53
 */
public class Test {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@192.168.207.33:1521:orcl";
        String user = "scott";
        String password = "123456";
        Connection conn = null;

        try {
            // 加载驱动：反射
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // 获取会话
            conn = DriverManager.getConnection(url, user, password);
            // 编写语句
            String sql = "select * from course";
            Statement st = conn.createStatement();

            /**
             * 执行语句，返回结果集
             *
             * ResultSet：封装了结果集
             * 有一个指针指向当前行
             * 默认是第一行之前的位置
             * rs.next()：指针向下移动一行，如果有数据则返回true
             * getXxx(index|label) 获取当前行对应列的数据
             */
            ResultSet rs = st.executeQuery(sql);

            // 获取元素据
            ResultSetMetaData md = rs.getMetaData();
            int count = md.getColumnCount();
            for (int i = 1; i <= count; i++) {
                System.out.println(md.getColumnName(i));
            }

            List<Course> list = new ArrayList<>();

            //遍历结果集
            while (rs.next()) {

                //通过索引
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
                //通过列名称
                System.out.println(rs.getInt("CID")+"\t"+rs.getString("CNAME"));

                // 封装到 List
                Course course = new Course(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getInt(5)
                );
                list.add(course);
            }

            System.out.println(list.size());


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
