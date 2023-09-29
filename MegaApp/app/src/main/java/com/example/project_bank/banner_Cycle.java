package com.example.project_bank;

public class banner_Cycle {

    String Id;
    String ImageURL;
    String URL;


    public  banner_Cycle(String id, String imageURL, String URL) {
        Id = id;
        ImageURL = imageURL;
        this.URL = URL;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getImageURL() {
        return ImageURL;
    }

    public void setImageURL(String imageURL) {
        ImageURL = imageURL;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}
