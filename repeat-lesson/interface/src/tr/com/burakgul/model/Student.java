package tr.com.burakgul.model;

import tr.com.burakgul.interfaces.Person;

public class Student implements Person {
    private String major;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
