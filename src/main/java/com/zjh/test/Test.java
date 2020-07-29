package com.zjh.test;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public class Test {
    private List<String> names;
    private Map<String,String> address;
    public static void main(String[] args) {
        try {
        Class clazz = Class.forName(Test.class.getCanonicalName());

        Field fields[] = clazz.getDeclaredFields();
        for (Field f:fields){
            System.out.println(f);
           Type type =  f.getGenericType();
            System.out.println(type);

            if (type instanceof ParameterizedType){
               Type parameterizedType[] =  ((ParameterizedType) type).getActualTypeArguments();
                System.out.println(parameterizedType[0].getTypeName());

            }
            System.out.println();
        }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
