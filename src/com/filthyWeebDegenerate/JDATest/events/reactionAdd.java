package com.filthyWeebDegenerate.JDATest.events;

import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.events.message.guild.react.GuildMessageReactionAddEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class reactionAdd extends ListenerAdapter {
    public void onGuildMessageReactionAdd(GuildMessageReactionAddEvent event){
        if (event.getReactionEmote().getName().equals("🐒")) {
            var guildController = event.getGuild();
            guildController.addRoleToMember(event.getMember(), (Role) event.getJDA().getRolesByName("MONKE", false)).complete();
        }
    }
}
