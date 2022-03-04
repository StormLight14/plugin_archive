package me.stormlight.bullycommand;
        import me.stormlight.bullycommand.commands.Bully;
        import org.bukkit.plugin.java.JavaPlugin;

public final class BullyCommand extends JavaPlugin {

    @Override
    public void onEnable() {
        // Register our command "kit" (set an instance of your command class as executor)
        this.getCommand("bully").setExecutor(new Bully());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
