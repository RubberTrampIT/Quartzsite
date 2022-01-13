package com.rubbertrampit.quartzsite;

public class Restaurant {
    int id;
    String name;
    String location;
    String phone;
    String website;
    String type;
    String short_description;
    String long_description;

    // constructors
    public Restaurant(){

    }

    public Restaurant(String name){
        this.name = name;
    }


    // setters
    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public void setWebsite(String website){
        this.website = website;
    }

    public void setShort_description(String short_description){
        this.short_description = short_description;
    }

    public void setLong_description(String long_description){
        this.long_description = long_description;
    }

    // getters
    public long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getType(){
        return this.type;
    }

    public String getLocation(){
        return this.location;
    }

    public String getPhone(){
        return this.phone;
    }

    public String getWebsite(){
        return this.website;
    }

    public String getShort_description(){
        return this.short_description;
    }

    public String getLong_description(){
        return this.long_description;
    }
}
