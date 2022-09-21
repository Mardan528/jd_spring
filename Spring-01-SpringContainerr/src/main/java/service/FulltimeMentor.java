package service;

import interfaces.Mentor;

public class FulltimeMentor implements Mentor {
    @Override
    public void createAccount() {
        System.out.println("Full time mentor craeted ");
    }
}
