package pers.zh.oop.qianfeng;

/**
 * @author zhanghu
 * @date 2022/12/1 22:43
 *
 *
 * 用户类
 */
public class User {
    private String cardNo;
    private String identity;
    private String username;
    private String password;
    private String phone;
    private double balance;


    public User() {
    }

    public User(String cardNo, String identity, String username, String password, String phone, double balance) {
        this.cardNo = cardNo;
        this.identity = identity;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.balance = balance;
    }

    /**
     * 获取
     * @return cardNo
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * 设置
     * @param cardNo
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    /**
     * 获取
     * @return identity
     */
    public String getIdentity() {
        return identity;
    }

    /**
     * 设置
     * @param identity
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * 设置
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return "User{cardNo = " + cardNo + ", identity = " + identity + ", username = " + username + ", password = " + password + ", phone = " + phone + ", balance = " + balance + "}";
    }
}
