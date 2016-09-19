package com.ctrip.vdata.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by wang.zy on 2016/9/18.
 */
public class Utils {

    public static void main(String[] args){
        String str="{\"vid\":null,\"sid\":null,\"pvid\":null,\"ts\":\"1473052822941\",\"key\":\"pkg_list_pkgexpos_h5\",\"ip\":null,\"value\":\"\\\"{\\\\\\\"module\\\\\\\":1,\\\\\\\"list_seq\\\\\\\":1,\\\\\\\"pagetab\\\\\\\":\\\\\\\"diy\\\\\\\",\\\\\\\"slcityid\\\\\\\":2,\\\\\\\"stcityid\\\\\\\":34,\\\\\\\"kwd\\\\\\\":0,\\\\\\\"pkgid\\\\\\\":\\\\\\\"11747795\\\\\\\",\\\\\\\"bu\\\\\\\":\\\\\\\"grp\\\\\\\",\\\\\\\"thmid\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"level\\\\\\\":\\\\\\\"专业\\\\\\\",\\\\\\\"Isfilter\\\\\\\":true,\\\\\\\"page\\\\\\\":\\\\\\\"\\\\\\\"}\\\"\",\"pageid\":null,\"ua\":null,\"zdate\":null,\"newvalue\":null,\"d\":\"2016-09-05\"}";
        str=str.replace("\"\\\"","").replace("\\\"\"", "").replace("\\","");

        System.out.println(str);

        String pattern = "\"pagetab\":\"diy\"";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(str);
        if(!m.find()){
            System.err.println("not found!");
        }
        else {
            System.err.println(" found!");
        }
    }
}
