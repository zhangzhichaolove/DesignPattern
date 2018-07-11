package com.peak.chao.建造者模式;

/**
 * Created by 003 on 2018/7/11.
 * 在了解之前，先假设有一个问题，我们需要创建一个学生对象，属性有name,number,class,sex,age,school等属性，如果每一个属性都可以为空，
 * 也就是说我们可以只用一个name,也可以用一个school,name,或者一个class,number，或者其他任意的赋值来创建一个学生对象，这时该怎么构造？
 */
public class Test {
    public static void main(String[] args) {
        Student a = new BuilderTest.Builder().setAge(13).setName("LiHua").build();
        Student b = new BuilderTest.Builder().setSchool("sc").setSex("Male").setName("ZhangSan").build();
        System.err.println(a);
        System.err.println(b);
    }

}

class BuilderTest {
    //构建器，利用构建器作为参数来构建Student对象
    static class Builder {
        String name = null;
        int number = -1;
        String sex = null;
        int age = -1;
        String school = null;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setNumber(int number) {
            this.number = number;
            return this;
        }

        public Builder setSex(String sex) {
            this.sex = sex;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setSchool(String school) {
            this.school = school;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

}

class Student {
    String name = null;
    int number = -1;
    String sex = null;
    int age = -1;
    String school = null;


    public Student(BuilderTest.Builder builder) {
        this.age = builder.age;
        this.name = builder.name;
        this.number = builder.number;
        this.school = builder.school;
        this.sex = builder.sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", school='" + school + '\'' +
                '}';
    }
}
