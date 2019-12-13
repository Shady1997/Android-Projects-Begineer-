package com.shady191997.countryflag.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import okhttp3.Response;

public class Content {
    @SerializedName("IsSuccess")
    @Expose
    private Boolean isSuccess;
    @SerializedName("UserMessage")
    @Expose
    private Object userMessage;
    @SerializedName("TechnicalMessage")
    @Expose
    private Object technicalMessage;
    @SerializedName("TotalCount")
    @Expose
    private Integer totalCount;
    @SerializedName("Response")
    @Expose
    private List<Country> response = null;

    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Object getUserMessage() {
        return userMessage;
    }

    public void setUserMessage(Object userMessage) {
        this.userMessage = userMessage;
    }

    public Object getTechnicalMessage() {
        return technicalMessage;
    }

    public void setTechnicalMessage(Object technicalMessage) {
        this.technicalMessage = technicalMessage;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<Country> getResponse() {
        return response;
    }

    public void setResponse(List<Country> response) {
        this.response = response;
    }
}
