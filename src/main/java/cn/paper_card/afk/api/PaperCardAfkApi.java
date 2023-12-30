package cn.paper_card.afk.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.UUID;

@SuppressWarnings("unused")
public interface PaperCardAfkApi {
    @Nullable AfkPlayer getAfkPlayer(@NotNull UUID uuid);

    @NotNull List<AfkPlayer> getAfkPlayers();
}