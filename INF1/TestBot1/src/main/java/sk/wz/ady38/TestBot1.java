package sk.wz.ady38;

import net.dv8tion.jda.api.sharding.DefaultShardManagerBuilder;
import net.dv8tion.jda.api.sharding.ShardManager;
import sk.wz.ady38.listener.DiscordEventListener;

import javax.security.auth.login.LoginException;

public class TestBot1 {

    // We reference the class here, also known as the instance.
    protected static TestBot1 selfBot;
    private ShardManager shardManager = null;

    // We will parse the token through an cli argument, this is a protection against leaking the token by accident. (By uploading it to git for example)
    public TestBot1(String token) {
        try {
            shardManager = buildShardManager(token);
        } catch (LoginException e) {
            System.out.println("Failed to start bot! Please check the console for any errors.");
            System.exit(0);
        }
    }

    private ShardManager buildShardManager(String token) throws LoginException {
        // It is often better to load your token in from an external file or environment variable, especially if you plan on publishing the source code.
        DefaultShardManagerBuilder builder =
                DefaultShardManagerBuilder.createDefault(token)
                        .addEventListeners(new DiscordEventListener(this));


        return builder.build();
    }

    public ShardManager getShardManager() {
        return shardManager;
    }
}
