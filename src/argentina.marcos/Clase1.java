package argentina.marcos;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

import static org.bukkit.Bukkit.getServer;

public class Clase1 implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        getServer().broadcastMessage(ChatColor.BOLD + "MiPlugin: " + ChatColor.LIGHT_PURPLE + "En funcionamiento");
        if (commandSender instanceof Player){
            Player player = (Player) commandSender;
            Location ubic = ((Player) commandSender).getLocation();
            getServer().getWorld(((Player) commandSender).getWorld().getName()).playSound(ubic, Sound.AMBIENT_SOUL_SAND_VALLEY_ADDITIONS,1,1);
            HashMap<Integer, ItemStack> aa = new HashMap<>();
            System.out.println("Hello github");
            System.out.println("Hello github2");
            System.out.println("Hello github3");
            System.out.println("Nueva rama");
            System.out.println("Nueva rama2");
            System.out.println("Prueba jere");
        }
        return false;
    }
}
