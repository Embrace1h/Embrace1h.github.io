package com.model;

public class Organization {
    private int id;
    private String 组织名称;
    private String 组织编号;
    private String 地址;
    private String 支部书记;
    private String 委员;

    public Organization() {
    }

    public Organization(int id, String 组织名称, String 组织编号, String 地址, String 支部书记, String 委员) {
        this.id = id;
        this.组织名称 = 组织名称;
        this.组织编号 = 组织编号;
        this.地址 = 地址;
        this.支部书记 = 支部书记;
        this.委员 = 委员;
    }

    public Organization(String 组织名称, String 组织编号, String 地址, String 支部书记, String 委员) {
        this.组织名称 = 组织名称;
        this.组织编号 = 组织编号;
        this.地址 = 地址;
        this.支部书记 = 支部书记;
        this.委员 = 委员;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String get组织名称() {
        return 组织名称;
    }

    public void set组织名称(String 组织名称) {
        this.组织名称 = 组织名称;
    }

    public String get组织编号() {
        return 组织编号;
    }

    public void set组织编号(String 组织编号) {
        this.组织编号 = 组织编号;
    }

    public String get地址() {
        return 地址;
    }

    public void set地址(String 地址) {
        this.地址= 地址;
    }

    public String get支部书记() {
        return 支部书记;
    }

    public void set支部书记(String 支部书记) {
        this.支部书记 = 支部书记;
    }

    public String get委员() {
        return 委员;
    }

    public void set委员(String 委员) {
        this.委员 = 委员;
    }
}
