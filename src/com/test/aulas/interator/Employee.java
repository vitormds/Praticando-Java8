package com.test.aulas.interator;
public class Employee {

    int empid;
    String name;
    int age;

    public Employee(int empid,String name,int age)
    {
        this.empid=empid;
        this.name=name;
        this.age=age;
    }
    public int getEmpid() {
        return empid;
    }
    public void setEmpid(int empid) {
        this.empid = empid;
    }
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    } 
}