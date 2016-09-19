package com.ctrip.vdata.entity;

/**
 * Created by wang.zy on 2016/7/11.
 */

public class PkgClick {
    private String pagetab;
    private int slcityid;
    private int stcityid;
    private String kwd;
    private String pkgid;
    private String bu;
    private int isfilter;
    private int page;
    private int mudule;
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

    public int getMudule() {
        return mudule;
    }

    public void setMudule(int mudule) {
        this.mudule = mudule;
    }

    public int getList_seq() {
        return list_seq;
    }

    public void setList_seq(int list_seq) {
        this.list_seq = list_seq;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PkgClick pkgClick = (PkgClick) o;

        if (slcityid != pkgClick.slcityid) return false;
        if (stcityid != pkgClick.stcityid) return false;
        if (isfilter != pkgClick.isfilter) return false;
        if (page != pkgClick.page) return false;
        if (mudule != pkgClick.mudule) return false;
        if (list_seq != pkgClick.list_seq) return false;
        if (!pagetab.equals(pkgClick.pagetab)) return false;
        if (!kwd.equals(pkgClick.kwd)) return false;
        if (!pkgid.equals(pkgClick.pkgid)) return false;
        return bu.equals(pkgClick.bu);

    }

    @Override
    public int hashCode() {
        int result = pagetab.hashCode();
        result = 31 * result + slcityid;
        result = 31 * result + stcityid;
        result = 31 * result + kwd.hashCode();
        result = 31 * result + pkgid.hashCode();
        result = 31 * result + bu.hashCode();
        result = 31 * result + isfilter;
        result = 31 * result + page;
        result = 31 * result + mudule;
        result = 31 * result + list_seq;
        return result;
    }

    @Override
    public String toString() {
        return "PkgClick{" +
                "pagetab='" + pagetab + '\'' +
                ", slcityid=" + slcityid +
                ", stcityid=" + stcityid +
                ", kwd='" + kwd + '\'' +
                ", pkgid=" + pkgid +
                ", bu='" + bu + '\'' +
                ", isfilter=" + isfilter +
                ", page=" + page +
                ", mudule=" + mudule +
                ", list_seq=" + list_seq +
                '}';
    }
}
