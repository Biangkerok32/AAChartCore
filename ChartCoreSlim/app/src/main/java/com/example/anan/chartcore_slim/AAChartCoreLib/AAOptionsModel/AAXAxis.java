package com.example.anan.chartcore_slim.AAChartCoreLib.AAOptionsModel;

import com.google.gson.Gson;

public class AAXAxis {
    private String[] plotBands;
    private String[] plotLines;
    private String[] categories;
    private Boolean reversed;
    private Float lineWidth; //x轴轴线宽度
    private String lineColor; //x轴轴线线颜色
    private Float max; //x轴最大值
    private Float min;//x轴最小值（设置为0就不会有负数）
    private String tickColor; //x轴轴线下方刻度线颜色
    private Float gridLineWidth; //x轴网格线宽度
    private String gridLineColor; //x轴网格线颜色
    private String gridLineDashStyle; //x轴网格线样式
    private Float off;//x轴垂直偏移
    private String labels; //用于设置 x 轴文字相关的
    private Boolean visible; //用于设置 x 轴以及 x 轴文字是否显示
    private Boolean startOnTick; //Whether to force the axis to start on a tick. Use this option with the minPadding option to control the axis start. 默认是：false.
    private Integer tickInterval;//x轴刻度点间隔数(设置每隔几个点显示一个 X轴的内容:
    private String crosshair; //准星线样式设置
    private String tickmarkPlacement; //本参数只对分类轴有效。 当值为 on 时刻度线将在分类上方显示；当值为 between 时，刻度线将在两个分类中间显示。当 tickInterval 为 1 时，默认是 between，其他情况默认是 on。 默认是：null.
    private Float tickWidth;//坐标轴刻度线的宽度，设置为 0 时则不显示刻度线
    private Float tickLength;//坐标轴刻度线的长度。 默认是：10.
    private String tickPosition; //刻度线相对于轴线的位置，可用的值有 inside 和 outside，分别表示在轴线的内部和外部。 默认是：outside.


    public AAXAxis plotBands(String[] prop) {
        plotBands = prop;
        return this;
    }

    public AAXAxis plotLines(String[] prop) {
        plotLines = prop;
        return this;
    }

    public AAXAxis categories(String[] prop) {
        categories = categories;
        return this;
    }

    public AAXAxis reversed(Boolean prop) {
        reversed = prop;
        return this;
    }

    public AAXAxis lineWidth(Float prop) {
        lineWidth = prop;
        return this;
    }

    public AAXAxis lineColor(String prop) {
        lineColor = prop;
        return this;
    }

    public AAXAxis max(Float prop) {
        max = prop;
        return this;
    }

    public AAXAxis min(Float prop) {
        min = prop;
        return this;
    }

    public AAXAxis tickColor(String prop) {
        tickColor = prop;
        return this;
    }

    public AAXAxis gridLineWidth(Float prop) {
        gridLineWidth = prop;
        return this;
    }

    public AAXAxis gridLineColor(String prop) {
        gridLineColor = prop;
        return this;
    }

    public AAXAxis gridLineDashStyle(String prop) {
        gridLineDashStyle = prop;
        return this;
    }

    public AAXAxis off(Float prop) {
        off = prop;
        return this;
    }

    public AAXAxis labels(AALabels prop) {
        Gson gson = new Gson();
        labels = gson.toJson(prop);
        return this;
    }

    public AAXAxis visible(Boolean prop) {
        visible = prop;
        return this;
    }

    public AAXAxis startOnTick(Boolean prop) {
        startOnTick = prop;
        return this;
    }

    public AAXAxis tickInterval(Integer prop) {
        tickInterval = prop;
        return this;
    }

    public AAXAxis crosshair(AACrosshair prop) {
        Gson gson = new Gson();
        crosshair = gson.toJson(prop);
        return this;
    }

    public AAXAxis tickmarkPlacement(String prop) {
        tickmarkPlacement = prop;
        return this;
    }

    public AAXAxis tickWidth(Float prop) {
        tickWidth = prop;
        return this;
    }

    public AAXAxis tickLength(Float prop) {
        tickLength = prop;
        return this;
    }

    public AAXAxis tickPosition(String prop) {
        tickPosition = prop;
        return this;
    }
}
