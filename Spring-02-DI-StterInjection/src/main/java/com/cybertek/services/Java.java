package com.cybertek.services;

import com.cybertek.Interfacec.Course;

public class Java implements Course {

    private OfficeHourse officeHourse;

    public OfficeHourse getOfficeHourse() {
        return officeHourse;
    }

    public void setOfficeHourse(OfficeHourse officeHourse) {
        this.officeHourse = officeHourse;
    }

    @Override
    public void getTeachHours() {

        System.out.println(" Weekly teaching hours :" +(20+ officeHourse.getHours()));
    }
}
