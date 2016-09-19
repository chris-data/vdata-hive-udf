package com.ctrip.vdata.entity;

/**
 * Created by wang.zy on 2016/7/11.
 */
public class PkgExpos {

    /*'{"pagetab":"vac","slcityid":"477","kwd":"成都","isfilter":0,"pkgid":"5804787","stcityid":"515","bu":"grp","module":2,"list_seq":9,"page":""}'*/
    private String pagetab;
    private int slcityid;
    private int stcityid;
    private String kwd;
    private String pkgid;
    private String bu;
    private int isfilter;
    private int page;
    private int module;
    private int list_seq;

    public String getPagetab() {
        return pagetab;
    }

    public void setPagetab(String pagetab) {
        this.pagetab = pagetab;
    }

    public int getSlcityid() {
        return slcityid;
    }

    public void setSlcityid(int slcityid) {
        this.slcityid = slcityid;
    }

    public int getStcityid() {
        return stcityid;
    }

    public void setStcityid(int stcityid) {
        this.stcityid = stcityid;
    }

    public String getKwd() {
        return kwd;
    }

    public void setKwd(String kwd) {
        this.kwd = kwd;
    }

    public String getPkgid() {
        return pkgid;
    }

    public void setPkgid(String pkgid) {
        this.pkgid = pkgid;
    }

    public String getBu() {
        return bu;
    }

    public void setBu(String bu) {
        this.bu = bu;
    }

    public int getIsfilter() {
        return isfilter;
    }

    public void setIsfilter(int isfilter) {
        this.isfilter = isfilter;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getModule() {
        return module;
    }

    public void setModule(int module) {
        this.module = module;
    }

    public int getList_seq() {
        return list_seq;
    }

    public void setList_seq(int list_seq) {
        this.list_seq = list_seq;
    }

}
