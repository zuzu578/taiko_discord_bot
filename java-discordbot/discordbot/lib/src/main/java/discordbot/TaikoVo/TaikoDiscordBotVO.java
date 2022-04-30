package discordbot.TaikoVo;

public class TaikoDiscordBotVO {

    private String songNo;
    private String songName;
    private String songGenre;
    private String difficult;

    public String getSongNo() {
        return songNo;
    }

    public void setSongNo(String songNo) {
        this.songNo = songNo;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSongGenre() {
        return songGenre;
    }

    public void setSongGenre(String songGenre) {
        this.songGenre = songGenre;
    }

    public String getDifficult() {
        return difficult;
    }

    public void setDifficult(String difficult) {
        this.difficult = difficult;
    }

}
