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
        if (location=="none")
            throw new IllegalArgumentException("invalid argument.");
        this.location = location;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String toString()
    {
        return "Name:" +name + "; Location:" + location ;
    }
}
