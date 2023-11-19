package com.fluorscent.sampleapp.model;

public class Employee {
    private String empName;
    private String empNo;
    private int deptNo;

    public Employee(String empName, String empNo, int deptNo) {
        this.empName = empName;
        this.empNo = empNo;
        this.deptNo = deptNo;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    /**
     * @return
     */
    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

}
