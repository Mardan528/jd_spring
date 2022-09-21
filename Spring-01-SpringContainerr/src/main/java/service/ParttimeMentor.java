package service;

import interfaces.Mentor;

public class ParttimeMentor implements Mentor {
    @Override
    public void createAccount() {
        System.out.println("Part time mentor created ");
    }
}
