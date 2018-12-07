package cn.linhome.lib.jshandler.model;

import org.json.JSONObject;

public class StartAppPageJsonModel
{
    private String dev_type;
    private String android_page;
    private String json;

    public void parseJson(String json) throws Exception
    {
        JSONObject jsonObject = new JSONObject(json);
        this.dev_type = jsonObject.getString("dev_type");
        this.android_page = jsonObject.getString("android_page");
        this.json = json;
    }

    public String getAndroid_page()
    {
        return android_page;
    }

    public void setAndroid_page(String android_page)
    {
        this.android_page = android_page;
    }

    public String getDev_type()
    {
        return dev_type;
    }

    public void setDev_type(String dev_type)
    {
        this.dev_type = dev_type;
    }

    public String getJson()
    {
        return json;
    }
}
