package com.zhou.biyongxposed;

import java.io.Serializable;

public class Eventvalue implements Serializable {
    private int id;
    private String name;
    private int value;
    private String coincount;
    public Eventvalue(Integer id, String name, int value, String coincount){
        this.id=id;
        this.name = name;
        this.value  = value;
        this.coincount=coincount;
    }

    public int getType(){return id;}
    public String getName(){ return name; }
    public int getValue(){ return value; }
    public String getCoincount(){return coincount;}
    public void setType(){this.id=id;}
    public void setName(String name){ this.name=name; }
    public void setValue(int value){ this.value=value; }
    public void setCoincount(String db){this.coincount=db;}
}
