package com.cybertek.services;

import com.cybertek.Interfacec.Course;

public class Java implements Course {



    @Override
    public void getTeachHours() {

        System.out.println(" Weekly teaching hours : 20" );
    }


    public void myInitMethod(){

        System.out.println("executing init method ");
    }

    public void myDestroyMethod(){

        System.out.println("executing destroy method ");
    }
}
