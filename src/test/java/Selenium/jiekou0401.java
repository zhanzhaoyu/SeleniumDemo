package Selenium;

import cn.afterturn.easypoi.excel.annotation.Excel;

public class jiekou0401 {
    @Excel(name="序号")
private int caseid;
    @Excel(name="用例标题")
private String  title;
    @Excel(name="请求头")
private String  heafer;
    @Excel(name="请求方式")
private String  method;
    @Excel(name="接口地址")
private String  url;

    @Override
    public String toString() {
        return "jiekou0401{" +
                "caseid=" + caseid +
                ", title='" + title + '\'' +
                ", heafer='" + heafer + '\'' +
                ", method='" + method + '\'' +
                ", url='" + url + '\'' +
                ", params='" + params + '\'' +
                '}';
    }

    public jiekou0401() {
    }

    public jiekou0401(int caseid, String title, String heafer, String method, String url, String params) {
        this.caseid = caseid;
        this.title = title;
        this.heafer = heafer;
        this.method = method;
        this.url = url;
        this.params = params;
    }

    @Excel(name="参数输入")

private String  params;

    public int getCaseid() {
        return caseid;
    }

    public void setCaseid(int caseid) {
        this.caseid = caseid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHeafer() {
        return heafer;
    }

    public void setHeafer(String heafer) {
        this.heafer = heafer;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }
}
