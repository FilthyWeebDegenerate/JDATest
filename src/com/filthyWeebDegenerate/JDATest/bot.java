package com.filthyWeebDegenerate.JDATest;

import com.filthyWeebDegenerate.JDATest.commands.createNecessaryRoles;
import com.filthyWeebDegenerate.JDATest.commands.iDontLikeYou;
import com.filthyWeebDegenerate.JDATest.commands.urMumGay;
import com.filthyWeebDegenerate.JDATest.commands.whoTheFuckAsked;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;

import javax.security.auth.login.LoginException;

public class bot {
    public static String prefix = "*";

    public static void main(String[] args) throws LoginException {
        JDA jda = JDABuilder.createDefault("ODAzNzQyNjE0MzE3Njk0OTg2.YBCNpA.aDmhnrHJ5cvEeZOQU4YYvVtOkxY").build();

        jda.getPresence().setStatus(OnlineStatus.IDLE);

        jda.addEventListener(new urMumGay());
        jda.addEventListener(new iDontLikeYou());
        jda.addEventListener(new createNecessaryRoles());
        jda.addEventListener(new whoTheFuckAsked());
    }
}
