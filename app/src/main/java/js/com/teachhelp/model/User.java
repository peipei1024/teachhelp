package js.com.teachhelp.model;

import java.util.List;

import cn.bmob.v3.BmobUser;
import cn.bmob.v3.datatype.BmobFile;

/*
* Class name :User
*
* Version information :1.0.0
*
* Describe ：user的java类
*
* Author ：peixuze
*
* Created by pei on 2016/2/3.
*
*/
public class User extends BmobUser{
    /**手机号码*/
    private String mobilePhoneNumber;
    /**手机号码是否验证*/
    private boolean mobilePhoneNumberVerif;
    /**姓名*/
    private String name;
    /**密码*/
    private String password;
    /**QQ*/
    private String QQNumber;
    /**头像*/
    private BmobFile avatar;
    /**邮箱*/
    private String email;
    /**性别*/
    private String sex;
    /**标签*/
    private List<String> labels;
    /**类别,判断是老师还是学生*/
    private String stuOrTea;
    /**学院*/
    private String college;
    /**班级*/
    private String uclass;

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getUclass() {
        return uclass;
    }

    public void setUclass(String uclass) {
        this.uclass = uclass;
    }

    @Override
    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    @Override
    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public boolean isMobilePhoneNumberVerif() {
        return mobilePhoneNumberVerif;
    }

    public void setMobilePhoneNumberVerif(boolean mobilePhoneNumberVerif) {
        this.mobilePhoneNumberVerif = mobilePhoneNumberVerif;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQQNumber() {
        return QQNumber;
    }

    public void setQQNumber(String QQNumber) {
        this.QQNumber = QQNumber;
    }

    public BmobFile getAvatar() {
        return avatar;
    }

    public void setAvatar(BmobFile avatar) {
        this.avatar = avatar;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public String getStuOrTea() {
        return stuOrTea;
    }

    public void setStuOrTea(String stuOrTea) {
        this.stuOrTea = stuOrTea;
    }
}
