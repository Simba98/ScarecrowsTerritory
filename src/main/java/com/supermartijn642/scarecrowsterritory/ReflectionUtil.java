package com.supermartijn642.scarecrowsterritory;

import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created 1/14/2021 by SuperMartijn642
 */
public class ReflectionUtil {

    public static Field findField(Class<?> classs, String fieldName){
        try{
            Field field = ObfuscationReflectionHelper.findField(classs, fieldName);
            field.setAccessible(true);
            return field;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public static Method findMethod(Class<?> classs, String methodName){
        try{
            Method method = ObfuscationReflectionHelper.findMethod(classs, methodName);
            method.setAccessible(true);
            return method;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
