package com.cybertek.services;

import com.cybertek.Interfacec.Course;
import org.springframework.stereotype.Component;


@Component
public class Java implements Course {



    @Override
    public void getTeachHours() {

        System.out.println(" Weekly teaching hours : 20" );
    }

}
