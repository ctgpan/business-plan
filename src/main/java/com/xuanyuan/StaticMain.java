package com.xuanyuan;

import java.util.Date;

/**
 * Created by cheney on 2017/9/13.
 */
public class StaticMain {

    public static long time = new Date().getTime();
    public static long ID;
    static {
        System.out.println("static start .........");
        ID = new Date().getTime();
        System.out.println("static end ......... " + ID);
    }

    public StaticMain(){
        System.out.println("StaticMain() .........");
    }

    public long getId(){
        return ID;
    }

    /*public static void main(String[] args){
        System.out.println("init start .........");
        StaticMain obj = new StaticMain();
        System.out.println("time = " + time);
        System.out.println("id = " + ID);
        System.out.println("init end .........");


        System.out.println("\n\n=================================================\n");
        ClassLoader loader = StaticMain.class.getClassLoader();
        while(loader != null) {
            System.out.println(loader);
            loader = loader.getParent();    //获得父类加载器的引用
        }
        System.out.println(loader);

        System.out.println("\n\n=================================================\n");
        URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
        for (int i = 0; i < urls.length; i++) {
            System.out.println(urls[i].toExternalForm());
        }
    }*/
}
