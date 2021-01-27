package com.filthyWeebDegenerate.JDATest.commands;

import com.filthyWeebDegenerate.JDATest.bot;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class urMumGay extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        String[] args = event.getMessage().getContentRaw().split("\\s+");

        if (args[0].equalsIgnoreCase(bot.prefix + "UrMumGay")){
            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage("No she ain't BITCH").queue();
        }
    }
}
