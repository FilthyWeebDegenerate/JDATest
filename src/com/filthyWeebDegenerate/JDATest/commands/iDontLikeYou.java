package com.filthyWeebDegenerate.JDATest.commands;

import com.filthyWeebDegenerate.JDATest.bot;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class iDontLikeYou extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        String[] args = event.getMessage().getContentRaw().split("\\s+");

        if (args[0].equalsIgnoreCase(bot.prefix + "IDontLikeYou")){

            EmbedBuilder Embed = new EmbedBuilder();

            Embed.setTitle("Why You Yes You Should Shut The Fuck Up");
            Embed.setDescription("You should shut up");
            Embed.addField("You should shut up", "YOU'RE ANNOYING", false);
            Embed.setColor(0xFF0000);
            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(Embed.build()).queue();
            Embed.clear();
        }
    }
}
