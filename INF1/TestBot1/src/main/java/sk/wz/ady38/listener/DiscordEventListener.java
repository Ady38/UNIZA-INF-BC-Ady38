package sk.wz.ady38.listener;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.session.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import net.dv8tion.jda.api.requests.restaction.CommandListUpdateAction;
import net.dv8tion.jda.api.sharding.ShardManager;
import org.jetbrains.annotations.NotNull;
import sk.wz.ady38.TestBot1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DiscordEventListener extends ListenerAdapter {
        public TestBot1 bot;
        public DiscordEventListener(TestBot1 bot) {
            this.bot = bot;
        }

    // There is a reason why we don't add the commands IMMEDIENTLY after the bot starts up. The bot has to load in all the guilds it is in before it can add commands.
    @Override
    public void onReady(@NotNull ReadyEvent event) {
        registerCommands(bot.getShardManager());
    }

    // This method is called when the bot is ready to add commands. This is where we add the commands to the server.
    private void registerCommands(ShardManager jda) {
        Guild g = jda.getGuildById("592740305380311040"); // Replace this with the ID of your own server.
        if (g != null) {
            CommandListUpdateAction commands = g.updateCommands();
            commands.addCommands(Commands.slash("hello", "says hello to you publicly")).queue();
            commands.addCommands(Commands.slash("privatehello", "says hello only to you")).queue();
            commands.addCommands(Commands.slash("galavecer", "zacne prezentovat galavecer")).queue();
            // All slash commands must be added here. They follow a strict set of rules and are not as flexible as text commands.
            // Since we only need a simple command, we will only use a slash command without any arguments.
        }
    }

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        if (event.getName().equals("hello")) { // Is the command name "hello"?
            event.reply("Hello " + event.getUser().getAsMention() + "!") // What will we reply with?
                    .setEphemeral(false) // Do we want the message hidden so only the user who ran the command can see it?
                    .queue(); // Queue the reply.
        } else if (event.getName().equals("privatehello")) {
            event.reply("Hello " + event.getUser().getAsMention() + "!") // What will we reply with?
                    .setEphemeral(true) // Do we want the message hidden so only the user who ran the command can see it?
                    .queue();
        } else if (event.getName().equals("galavecer")) {
            try {
                Scanner skener = new Scanner(new File("C:\\Users\\adyad\\Documents\\UNIZA\\INF\\TestBot1\\src\\main\\java\\sk\\wz\\ady38\\listener\\data.txt"));
                event.deferReply().queue();
                do {
                    event.getHook().sendMessage(skener.nextLine()).queue();
                } while (skener.hasNextLine());
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
