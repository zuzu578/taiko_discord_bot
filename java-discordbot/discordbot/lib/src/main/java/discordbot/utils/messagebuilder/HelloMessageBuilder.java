package discordbot.utils.messagebuilder;

import java.awt.Color;

import net.dv8tion.jda.api.EmbedBuilder;

public class HelloMessageBuilder {

    public EmbedBuilder sayHello() {
        EmbedBuilder eb = new EmbedBuilder();

        eb.setTitle("태고의달인 디스코드봇이다 동! 반갑다 동!", "https://github.com/zuzu578");

        eb.setColor(Color.red);
        eb.setColor(new Color(0xF40C0C));
        eb.setColor(new Color(255, 0, 54));

        // eb.setDescription("!전적검색 명령어를 봇에게 명령하면 간단한 전적을검색할수있습니다🙂.");
        // eb.setDescription("!챔피언정보 명령어를 봇에게 명령하면 챔피언의 기본 stat 정보를 알려줍니다🤑.");
        eb.setDescription("!곡 난이도 검색 을 입력하면 검색한 곡의 난이도를 알려주겠다동!");
        eb.addField("!전체곡수 를 나에게 명령하면 아케이드 전체수록곡을 알려준다동!", "", true);
        eb.addField("!남코오리지날 곡 수 를 나에게 명령하면 남코오리지날 전체 곡 수를 알려준다동!", "", true);
        eb.addField("!jpop 곡 수 를 나에게 명령하면 jpop 전체 곡 수를 알려준다동!", "", true);
        eb.addField("!버라이어티 곡 수 를 나에게 명령하면 버라이어티 전체 곡 수를 알려준다동!", "", true);
        eb.addField("!키즈 곡 수 를 나에게 명령하면 키즈 전체 곡 수를 알려준다동!", "", true);
        eb.addField("!애니메이션 곡 수 를 나에게 명령하면 애니메이션 전체 곡 수를 알려준다동!", "", true);
        eb.addField("!게임뮤직 곡 수 를 나에게 명령하면 게임뮤직 전체 곡 수를 알려준다동!", "", true);
        eb.addField("!클래식 곡 수 를 나에게 명령하면 클래식 전체 곡 수를 알려준다동!", "", true);
        eb.addField("!보컬로이드 곡 수 를 나에게 명령하면 보컬로이드 전체 곡 수를 알려준다동!", "", true);
        // eb.addBlankField(false);

        eb.setAuthor("by zuzu578", "https://github.com/zuzu578",
                "https://avatars.githubusercontent.com/u/69393030?v=4");

        // eb.setFooter("Text",
        // "https://github.com/zekroTJA/DiscordBot/blob/master/.websrc/zekroBot_Logo_-_round_small.png");

        eb.setThumbnail(
                "https://avatars.githubusercontent.com/u/69393030?v=4");

        return eb;
    }

}
