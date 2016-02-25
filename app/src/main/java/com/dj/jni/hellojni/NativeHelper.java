package com.dj.jni.hellojni;

/**
 * @author DragonJiang
 * @Date 2016/2/17
 * @Time 11:24
 * @description
 */
public class NativeHelper {

    public native String getStringFromJni();

    static {
        System.loadLibrary("HelloJni");
    }
}
