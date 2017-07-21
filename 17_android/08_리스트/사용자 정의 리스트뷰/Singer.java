package kr.co.mlec.java94;

/**
 * Created by Administrator on 2017-07-20.
 */

public class Singer {
    private String name;
    private String birth;
    private int img;

    public Singer(String name, String birth, int img) {
        this.name = name;
        this.birth = birth;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
