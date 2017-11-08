package com.study.luxin.deginpattern.builder;

/**
 * Created by luxin on 2017/11/5.
 * 通常4个或4个以上的参数才能使用,优势是javaBean有多个setter可能在不同setter之前间, 出现对象不一致的情况
 */
public class BuilderPattern {

    private int age;
    private String sex;
    private String describe;
    private int year;
    private int month;
    private int day;


    private BuilderPattern(Builder builder) {
        this.age = builder.age;
        this.sex = builder.sex;
        this.describe = builder.describe;
        this.year = builder.year;
        this.month = builder.month;
        this.day = builder.day;
    }


    public static class Builder {
        private int age;
        private String sex;
        private String describe;
        private int year = 2017;
        private int month;
        private int day;

        public Builder() {

        }

        public Builder setDay(int day) {
            this.day = day;
            return this;
        }

        public Builder setMonth(int month) {
            this.month = month;
            return this;
        }

        public Builder setYear(int year) {
            this.year = year;
            return this;
        }

        public Builder setDescribe(String describe) {
            this.describe = describe;
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

        public BuilderPattern builder() {
            return new BuilderPattern(this);
        }
    }


    class InnerClass {
    }


    public static void main(String[] args) {
        BuilderPattern builderPattern = new BuilderPattern.Builder().setAge(10).setDay(10).builder();

        Builder builder = new Builder();

        BuilderPattern pattern = new BuilderPattern(builder);
        BuilderPattern.Builder builder1 = new BuilderPattern.Builder();
        BuilderPattern.InnerClass innerClass = pattern.new InnerClass();
    }


}
