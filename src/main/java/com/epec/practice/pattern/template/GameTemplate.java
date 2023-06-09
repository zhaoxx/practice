package com.epec.practice.pattern.template;

/**
 * 游戏抽象类
 */
public abstract class GameTemplate {
    void initialize() {
    };

    abstract void startPlay();

    void endPlay(){
    };

    //模板
    public final void play(){
        //初始化游戏
        initialize();
        //开始游戏
        startPlay();
        //结束游戏
        endPlay();
    }
}

/**
 * 篮球
 */
class Basketball extends GameTemplate {
    void initialize() {
        System.out.println("初始化");
    };

    void startPlay(){
        System.out.println("开始篮球游戏");
    };

    void endPlay(){
        System.out.println("关闭资源");
    };
}

/**
 * 足球
 */
class Football extends GameTemplate {
    void initialize() {
        System.out.println("初始化");
    };

    void startPlay(){
        System.out.println("开始足球游戏");
    };

    void endPlay(){
        System.out.println("关闭资源");
    };
}



