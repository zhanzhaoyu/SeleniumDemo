package javaBase.lemon.day10;
import cn.afterturn.easypoi.excel.annotation.Excel;
public class CaseInfo {
    @Excel(name="序号(caseId)")
    private  Integer id;
    @Excel(name="接口模块(interface)")
    private  String module;
    @Excel(name="接口地址(url)")
    private  String url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "CaseInfo{" +
                "id=" + id +
                ", module='" + module + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
