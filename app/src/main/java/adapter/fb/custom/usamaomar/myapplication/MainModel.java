package adapter.fb.custom.usamaomar.myapplication;

/**
 * Created by usamaomar on 9/8/17.
 */

public class MainModel {

    private int id;
    private String name;
    private String image;
    private boolean likeState;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isLikeState() {
        return likeState;
    }

    public void setLikeState(boolean likeState) {
        this.likeState = likeState;
    }
}
