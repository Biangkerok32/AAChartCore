package com.example.anan.chartcore_slim.AAChartCoreLib.AAOptionsModel;

import com.google.gson.Gson;

import java.util.HashMap;

public class AALabels {
    private String align;//轴标签的对齐方式，可用的值有 "left"、"center" 及 "right"。默认值是根据坐标轴的位置（在图表中的位置）即标签的旋转角度进行智能判断的。 默认是：center.
    private Object autoRotation; //只针对水平轴有效，允许在防止轴标签重叠时自动旋转轴标签的角度。当空间足够时，轴标签不会被旋转。当图表变小时（主要是宽度变小） ，轴标签开始旋转对应的角度，然后会依次删除间隔的轴标签并尝试旋转数组中的角度。可以通过将此参数设置为 false 来关闭轴标签旋转（这将导致标签自动换行）。 默认是：[-45].
    private Float autoRotationLimit;//当每个分类的宽度比该参数的值大很多（像素）时，轴标签将不会被自动旋转，而是以换行的形式展示轴标签。 当轴标签包含多个短词时换行展示轴标签可以使得轴标签有足够的空间，所以设置合理的自动旋转下限是非常有意义的。 默认是：80.
    private Float distance;//只针对极地图有效，定义周标签与绘图区边缘的距离。 默认是：15.
    private Boolean enabled;//是否显示坐标轴标签 默认是：true.
    private String format;//坐标轴格式化字符串。 默认是：{value}.
    private String formatter;//坐标轴格式化字符串。 默认是：{value}.
    private Float padding;//轴标签的内间距，作用是保证轴标签之间有空隙。 默认是：5.
    private Float rotation;//轴标签的旋转角度 默认是：0.
    private Integer staggerLines;//只针对水平轴有效，定义轴标签显示行数。
    private Integer step;//显示 n 的倍数标签，例如设置为 2 则表示标签间隔一个轴标签显示。默认情况下，为了避免轴标签被覆盖，该参数会根据情况自动计算。可以通过设置此参数为 1 来阻止自动计算。
    private String style;//轴标签的 CSS 样式
    private Float x;//相对于坐标轴刻度线的水平偏移。 默认是：0.
    private Float y;//相对于坐标轴刻度线的垂直平偏移。 默认是：null.
    private Boolean useHTML;//HTML渲染

    public AALabels align(String prop) {
        align = prop;
        return this;
    }

    public AALabels autoRotation(Object prop) {
        autoRotation = prop;        
        return this;
    }

    public AALabels autoRotationLimit(Float prop) {
        autoRotationLimit = prop;
        return this;
    }

    public AALabels distance(Float prop) {
        distance = prop;
        return this;
    }

    public AALabels enabled(Boolean prop) {
        enabled = prop;
        return this;
    }

    public AALabels Format(String prop) {
        format = prop;
        return this;
    }

    public AALabels formatter(String prop) {
        formatter = prop;
        return this;
    }

    public AALabels padding(Float prop) {
        padding = prop;
        return this;
    }

    public AALabels rotation(Float prop) {
        rotation = prop;
        return this;
    }

    public AALabels staggerLines(Integer prop) {
        staggerLines = prop;
        return this;
    }

    public AALabels step(Integer prop) {
        step = prop;
        return this;
    }

    public AALabels style(AAStyle prop) {
        Gson gson = new Gson();
        style =  gson.toJson(prop);
        return this;
    }

    public AALabels x(Float prop) {
        x = prop;
        return this;
    }

    public AALabels y(Float prop) {
        y = prop;
        return this;
    }

    public AALabels useHTML(Boolean prop) {
        useHTML = prop;
        return this;
    }
}
