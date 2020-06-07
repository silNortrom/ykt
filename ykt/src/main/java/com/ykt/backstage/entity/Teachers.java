package com.ykt.backstage.entity;

import java.io.Serializable;
import java.util.Date;

public class Teachers implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teachers.teacher_num
     *
     * @mbg.generated
     */
    private String teacherNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teachers.teacher_name
     *
     * @mbg.generated
     */
    private String teacherName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teachers.email
     *
     * @mbg.generated
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teachers.department_num
     *
     * @mbg.generated
     */
    private String departmentNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teachers.level
     *
     * @mbg.generated
     */
    private Integer level;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teachers.status
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teachers.created_at
     *
     * @mbg.generated
     */
    private Date createdAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teachers.updated_at
     *
     * @mbg.generated
     */
    private Date updatedAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teachers.is_leader
     *
     * @mbg.generated
     */
    private Integer isLeader;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teachers.teacher_head_pic
     *
     * @mbg.generated
     */
    private String teacherHeadPic;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table teachers
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teachers.teacher_num
     *
     * @return the value of teachers.teacher_num
     * @mbg.generated
     */
    public String getTeacherNum() {
        return teacherNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teachers.teacher_num
     *
     * @param teacherNum the value for teachers.teacher_num
     * @mbg.generated
     */
    public void setTeacherNum(String teacherNum) {
        this.teacherNum = teacherNum == null ? null : teacherNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teachers.teacher_name
     *
     * @return the value of teachers.teacher_name
     * @mbg.generated
     */
    public String getTeacherName() {
        return teacherName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teachers.teacher_name
     *
     * @param teacherName the value for teachers.teacher_name
     * @mbg.generated
     */
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teachers.email
     *
     * @return the value of teachers.email
     * @mbg.generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teachers.email
     *
     * @param email the value for teachers.email
     * @mbg.generated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teachers.department_num
     *
     * @return the value of teachers.department_num
     * @mbg.generated
     */
    public String getDepartmentNum() {
        return departmentNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teachers.department_num
     *
     * @param departmentNum the value for teachers.department_num
     * @mbg.generated
     */
    public void setDepartmentNum(String departmentNum) {
        this.departmentNum = departmentNum == null ? null : departmentNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teachers.level
     *
     * @return the value of teachers.level
     * @mbg.generated
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teachers.level
     *
     * @param level the value for teachers.level
     * @mbg.generated
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teachers.status
     *
     * @return the value of teachers.status
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teachers.status
     *
     * @param status the value for teachers.status
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teachers.created_at
     *
     * @return the value of teachers.created_at
     * @mbg.generated
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teachers.created_at
     *
     * @param createdAt the value for teachers.created_at
     * @mbg.generated
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teachers.updated_at
     *
     * @return the value of teachers.updated_at
     * @mbg.generated
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teachers.updated_at
     *
     * @param updatedAt the value for teachers.updated_at
     * @mbg.generated
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teachers.is_leader
     *
     * @return the value of teachers.is_leader
     * @mbg.generated
     */
    public Integer getIsLeader() {
        return isLeader;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teachers.is_leader
     *
     * @param isLeader the value for teachers.is_leader
     * @mbg.generated
     */
    public void setIsLeader(Integer isLeader) {
        this.isLeader = isLeader;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teachers.teacher_head_pic
     *
     * @return the value of teachers.teacher_head_pic
     * @mbg.generated
     */
    public String getTeacherHeadPic() {
        return teacherHeadPic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teachers.teacher_head_pic
     *
     * @param teacherHeadPic the value for teachers.teacher_head_pic
     * @mbg.generated
     */
    public void setTeacherHeadPic(String teacherHeadPic) {
        this.teacherHeadPic = teacherHeadPic == null ? null : teacherHeadPic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teachers
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", teacherNum=").append(teacherNum);
        sb.append(", teacherName=").append(teacherName);
        sb.append(", email=").append(email);
        sb.append(", departmentNum=").append(departmentNum);
        sb.append(", level=").append(level);
        sb.append(", status=").append(status);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", isLeader=").append(isLeader);
        sb.append(", teacherHeadPic=").append(teacherHeadPic);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}