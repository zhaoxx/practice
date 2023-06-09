package com.epec.practice.pattern.template;

/**
 * @Description
 */
public abstract class BuildHouseTemplate {

    /**
     * 准备原材料
     */
    abstract void zhunBeiYuanCaiLiao();

    /**
     * 打地基
     */
    abstract void daDiJi();

    /**
     * 砌墙
     */
    abstract void qiQiang();

    /**
     * 盖屋顶
     */
    abstract void gaiWuDing();

    /**
     * 修建地暖
     */
    void xiuJianDiNuan(){
        // 空实现
    }

    /**
     * 是否需修建地暖
     * @return
     */
    abstract boolean needXiuJianDiNuan();

    //模板
    public final void buildHouse(){
        // 准备原材料
        zhunBeiYuanCaiLiao();

        // 打地基
        daDiJi();

        // 砌墙
        qiQiang();

        // 盖屋顶
        gaiWuDing();

        // 需要修建地暖
        if(needXiuJianDiNuan()){
            xiuJianDiNuan();
        }
    }

    public static void main(String[] args) {
        // 地暖房
        System.out.println("=========地暖房=========");
        DiNuanHouse diNuanHouse = new DiNuanHouse("地暖房", true);
        diNuanHouse.buildHouse();

        // 无地暖房
        System.out.println("=========无地暖房=========");
        WuDiNuanHouse wuDiNuanHouse = new WuDiNuanHouse("无地暖房", false);
        wuDiNuanHouse.buildHouse();
    }
}

/**
 * 修房子（有地暖）
 */
class DiNuanHouse extends BuildHouseTemplate {

    /**
     * 房屋名称
     */
    private String houseName;

    private boolean needXiuJianDiNuan = false;

    public DiNuanHouse(String houseName, boolean needXiuJianDiNuan) {
        this.houseName = houseName;
        this.needXiuJianDiNuan = needXiuJianDiNuan;
    }

    @Override
    void zhunBeiYuanCaiLiao() {
        System.out.println(this.houseName + "：准备原材料");
    }

    @Override
    void daDiJi() {
        System.out.println(this.houseName + "：打地基");
    }

    @Override
    void qiQiang() {
        System.out.println(this.houseName + "：砌墙");
    }

    @Override
    void gaiWuDing() {
        System.out.println(this.houseName + "：盖屋顶");
    }

    @Override
    void xiuJianDiNuan() {
        System.out.println(this.houseName + "：修建地暖");
    }

    @Override
    boolean needXiuJianDiNuan() {
        return this.needXiuJianDiNuan;
    }
}


/**
 * 修房子（无地暖）
 */
class WuDiNuanHouse extends BuildHouseTemplate {

    /**
     * 房屋名称
     */
    private String houseName;

    private boolean needXiuJianDiNuan = false;

    public WuDiNuanHouse(String houseName, boolean needXiuJianDiNuan) {
        this.houseName = houseName;
        this.needXiuJianDiNuan = needXiuJianDiNuan;
    }

    @Override
    void zhunBeiYuanCaiLiao() {
        System.out.println(this.houseName + "：准备原材料");
    }

    @Override
    void daDiJi() {
        System.out.println(this.houseName + "：打地基");
    }

    @Override
    void qiQiang() {
        System.out.println(this.houseName + "：砌墙");
    }

    @Override
    void gaiWuDing() {
        System.out.println(this.houseName + "：盖屋顶");
    }

    @Override
    boolean needXiuJianDiNuan() {
        return this.needXiuJianDiNuan;
    }
}