package com.ctrip.vdata.entity;

/**
 * Created by wang.zy on 2016/7/11.
 * trace log keys's wrapper class
 */
public class FilterClick {

    private String pagetab;
    private int slcityid;
    private String kwd;
    private String L;

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

    public String getKwd() {
        return kwd;
    }

    public void setKwd(String kwd) {
        this.kwd = kwd;
    }

    public String getL() {
        return L;
    }

    public void setL(String l) {
        L = l;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FilterClick that = (FilterClick) o;

        if (slcityid != that.slcityid) return false;
        if (!pagetab.equals(that.pagetab)) return false;
        return kwd.equals(that.kwd) && L.equals(that.L);

    }

    @Override
    public int hashCode() {
        int result = pagetab.hashCode();
        result = 31 * result + slcityid;
        result = 31 * result + kwd.hashCode();
        result = 31 * result + L.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "FilterClick{" +
                "pagetab='" + pagetab + '\'' +
                ", slcityid=" + slcityid +
                ", kwd='" + kwd + '\'' +
                ", L='" + L + '\'' +
                '}';
    }
}
