public class MyTreasure {
    private String name;
    private String location;
    private String imageUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location ;
    }

    public void setLocation(String location) {
        if (location.contains("xxx"))
            throw new IllegalArgumentException("invalid location of xxx.");
        this.location = location;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        if (!imageUrl.contains("http://"))
            throw new IllegalArgumentException("invalid argument.");
        this.imageUrl = imageUrl;
    }

    public String toString()
    {
        return "Name:" +name + "; Location:" + location ;
    }
}
