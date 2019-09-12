package org.techtown.schooler.Model;

public class ChannelInfo {
    private String name;
    private String explain;
    private String create_user;
    private String thumbnail;
    private String isPublic;


    public ChannelInfo(String name, String explain, String create_user, String thumbnail, String isPublic) {
        this.name = name;
        this.explain = explain;
        this.create_user = create_user;
        this.thumbnail = thumbnail;
        this.isPublic = isPublic;
    }

    public String getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(String isPublic) {
        this.isPublic = isPublic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public void setCreate_user(String create_user) {
        this.create_user = create_user;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getName() {
        return name;
    }

    public String getExplain() {
        return explain;
    }

    public String getCreate_user() {
        return create_user;
    }

    public String getThumbnail() {
        return thumbnail;
    }
}
