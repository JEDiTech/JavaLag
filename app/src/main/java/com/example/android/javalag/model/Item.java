package com.example.android.javalag.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Master on 18/8/2017.
 */

public class Item {
    //Add serialized name for user login name and expose it
    @SerializedName("login")
    @Expose
    private String login;

    //Add serialized name for avatar url (user image link) and expose it
    @SerializedName("avatar_url")
    @Expose
    private String avatarUrl;

    //Add serialized name for html url (user page) and expose it
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;

    //Create a constructor for Item class
    public Item(String login, String avatarUrl, String htmlUrl){

        this.login = login;
        this.avatarUrl = avatarUrl;
        this.htmlUrl = htmlUrl;
    }

    //Create get and set methods
    public String getLogin(){
        return login;
    }
    public void setLogin(String login){
        this.login = login;
    }


    public String getAvatarUrl(){
        return avatarUrl;
    }
    public void setAvatarUrl(String avatarUrl){
        this.avatarUrl = avatarUrl;
    }


    public String getHtmlUrl(){
        return htmlUrl;
    }
    public void setHtmlUrl(String htmlUrl){
        this.htmlUrl = htmlUrl;
    }
}
