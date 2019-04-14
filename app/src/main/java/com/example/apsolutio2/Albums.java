package com.example.apsolutio2;

import java.util.ArrayList;

public class Albums {
    private String name, source, imageURL;

    public Albums(String name, String source, String imageURL) {
        this.name = name;
        this.source = source;
        this.imageURL = imageURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    /*private ArrayList<Albums> initAlbums(){
        ArrayList<Albums> list = new ArrayList<>();
        list.add(new Albums("Fake Love", "Love Yourself: Tear", "https://upload.wikimedia.org/wikipedia/en/thumb/8/84/Fake_Love_%28Rocking_Vibe_Mix%29_Cover_Art.jpg/220px-Fake_Love_%28Rocking_Vibe_Mix%29_Cover_Art.jpg"));
        list.add(new Albums("Fake Love", "Love Yourself: Tear", "https://upload.wikimedia.org/wikipedia/en/thumb/8/84/Fake_Love_%28Rocking_Vibe_Mix%29_Cover_Art.jpg/220px-Fake_Love_%28Rocking_Vibe_Mix%29_Cover_Art.jpg"));
        list.add(new Albums("Fake Love", "Love Yourself: Tear", "https://upload.wikimedia.org/wikipedia/en/thumb/8/84/Fake_Love_%28Rocking_Vibe_Mix%29_Cover_Art.jpg/220px-Fake_Love_%28Rocking_Vibe_Mix%29_Cover_Art.jpg"));
        list.add(new Albums("Fake Love", "Love Yourself: Tear", "https://upload.wikimedia.org/wikipedia/en/thumb/8/84/Fake_Love_%28Rocking_Vibe_Mix%29_Cover_Art.jpg/220px-Fake_Love_%28Rocking_Vibe_Mix%29_Cover_Art.jpg"));
        list.add(new Albums("Fake Love", "Love Yourself: Tear", "https://upload.wikimedia.org/wikipedia/en/thumb/8/84/Fake_Love_%28Rocking_Vibe_Mix%29_Cover_Art.jpg/220px-Fake_Love_%28Rocking_Vibe_Mix%29_Cover_Art.jpg"));

        return list;
    }*/
}
