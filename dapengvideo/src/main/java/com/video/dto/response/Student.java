package com.video.dto.response;

/**
 * @Description: java类作用描述
 * @Author: yupengxia
 * @CreateDate: 2020-05-09 14:40
 * @UpdateUser: yupengxia
 * @UpdateDate: 2020-05-09 14:40
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class Student {
    private String stuName;
    private String stuGender;
    private String stuAge;

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuGender() {
        return stuGender;
    }

    public void setStuGender(String stuGender) {
        this.stuGender = stuGender;
    }

    public String getStuAge() {
        return stuAge;
    }

    public void setStuAge(String stuAge) {
        this.stuAge = stuAge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", stuGender='" + stuGender + '\'' +
                ", stuAge='" + stuAge + '\'' +
                '}';
    }
}
