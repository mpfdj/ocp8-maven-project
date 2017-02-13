package com.oracle.advanced.clazz.design.object;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

class Hippo {
    private String name;
    private double weigth;

    public Hippo(String name, double weigth) {
        this.name = name;
        this.weigth = weigth;
    }

    @Override
    public String toString() { // using common-lang library from apache
        // return name;
        // return ToStringBuilder.reflectionToString(this);  // com.oracle.chapter01.Hippo@d716361[name=Nelly,weigth=1000.0]
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);  // Hippo[name=Nelly,weigth=1000.0]
    }

}

public class ToString {

    public static void main(String args[]) {
        Hippo hippo = new Hippo("Nelly", 1000);
        System.out.println(hippo);
    }

}
