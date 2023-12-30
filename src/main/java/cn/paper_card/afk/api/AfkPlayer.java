package cn.paper_card.afk.api;

@SuppressWarnings("unused")
public interface AfkPlayer {
    long getAfkSince(); // 从何时开始AFK，如果没有AFK，返回-1

    String getAfkMessage(); // AFK消息，如果没有AFK，那一定是NULL
}