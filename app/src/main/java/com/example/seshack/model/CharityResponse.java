package com.example.seshack.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class CharityResponse{

    @SerializedName("msg")
    private String msg;

    @SerializedName("code")
    private String code;

    @SerializedName("data")
    private List<DataItem> data;

    public void setMsg(String msg){
        this.msg = msg;
    }

    public String getMsg(){
        return msg;
    }

    public void setCode(String code){
        this.code = code;
    }

    public String getCode(){
        return code;
    }

    public void setData(List<DataItem> data){
        this.data = data;
    }

    public List<DataItem> getData(){
        return data;
    }

    @Override
    public String toString(){
        return
                "Response{" +
                        "msg = '" + msg + '\'' +
                        ",code = '" + code + '\'' +
                        ",data = '" + data + '\'' +
                        "}";
    }
}