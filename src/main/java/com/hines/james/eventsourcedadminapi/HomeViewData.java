package com.hines.james.eventsourcedadminapi;

public class HomeViewData {
    private Integer bounceRate;
    private Integer location;
    private Integer comments;
    private Integer visitors;
    private Integer productsSold;

    public Integer getBounceRate() {
        return bounceRate;
    }

    public void setBounceRate(Integer bounceRate) {
        this.bounceRate = bounceRate;
    }

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }

    public Integer getComments() {
        return comments;
    }

    public void setComments(Integer comments) {
        this.comments = comments;
    }

    public Integer getVisitors() {
        return visitors;
    }

    public void setVisitors(Integer visitors) {
        this.visitors = visitors;
    }

    public Integer getProductsSold() {
        return productsSold;
    }

    public void setProductsSold(Integer productsSold) {
        this.productsSold = productsSold;
    }
}
