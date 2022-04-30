package discordbot.utils.messagebuilder;

import java.awt.Color;
import java.util.List;

import discordbot.TaikoVo.TaikoDiscordBotVO;
import net.dv8tion.jda.api.EmbedBuilder;

public class SongInfoMessageBuilder {

    public EmbedBuilder returnSongInfo(List<TaikoDiscordBotVO> result) {

        EmbedBuilder eb = new EmbedBuilder();

        String[] difficulty = {};
        String[] difficultyName = { "칸탄", "후츠우", "무즈카시", "오니", "우라" };

        String genre = "";
        String songName = "";

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i).getSongGenre());
            System.out.println(result.get(i).getSongName());
            System.out.println(result.get(i).getDifficult());

            difficulty = result.get(i).getDifficult().toString().split(" ");
            genre = result.get(i).getSongGenre().toString();
            songName = result.get(i).getSongName().toString();

        }
        // eb.addBlankField(false);

        eb.setAuthor("by zuzu578", "https://github.com/zuzu578",
                "https://avatars.githubusercontent.com/u/69393030?v=4");

        // eb.setFooter("Text",
        // "https://github.com/zekroTJA/DiscordBot/blob/master/.websrc/zekroBot_Logo_-_round_small.png");

        eb.setThumbnail(
                "https://avatars.githubusercontent.com/u/69393030?v=4");

        System.out.println("https://www.youtube.com/results?search_query=" + songName + "");
        eb.setTitle(songName + "에 대한 결과다동!",
                "https://www.youtube.com/results?search_query=" + songName.replace(" ", "").trim() + "");

        eb.setColor(Color.red);
        eb.setColor(new Color(0xF40C0C));
        eb.setColor(new Color(255, 0, 54));

        // eb.setDescription("!전적검색 명령어를 봇에게 명령하면 간단한 전적을검색할수있습니다🙂.");
        // eb.setDescription("!챔피언정보 명령어를 봇에게 명령하면 챔피언의 기본 stat 정보를 알려줍니다🤑.");
        eb.setDescription(genre);

        for (int i = 0; i < difficulty.length; i++) {
            eb.addField(difficultyName[i], difficulty[i], true);
        }

        return eb;

    }

}
