package com.fluorscent.sampleapp.model;

public class Employee {
    private String empName;
    private String empNo;
    private String deptNo;

    public Employee(String empName, String empNo, String deptNo) {
        this.empName = empName;
        this.empNo = empNo;
        this.deptNo = deptNo;
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
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
