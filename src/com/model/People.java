package com.model;
//对应information表
/**
 * 党员信息实体  对应information表
 * @author Embrace
 */
public class People {
    private int id;//编号
    private String name;//姓名
    private String gender;//性别
    private String date;//出生日期
    private String degree;//学位
    private String home;//籍贯
    private String 职务职称;//职务职称,入党时间,党内职务,身份证号,政治面貌,组织名称
    private String 入党时间;
    private String 党内职务;
    private String 身份证号;
    private String 政治面貌;
    private String 组织名称;
    private String userName;
    private String password;
    private double balance;

    public People() {
    }
    public People(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = 100.0;
    }



    public People(String name,String userName, String password) {
        this.name = name;
        this.userName = userName;
        this.password = password;
    }

    public People(String name, String gender, String date, String degree, String home,
                  String 职务职称, String 入党时间, String 党内职务, String 身份证号, String 政治面貌, String 组织名称) {
        this.name = name;
        this.gender = gender;
        this.date = date;
        this.degree = degree;
        this.home = home;
        this.职务职称 = 职务职称;
        this.入党时间 = 入党时间;
        this.党内职务 = 党内职务;
        this.身份证号 = 身份证号;
        this.政治面貌 = 政治面貌;
        this.组织名称 = 组织名称;
    }

    public People(int id, String name, String gender, String date, String degree, String home,
                  String 职务职称, String 入党时间, String 党内职务, String 身份证号, String 政治面貌, String 组织名称) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.date = date;
        this.degree = degree;
        this.home = home;
        this.职务职称 = 职务职称;
        this.入党时间 = 入党时间;
        this.党内职务 = 党内职务;
        this.身份证号 = 身份证号;
        this.政治面貌 = 政治面貌;
        this.组织名称 = 组织名称;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String get职务职称() {
        return 职务职称;
    }

    public void set职务职称(String 职务职称) {
        this.职务职称 = 职务职称;
    }

    public String get入党时间() {
        return 入党时间;
    }

    public void set入党时间(String 入党时间) {
        this.入党时间 = 入党时间;
    }

    public String get党内职务() {
        return 党内职务;
    }

    public void set党内职务(String 党内职务) {
        this.党内职务 = 党内职务;
    }

    public String get身份证号() {
        return 身份证号;
    }

    public void set身份证号(String 身份证号) {
        this.身份证号 = 身份证号;
    }

    public String get政治面貌() {
        return 政治面貌;
    }

    public void set政治面貌(String 政治面貌) {
        this.政治面貌 = 政治面貌;
    }

    public String get组织名称() {
        return 组织名称;
    }

    public void set组织名称(String 组织名称) {
        this.组织名称 = 组织名称;
    }
}