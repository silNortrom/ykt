package com.ykt.backstage.entity;

import java.io.Serializable;
import java.util.Date;

public class LostWarnings implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lost_warnings.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lost_warnings.sno
     *
     * @mbg.generated
     */
    private String sno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lost_warnings.sname
     *
     * @mbg.generated
     */
    private String sname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lost_warnings.gender_code
     *
     * @mbg.generated
     */
    private String genderCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lost_warnings.stu_type
     *
     * @mbg.generated
     */
    private String stuType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lost_warnings.class_name
     *
     * @mbg.generated
     */
    private String className;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lost_warnings.class_no
     *
     * @mbg.generated
     */
    private String classNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lost_warnings.major_code
     *
     * @mbg.generated
     */
    private String majorCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lost_warnings.major_name
     *
     * @mbg.generated
     */
    private String majorName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lost_warnings.department_code
     *
     * @mbg.generated
     */
    private String departmentCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lost_warnings.department_name
     *
     * @mbg.generated
     */
    private String departmentName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lost_warnings.wno
     *
     * @mbg.generated
     */
    private String wno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lost_warnings.wname
     *
     * @mbg.generated
     */
    private String wname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lost_warnings.grade
     *
     * @mbg.generated
     */
    private String grade;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lost_warnings.created_at
     *
     * @mbg.generated
     */
    private Date createdAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lost_warnings.updated_at
     *
     * @mbg.generated
     */
    private Date updatedAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lost_warnings.w_department_code
     *
     * @mbg.generated
     */
    private String wDepartmentCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lost_warnings.school_year
     *
     * @mbg.generated
     */
    private String schoolYear;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lost_warnings.school_term
     *
     * @mbg.generated
     */
    private String schoolTerm;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lost_warnings.last_action_type
     *
     * @mbg.generated
     */
    private String lastActionType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lost_warnings.last_action_location
     *
     * @mbg.generated
     */
    private String lastActionLocation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lost_warnings.last_action_time
     *
     * @mbg.generated
     */
    private Date lastActionTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lost_warnings
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lost_warnings.id
     *
     * @return the value of lost_warnings.id
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lost_warnings.id
     *
     * @param id the value for lost_warnings.id
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lost_warnings.sno
     *
     * @return the value of lost_warnings.sno
     * @mbg.generated
     */
    public String getSno() {
        return sno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lost_warnings.sno
     *
     * @param sno the value for lost_warnings.sno
     * @mbg.generated
     */
    public void setSno(String sno) {
        this.sno = sno == null ? null : sno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lost_warnings.sname
     *
     * @return the value of lost_warnings.sname
     * @mbg.generated
     */
    public String getSname() {
        return sname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lost_warnings.sname
     *
     * @param sname the value for lost_warnings.sname
     * @mbg.generated
     */
    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lost_warnings.gender_code
     *
     * @return the value of lost_warnings.gender_code
     * @mbg.generated
     */
    public String getGenderCode() {
        return genderCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lost_warnings.gender_code
     *
     * @param genderCode the value for lost_warnings.gender_code
     * @mbg.generated
     */
    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode == null ? null : genderCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lost_warnings.stu_type
     *
     * @return the value of lost_warnings.stu_type
     * @mbg.generated
     */
    public String getStuType() {
        return stuType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lost_warnings.stu_type
     *
     * @param stuType the value for lost_warnings.stu_type
     * @mbg.generated
     */
    public void setStuType(String stuType) {
        this.stuType = stuType == null ? null : stuType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lost_warnings.class_name
     *
     * @return the value of lost_warnings.class_name
     * @mbg.generated
     */
    public String getClassName() {
        return className;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lost_warnings.class_name
     *
     * @param className the value for lost_warnings.class_name
     * @mbg.generated
     */
    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lost_warnings.class_no
     *
     * @return the value of lost_warnings.class_no
     * @mbg.generated
     */
    public String getClassNo() {
        return classNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lost_warnings.class_no
     *
     * @param classNo the value for lost_warnings.class_no
     * @mbg.generated
     */
    public void setClassNo(String classNo) {
        this.classNo = classNo == null ? null : classNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lost_warnings.major_code
     *
     * @return the value of lost_warnings.major_code
     * @mbg.generated
     */
    public String getMajorCode() {
        return majorCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lost_warnings.major_code
     *
     * @param majorCode the value for lost_warnings.major_code
     * @mbg.generated
     */
    public void setMajorCode(String majorCode) {
        this.majorCode = majorCode == null ? null : majorCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lost_warnings.major_name
     *
     * @return the value of lost_warnings.major_name
     * @mbg.generated
     */
    public String getMajorName() {
        return majorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lost_warnings.major_name
     *
     * @param majorName the value for lost_warnings.major_name
     * @mbg.generated
     */
    public void setMajorName(String majorName) {
        this.majorName = majorName == null ? null : majorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lost_warnings.department_code
     *
     * @return the value of lost_warnings.department_code
     * @mbg.generated
     */
    public String getDepartmentCode() {
        return departmentCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lost_warnings.department_code
     *
     * @param departmentCode the value for lost_warnings.department_code
     * @mbg.generated
     */
    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode == null ? null : departmentCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lost_warnings.department_name
     *
     * @return the value of lost_warnings.department_name
     * @mbg.generated
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lost_warnings.department_name
     *
     * @param departmentName the value for lost_warnings.department_name
     * @mbg.generated
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lost_warnings.wno
     *
     * @return the value of lost_warnings.wno
     * @mbg.generated
     */
    public String getWno() {
        return wno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lost_warnings.wno
     *
     * @param wno the value for lost_warnings.wno
     * @mbg.generated
     */
    public void setWno(String wno) {
        this.wno = wno == null ? null : wno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lost_warnings.wname
     *
     * @return the value of lost_warnings.wname
     * @mbg.generated
     */
    public String getWname() {
        return wname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lost_warnings.wname
     *
     * @param wname the value for lost_warnings.wname
     * @mbg.generated
     */
    public void setWname(String wname) {
        this.wname = wname == null ? null : wname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lost_warnings.grade
     *
     * @return the value of lost_warnings.grade
     * @mbg.generated
     */
    public String getGrade() {
        return grade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lost_warnings.grade
     *
     * @param grade the value for lost_warnings.grade
     * @mbg.generated
     */
    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lost_warnings.created_at
     *
     * @return the value of lost_warnings.created_at
     * @mbg.generated
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lost_warnings.created_at
     *
     * @param createdAt the value for lost_warnings.created_at
     * @mbg.generated
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lost_warnings.updated_at
     *
     * @return the value of lost_warnings.updated_at
     * @mbg.generated
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lost_warnings.updated_at
     *
     * @param updatedAt the value for lost_warnings.updated_at
     * @mbg.generated
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lost_warnings.w_department_code
     *
     * @return the value of lost_warnings.w_department_code
     * @mbg.generated
     */
    public String getwDepartmentCode() {
        return wDepartmentCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lost_warnings.w_department_code
     *
     * @param wDepartmentCode the value for lost_warnings.w_department_code
     * @mbg.generated
     */
    public void setwDepartmentCode(String wDepartmentCode) {
        this.wDepartmentCode = wDepartmentCode == null ? null : wDepartmentCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lost_warnings.school_year
     *
     * @return the value of lost_warnings.school_year
     * @mbg.generated
     */
    public String getSchoolYear() {
        return schoolYear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lost_warnings.school_year
     *
     * @param schoolYear the value for lost_warnings.school_year
     * @mbg.generated
     */
    public void setSchoolYear(String schoolYear) {
        this.schoolYear = schoolYear == null ? null : schoolYear.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lost_warnings.school_term
     *
     * @return the value of lost_warnings.school_term
     * @mbg.generated
     */
    public String getSchoolTerm() {
        return schoolTerm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lost_warnings.school_term
     *
     * @param schoolTerm the value for lost_warnings.school_term
     * @mbg.generated
     */
    public void setSchoolTerm(String schoolTerm) {
        this.schoolTerm = schoolTerm == null ? null : schoolTerm.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lost_warnings.last_action_type
     *
     * @return the value of lost_warnings.last_action_type
     * @mbg.generated
     */
    public String getLastActionType() {
        return lastActionType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lost_warnings.last_action_type
     *
     * @param lastActionType the value for lost_warnings.last_action_type
     * @mbg.generated
     */
    public void setLastActionType(String lastActionType) {
        this.lastActionType = lastActionType == null ? null : lastActionType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lost_warnings.last_action_location
     *
     * @return the value of lost_warnings.last_action_location
     * @mbg.generated
     */
    public String getLastActionLocation() {
        return lastActionLocation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lost_warnings.last_action_location
     *
     * @param lastActionLocation the value for lost_warnings.last_action_location
     * @mbg.generated
     */
    public void setLastActionLocation(String lastActionLocation) {
        this.lastActionLocation = lastActionLocation == null ? null : lastActionLocation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lost_warnings.last_action_time
     *
     * @return the value of lost_warnings.last_action_time
     * @mbg.generated
     */
    public Date getLastActionTime() {
        return lastActionTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lost_warnings.last_action_time
     *
     * @param lastActionTime the value for lost_warnings.last_action_time
     * @mbg.generated
     */
    public void setLastActionTime(Date lastActionTime) {
        this.lastActionTime = lastActionTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lost_warnings
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sno=").append(sno);
        sb.append(", sname=").append(sname);
        sb.append(", genderCode=").append(genderCode);
        sb.append(", stuType=").append(stuType);
        sb.append(", className=").append(className);
        sb.append(", classNo=").append(classNo);
        sb.append(", majorCode=").append(majorCode);
        sb.append(", majorName=").append(majorName);
        sb.append(", departmentCode=").append(departmentCode);
        sb.append(", departmentName=").append(departmentName);
        sb.append(", wno=").append(wno);
        sb.append(", wname=").append(wname);
        sb.append(", grade=").append(grade);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", wDepartmentCode=").append(wDepartmentCode);
        sb.append(", schoolYear=").append(schoolYear);
        sb.append(", schoolTerm=").append(schoolTerm);
        sb.append(", lastActionType=").append(lastActionType);
        sb.append(", lastActionLocation=").append(lastActionLocation);
        sb.append(", lastActionTime=").append(lastActionTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}