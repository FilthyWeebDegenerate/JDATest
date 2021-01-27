package com.filthyWeebDegenerate.JDATest.commands;

import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class createNecessaryRoles extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        String[] args = event.getMessage().getContentRaw().split("\\s+");

        var controller = event.getGuild();

        if (args[0].equalsIgnoreCase("createNecessaryRoles")) {
            controller.createRole()
                    .setName("MONKE")
                    .setColor(0x815B30)
                    .setPermissions(Permission.EMPTY_PERMISSIONS)
                    .queue();
        }
    }
}
