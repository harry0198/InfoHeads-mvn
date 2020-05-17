package com.haroldstudios.infoheads.conversations;

import com.haroldstudios.infoheads.utils.MessageUtil;
import org.bukkit.ChatColor;
import org.bukkit.conversations.ConversationContext;
import org.bukkit.conversations.ConversationPrefix;

public final class InfoHeadsConversationPrefix implements ConversationPrefix {

    public String getPrefix(ConversationContext context) {
        return MessageUtil.PREFIX + ChatColor.WHITE;
    }
}