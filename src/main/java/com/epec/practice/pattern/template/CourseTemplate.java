package com.epec.practice.pattern.template;

/**
 * @Description
 */
public abstract class CourseTemplate {

    /**
     * 发布资料
     */
    abstract void deliver();

    /**
     * 制作课件
     */
    abstract void ppt();

    /**
     * 在线直播
     */
    abstract void video();

    /**
     * 上传作业
     */
    abstract void uploadhomework();

    /**
     * 布置作业
     */
    abstract void assign();

    /**
     * 检查作业
     */
    abstract void check();

    /**
     * 钩子方法
     * @return
     */
    abstract boolean needCheckHomework();

    //模板
    public final void createCourse(){
        // 发布资料
        deliver();

        // 制作课件
        ppt();

        // 在线直播
        video();

        // 上传作业
        uploadhomework();

        // 布置作业
        assign();

        // 检查作业
        if(needCheckHomework()){
            check();
        }
    }

    public static void main(String[] args) {
        // 语文课程（需检查作业）
        System.out.println("=========语文课程=========");
        ChineseCourse chineseCourse = new ChineseCourse("语文", true);
        chineseCourse.createCourse();

        // 数学课程（无需检查作业）
        System.out.println("=========数学课程=========");
        MathCourse mathCourse = new MathCourse("数学", false);
        mathCourse.createCourse();
    }
}

class ChineseCourse extends CourseTemplate {

    /**
     * 课程名称
     */
    private String courseName;

    private boolean needCheckHomework = false;

    public ChineseCourse(String courseName, boolean needCheckHomework) {
        this.courseName = courseName;
        this.needCheckHomework = needCheckHomework;
    }

    @Override
    boolean needCheckHomework() {
        // 语文作业需检查
        return needCheckHomework;
    }

    /**
     * 发布资料
     */
    @Override
    void deliver() {
        System.out.println(this.courseName + "：发布资料");
    };

    /**
     * 制作课件
     */
    @Override
    void ppt() {
        System.out.println(this.courseName + "：制作课件");
    };

    /**
     * 在线直播
     */
    @Override
    void video(){
        System.out.println(this.courseName + "：在线直播");
    }

    /**
     * 上传作业
     */
    @Override
    void uploadhomework() {
        System.out.println(this.courseName + "：上传作业");
    }

    /**
     * 布置作业
     */
    @Override
    void assign(){
        System.out.println(this.courseName + "：布置作业");
    }

    /**
     * 检查作业
     */
    @Override
    void check(){
        System.out.println(this.courseName + "：检查作业");
    }
}

class MathCourse extends CourseTemplate {


    /**
     * 课程名称
     */
    private String courseName;

    private boolean needCheckHomework = false;

    public MathCourse(String courseName, boolean needCheckHomework) {
        this.courseName = courseName;
        this.needCheckHomework = needCheckHomework;
    }

    @Override
    boolean needCheckHomework() {
        // 语文作业需检查
        return needCheckHomework;
    }

    /**
     * 发布资料
     */
    @Override
    void deliver() {
        System.out.println(this.courseName + "：发布资料");
    };

    /**
     * 制作课件
     */
    @Override
    void ppt() {
        System.out.println(this.courseName + "：制作课件");
    };

    /**
     * 在线直播
     */
    @Override
    void video(){
        System.out.println(this.courseName + "：在线直播");
    }

    /**
     * 上传作业
     */
    @Override
    void uploadhomework() {
        System.out.println(this.courseName + "：上传作业");
    }

    /**
     * 布置作业
     */
    @Override
    void assign(){
        System.out.println(this.courseName + "：布置作业");
    }

    /**
     * 检查作业
     */
    @Override
    void check(){
        System.out.println(this.courseName + "：检查作业");
    }
}