package api_learning;

public class FigureData {
    private String imgSrc;
    private String imgDesc;
    private String imgLink;

    public FigureData(String imgSrc, String imgDesc, String imgLink) {
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

    public String imgLink() {
        return imgLink;
    }

    @Override
    public String toString() {
        return "Lesson14{" +
                "imgSrc='" + imgSrc + '\'' +
                ", imgDesc='" + imgDesc + '\'' +
                ", imgLink='" + imgLink + '\'' +
                '}';
    }
}
