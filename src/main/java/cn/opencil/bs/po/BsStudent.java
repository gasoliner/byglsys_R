package cn.opencil.bs.po;

public class BsStudent {
    private Long uid;

    private String academyid;

    private String deptid;

    private String employeenum;

    private String stdname;

    private String password;

    private Integer sex;

    private String major;

    private String rankid;

    private String kind;

    private String phone;

    private String email;

    private String research;

    private String comments;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getAcademyid() {
        return academyid;
    }

    public void setAcademyid(String academyid) {
        this.academyid = academyid == null ? null : academyid.trim();
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid == null ? null : deptid.trim();
    }

    public String getEmployeenum() {
        return employeenum;
    }

    public void setEmployeenum(String employeenum) {
        this.employeenum = employeenum == null ? null : employeenum.trim();
    }

    public String getStdname() {
        return stdname;
    }

    public void setStdname(String stdname) {
        this.stdname = stdname == null ? null : stdname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getRankid() {
        return rankid;
    }

    public void setRankid(String rankid) {
        this.rankid = rankid == null ? null : rankid.trim();
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind == null ? null : kind.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getResearch() {
        return research;
    }

    public void setResearch(String research) {
        this.research = research == null ? null : research.trim();
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }
}