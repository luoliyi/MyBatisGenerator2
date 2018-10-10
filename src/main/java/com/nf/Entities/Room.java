package com.nf.Entities;

import java.math.BigDecimal;

public class Room {
    private Integer rid;

    private String rname;

    private Byte rbednumber;

    private BigDecimal rprice;

    private Integer tid;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname == null ? null : rname.trim();
    }

    public Byte getRbednumber() {
        return rbednumber;
    }

    public void setRbednumber(Byte rbednumber) {
        this.rbednumber = rbednumber;
    }

    public BigDecimal getRprice() {
        return rprice;
    }

    public void setRprice(BigDecimal rprice) {
        this.rprice = rprice;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Room(String rname, Byte rbednumber, BigDecimal rprice, Integer tid) {
        this.rname = rname;
        this.rbednumber = rbednumber;
        this.rprice = rprice;
        this.tid = tid;
    }

    public Room(Integer rid, String rname, Byte rbednumber, BigDecimal rprice, Integer tid) {
        this.rid = rid;
        this.rname = rname;
        this.rbednumber = rbednumber;
        this.rprice = rprice;
        this.tid = tid;
    }

    @Override
    public String toString() {
        return "Room{" +
                "rid=" + rid +
                ", rname='" + rname + '\'' +
                ", rbednumber=" + rbednumber +
                ", rprice=" + rprice +
                ", tid=" + tid +
                '}';
    }
}