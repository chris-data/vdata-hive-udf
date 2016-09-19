package com.ctrip.vdata.udf;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.ctrip.vdata.entity.PkgExpos;
import org.apache.hadoop.hive.ql.exec.UDF;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by wang.zy on 2016/9/18.
 */
public class TraceParser extends UDF {

    /*{"pagetab":"vac","slcityid":"477","kwd":"成都","isfilter":0,"pkgid":"5804787","stcityid":"515","bu":"grp","module":2,"list_seq":9,"page":""}*/
    public String evaluate(String str, String key) throws JSONException {
        if (str == null || key == null) {
            return null;
        }
        String  strs = str.replace("\"\\\"","").replace("\\\"\"", "").replace("\\","");

        String pattern = "\"pagetab\":\"diy\"";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(strs);
        if(!m.find()){
            return null;
        }

        String pattern1 = "\"level\"";
        Pattern r1 = Pattern.compile(pattern1);
        Matcher m1 = r1.matcher(strs);
        if(m1.find()){
            return null;
        }


        PkgExpos data = JSON.parseObject(strs.trim(), PkgExpos.class);
        switch (key.trim().toLowerCase()) {
            case "pagetab":
                return data.getPagetab();
            case "slcityid":
                return String.valueOf(data.getSlcityid());
            case "kwd":
                return data.getKwd();
            case "isfilter":
                return String.valueOf(data.getIsfilter());
            case "pkgid":
                return data.getPkgid();
            case "stcityid":
                return String.valueOf(data.getStcityid());
            case "bu":
                return data.getBu();
            case "module":
                return String.valueOf(data.getModule());
            case "list_seq":
                return String.valueOf(data.getList_seq());
            case "page":
                return String.valueOf(data.getPage());
        }
        return null;
    }
}
