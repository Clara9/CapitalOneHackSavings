package com.example.seshack.model;

import com.google.gson.annotations.SerializedName;

public class DataItem{

    @SerializedName("zipCode")
    private String zipCode;

    @SerializedName("eligibleCd")
    private int eligibleCd;

    @SerializedName("website")
    private String website;

    @SerializedName("city")
    private String city;

    @SerializedName("recordCount")
    private int recordCount;

    @SerializedName("latitude")
    private String latitude;

    @SerializedName("start")
    private int start;

    @SerializedName("charityName")
    private String charityName;

    @SerializedName("statusCd")
    private int statusCd;

    @SerializedName("ein")
    private String ein;

    @SerializedName("donationUrl")
    private String donationUrl;

    @SerializedName("rows")
    private int rows;

    @SerializedName("url")
    private String url;

    @SerializedName("score")
    private int score;

    @SerializedName("missionStatement")
    private String missionStatement;

    @SerializedName("acceptingDonations")
    private int acceptingDonations;

    @SerializedName("deductibilityCd")
    private int deductibilityCd;

    @SerializedName("parent_ein")
    private int parentEin;

    @SerializedName("state")
    private String state;

    @SerializedName("category")
    private String category;

    @SerializedName("longitude")
    private String longitude;

    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }

    public String getZipCode(){
        return zipCode;
    }

    public void setEligibleCd(int eligibleCd){
        this.eligibleCd = eligibleCd;
    }

    public int getEligibleCd(){
        return eligibleCd;
    }

    public void setWebsite(String website){
        this.website = website;
    }

    public String getWebsite(){
        return website;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getCity(){
        return city;
    }

    public void setRecordCount(int recordCount){
        this.recordCount = recordCount;
    }

    public int getRecordCount(){
        return recordCount;
    }

    public void setLatitude(String latitude){
        this.latitude = latitude;
    }

    public String getLatitude(){
        return latitude;
    }

    public void setStart(int start){
        this.start = start;
    }

    public int getStart(){
        return start;
    }

    public void setCharityName(String charityName){
        this.charityName = charityName;
    }

    public String getCharityName(){
        return charityName;
    }

    public void setStatusCd(int statusCd){
        this.statusCd = statusCd;
    }

    public int getStatusCd(){
        return statusCd;
    }

    public void setEin(String ein){
        this.ein = ein;
    }

    public String getEin(){
        return ein;
    }

    public void setDonationUrl(String donationUrl){
        this.donationUrl = donationUrl;
    }

    public String getDonationUrl(){
        return donationUrl;
    }

    public void setRows(int rows){
        this.rows = rows;
    }

    public int getRows(){
        return rows;
    }

    public void setUrl(String url){
        this.url = url;
    }

    public String getUrl(){
        return url;
    }

    public void setScore(int score){
        this.score = score;
    }

    public int getScore(){
        return score;
    }

    public void setMissionStatement(String missionStatement){
        this.missionStatement = missionStatement;
    }

    public String getMissionStatement(){
        return missionStatement;
    }

    public void setAcceptingDonations(int acceptingDonations){
        this.acceptingDonations = acceptingDonations;
    }

    public int getAcceptingDonations(){
        return acceptingDonations;
    }

    public void setDeductibilityCd(int deductibilityCd){
        this.deductibilityCd = deductibilityCd;
    }

    public int getDeductibilityCd(){
        return deductibilityCd;
    }

    public void setParentEin(int parentEin){
        this.parentEin = parentEin;
    }

    public int getParentEin(){
        return parentEin;
    }

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public String getCategory(){
        return category;
    }

    public void setLongitude(String longitude){
        this.longitude = longitude;
    }

    public String getLongitude(){
        return longitude;
    }

    @Override
    public String toString(){
        return
                "DataItem{" +
                        "zipCode = '" + zipCode + '\'' +
                        ",eligibleCd = '" + eligibleCd + '\'' +
                        ",website = '" + website + '\'' +
                        ",city = '" + city + '\'' +
                        ",recordCount = '" + recordCount + '\'' +
                        ",latitude = '" + latitude + '\'' +
                        ",start = '" + start + '\'' +
                        ",charityName = '" + charityName + '\'' +
                        ",statusCd = '" + statusCd + '\'' +
                        ",ein = '" + ein + '\'' +
                        ",donationUrl = '" + donationUrl + '\'' +
                        ",rows = '" + rows + '\'' +
                        ",url = '" + url + '\'' +
                        ",score = '" + score + '\'' +
                        ",missionStatement = '" + missionStatement + '\'' +
                        ",acceptingDonations = '" + acceptingDonations + '\'' +
                        ",deductibilityCd = '" + deductibilityCd + '\'' +
                        ",parent_ein = '" + parentEin + '\'' +
                        ",state = '" + state + '\'' +
                        ",category = '" + category + '\'' +
                        ",longitude = '" + longitude + '\'' +
                        "}";
    }
}