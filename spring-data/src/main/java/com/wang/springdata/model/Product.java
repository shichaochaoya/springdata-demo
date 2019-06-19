package com.wang.springdata.model;


import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//主键选择自增方式
    private int id;

    @Column(name = "pname")
    private String pname;

    @Column(name = "price")
    private Double price;

    @Column(name = "bpid")
    private int bpid;

    @Column(name = "sid")
    private String sid;

//    public Product(Double price, String name) {
//        this.id = -1L;
//        this.price = price;
//        this.name = name;
//    }

    //    hibernate需要一个空构造函数

    public Product() {
    }

    /**
     * get,set
     * */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getBpid() {
        return bpid;
    }

    public void setBpid(int bpid) {
        this.bpid = bpid;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }
}
