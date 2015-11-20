package libwy.symbio.com.puxian;

/**
 * Created by wilbyang on 20/11/15.
 */
public class Story {
    private String title;
    private String summary;
    private String imageUrl;
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Story(String title, String summary, String imageUrl, String url) {
        this.title = title;
        this.summary = summary;
        this.imageUrl = imageUrl;
        this.url = url;
    }

    public Story() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
