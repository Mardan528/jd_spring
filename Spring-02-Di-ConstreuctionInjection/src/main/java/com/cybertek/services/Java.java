package com.cybertek.services;

import com.cybertek.Interfacec.Course;

public class Java implements Course {

    OfficeHourse officeHourse;

    public Java(OfficeHourse officeHourse) {

        this.officeHourse = officeHourse;
    }

    @Override
    public void getTeachHours() {

        System.out.println(" Weekly teaching hours :" +(20+ officeHourse.getHours()));
    }
}
