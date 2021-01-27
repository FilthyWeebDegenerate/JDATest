package com.filthyWeebDegenerate.JDATest.commands;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.io.File;
import java.util.List;
import java.util.Objects;

public class whoTheFuckAsked extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        String[] args = event.getMessage().getContentRaw().split("\\s+");

        if (args[0].equalsIgnoreCase("whoAsked")){
            event.getChannel().sendTyping().queue();
            event.getChannel().sendFile(new File("C:\\Users\\jorge\\OneDrive\\Desktop\\Projects\\Java\\DoscordBots\\JDATest\\src\\com\\filthyWeebDegenerate\\JDATest\\files\\video\\WTFA.mov")).queue();
        }
    }
}
