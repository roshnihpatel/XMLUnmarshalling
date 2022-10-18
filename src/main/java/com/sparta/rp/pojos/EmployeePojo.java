package com.sparta.rp.pojos;

public class EmployeePojo {

    private int id;
    private String name;
    private String jobTitle;

    public EmployeePojo(int id, String name, String jobTitle) {
        this.id = id;
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public EmployeePojo() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    @Override
    public String toString() {
        return "EmployeePojo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
