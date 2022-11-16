package com.bootcoding.model;

public class Emp implements Comparable<Emp>{
    private String name;
    private int age;
    private long phone;

    public Emp(String name, int age, long phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                '}';
    }

    @Override
    public int compareTo(Emp emp) {
        if(this.getAge()<emp.getAge())
            return 1;
        else
            return 0;
    }
}
