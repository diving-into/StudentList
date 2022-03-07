package com.fancy.pojo;

public class Student {
    private String sid;
    private String sname;
    private String spassword;
    private String sgender;
    private String sbatch;

    public Student() {
    }

    public Student(String sid, String sname, String spassword, String sgender, String sbatch) {
        this.sid = sid;
        this.sname = sname;
        this.spassword = spassword;
        this.sgender = sgender;
        this.sbatch = sbatch;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSpassword() {
        return spassword;
    }

    public void setSpassword(String spassword) {
        this.spassword = spassword;
    }

    public String getSgender() {
        return sgender;
    }

    public void setSgender(String sgender) {
        this.sgender = sgender;
    }

    public String getSbatch() {
        return sbatch;
    }

    public void setSbatch(String sbatch) {
        this.sbatch = sbatch;
    }
}
