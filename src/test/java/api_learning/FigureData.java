package api_learning;

public class Lesson14 {
    private String imgSrc;
    private String imgDesc;
    private String imgLink;

    public Lesson14(String imgSrc, String imgDesc, String imgLink) {
        this.imgSrc = imgSrc;
        this.imgDesc = imgDesc;
        this.imgLink = imgLink;
    }

    public String imgSrc() {
        return imgSrc;
    }

    public String imgDesc() {
        return imgDesc;
    }

    public String getImgLink() {
        return imgLink;
    }
}
