package pers.zh.jdbc.code2;

import java.sql.Connection;

/**
 * @author zhanghu
 * @date 2022/11/21 11:10
 */
public class Test {
    public static void main(String[] args) {

        DataSourceUtil util = new DataSourceUtil();
        try {
            Connection conn = util.connect();
            System.out.println(conn);//oracle.jdbc.driver.T4CConnection@51521cc1
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            {
                util.close();
            }
        }
    }
}
