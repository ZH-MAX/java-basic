package pers.zh.jdbc.code1;

/**
 * @author zhanghu
 * @date 2022/11/21 9:41
 */
public class Course {
    int cid;
    String cname;
    int cval;
    int ctime;
    int tid;

    public Course() {
    }

    public Course(int cid, String cname, int cval, int ctime, int tid) {
        this.cid = cid;
        this.cname = cname;
        this.cval = cval;
        this.ctime = ctime;
        this.tid = tid;
    }

    /**
     * 获取
     * @return cid
     */
    public int getCid() {
        return cid;
    }

    /**
     * 设置
     * @param cid
     */
    public void setCid(int cid) {
        this.cid = cid;
    }

    /**
     * 获取
     * @return cname
     */
    public String getCname() {
        return cname;
    }

    /**
     * 设置
     * @param cname
     */
    public void setCname(String cname) {
        this.cname = cname;
    }

    /**
     * 获取
     * @return cval
     */
    public int getCval() {
        return cval;
    }

    /**
     * 设置
     * @param cval
     */
    public void setCval(int cval) {
        this.cval = cval;
    }

    /**
     * 获取
     * @return ctime
     */
    public int getCtime() {
        return ctime;
    }

    /**
     * 设置
     * @param ctime
     */
    public void setCtime(int ctime) {
        this.ctime = ctime;
    }

    /**
     * 获取
     * @return tid
     */
    public int getTid() {
        return tid;
    }

    /**
     * 设置
     * @param tid
     */
    public void setTid(int tid) {
        this.tid = tid;
    }

    public String toString() {
        return "Course{cid = " + cid + ", cname = " + cname + ", cval = " + cval + ", ctime = " + ctime + ", tid = " + tid + "}";
    }
}
