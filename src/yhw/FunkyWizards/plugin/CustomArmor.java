package yhw.FunkyWizards.plugin;

import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

public class CustomArmor implements Listener {

	Plugin plugin;
	
	public CustomArmor(Main plugin) {
		
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
		this.plugin = plugin;	
		
		}	
	
	/*@EventHandler
	public void onClose(InventoryCloseEvent event) {
		
		Player player = (Player) event.getPlayer();
		
		List<String> lore = player.getInventory().getHelmet().getItemMeta().getLore();
		List<String> lore2 = player.getInventory().getChestplate().getItemMeta().getLore();
		List<String> lore3 = player.getInventory().getLeggings().getItemMeta().getLore();
		List<String> lore4 = player.getInventory().getBoots().getItemMeta().getLore();
		
		//int speedArmor = 1;
		
		//while (speedArmor > 0) {
		
			if (player.getInventory().getHelmet().getItemMeta().hasLore() && player.getInventory().getChestplate().getItemMeta().hasLore() && player.getInventory().getLeggings().getItemMeta().hasLore() && player.getInventory().getBoots().getItemMeta().hasLore()) {
				
				if(lore.toString().contains("of the Flash Set") && lore2.toString().contains("of the Flash Set") && lore3.toString().contains("of the Flash Set") && lore4.toString().contains("of the Flash Set")) {
					
					//speedArmor = 1;
					MetadataValue FlashTime = new FixedMetadataValue(plugin, true);
					player.setMetadata("Flash", FlashTime);
					//PotionEffect FlashEffect = new PotionEffect(PotionEffectType.SPEED, 1, 10);
					//player.addPotionEffect(FlashEffect);
					player.sendMessage(ChatColor.RED + "FLaSh TimE");
					
				}
				
			}
			
			// ---------------------------------------------------------------------------------------------------------------------------------------------------------------- //
			
			if (player.getInventory().getHelmet().getItemMeta().hasLore() && player.getInventory().getChestplate().getItemMeta().hasLore() && player.getInventory().getLeggings().getItemMeta().hasLore() && player.getInventory().getBoots().getItemMeta().hasLore()) {
				
				//player.sendMessage(ChatColor.GREEN + "Okie dokie atrichokie!");
				
				if(!lore.toString().contains("of the Flash Set") || !lore2.toString().contains("of the Flash Set") || !lore3.toString().contains("of the Flash Set") || !lore4.toString().contains("of the Flash Set") && (player.hasMetadata("Flash"))) {
					
					player.sendMessage(ChatColor.GREEN + "Okie dokie atrichokie!");
					
					if(player.hasMetadata("Flash")) {
						//Collection<PotionEffect> Nark = player.getActivePotionEffects();
						//Object Speed = PotionEffectType.SPEED;
						//Nark.remove(Speed);
						//player.removePotionEffect(PotionEffectType.SPEED);
						player.removeMetadata("Flash", plugin);
						player.sendMessage(ChatColor.DARK_PURPLE + "Okie dokie atrichokie!");
					}
					
				}
				
			}
				
			if(!player.getInventory().getHelmet().getItemMeta().hasLore() || !player.getInventory().getChestplate().getItemMeta().hasLore() || !player.getInventory().getLeggings().getItemMeta().hasLore() || !player.getInventory().getBoots().getItemMeta().hasLore()) {
				
				//player.sendMessage(ChatColor.GREEN + "Okie dokie atrichokie!");
				
				if(player.hasMetadata("Flash")) {
					//Collection<PotionEffect> Nark = player.getActivePotionEffects();
					//Object Speed = PotionEffectType.SPEED;
					//Nark.remove(Speed);
					//player.removePotionEffect(PotionEffectType.SPEED);
					player.removeMetadata("Flash", plugin);
					player.sendMessage(ChatColor.DARK_PURPLE + "Okie dokie atrichokie!");
				}
				
			}
					
			if(!player.getInventory().getHelmet().hasItemMeta() || !player.getInventory().getChestplate().hasItemMeta() || !player.getInventory().getLeggings().hasItemMeta() || !player.getInventory().getBoots().hasItemMeta()) {
				
				//player.sendMessage(ChatColor.GREEN + "Okie dokie atrichokie!");
				
				if(player.hasMetadata("Flash")) {
					//Collection<PotionEffect> Nark = player.getActivePotionEffects();
					//Object Speed = PotionEffectType.SPEED;
					//Nark.remove(Speed);
					//player.removePotionEffect(PotionEffectType.SPEED);
					player.removeMetadata("Flash", plugin);
					player.sendMessage(ChatColor.DARK_PURPLE + "Okie dokie atrichokie!");
				}
				
			}
			
			if(player.getInventory().getHelmet().getType() == null && player.getInventory().getChestplate().getType() != null && player.getInventory().getLeggings().getType() != null && player.getInventory().getBoots().getType() != null) {
				
				//player.sendMessage(ChatColor.GREEN + "Air is good!");
				
				if(player.hasMetadata("Flash")) {
					//Collection<PotionEffect> Nark = player.getActivePotionEffects();
					//Object Speed = PotionEffectType.SPEED;
					//Nark.remove(Speed);
					//player.removePotionEffect(PotionEffectType.SPEED);
					player.removeMetadata("Flash", plugin);
					player.sendMessage(ChatColor.DARK_PURPLE + "Okie dokie atrichokie!");
				}
				
			}
			
			if(player.hasMetadata("Flash")) {
				
				PotionEffect FlashEffect = new PotionEffect(PotionEffectType.SPEED, 120, 10);
				player.addPotionEffect(FlashEffect);
				player.sendMessage(ChatColor.AQUA + "Okie dokie atrichokie!");
				
			}			
			
	}*/

	public class PlayerTaskThing extends BukkitRunnable {
		   private Player player;
		   public PlayerTaskThing(Player player) {
		      this.player = player;
		   }
		   @Override
		   public void run() {
			   
			   	List<String> lore = player.getInventory().getHelmet().getItemMeta().getLore();
				List<String> lore2 = player.getInventory().getChestplate().getItemMeta().getLore();
				List<String> lore3 = player.getInventory().getLeggings().getItemMeta().getLore();
				List<String> lore4 = player.getInventory().getBoots().getItemMeta().getLore();
			   
			   if (player.getInventory().getHelmet().getItemMeta().hasLore() && player.getInventory().getChestplate().getItemMeta().hasLore() && player.getInventory().getLeggings().getItemMeta().hasLore() && player.getInventory().getBoots().getItemMeta().hasLore()) {
					
					if(lore.toString().contains("of the Flash Set") && lore2.toString().contains("of the Flash Set") && lore3.toString().contains("of the Flash Set") && lore4.toString().contains("of the Flash Set")) {
						
						MetadataValue FlashTime = new FixedMetadataValue(plugin, true);
						player.setMetadata("Flash", FlashTime);
						
					}
					
			   } 
			   
			   else {
				   
				   player.removeMetadata("Flash", plugin);
				   
			   }
				
			if(player.hasMetadata("Flash")) {
					
				PotionEffect FlashEffect = new PotionEffect(PotionEffectType.SPEED, 60, 10);
				player.addPotionEffect(FlashEffect);
				PotionEffect FlashEffect2 = new PotionEffect(PotionEffectType.FAST_DIGGING, 60, 10);
				player.addPotionEffect(FlashEffect2);
					
				}	
				
		}
			   
	}

	/*public class PandaMode extends BukkitRunnable {
		   private Player player;
		   public PandaMode(Player player) {
		      this.player = player;
		   }
		   @Override
		   public void run() {
			   
			   	List<String> lore = player.getInventory().getHelmet().getItemMeta().getLore();
				List<String> lore2 = player.getInventory().getChestplate().getItemMeta().getLore();
				List<String> lore3 = player.getInventory().getLeggings().getItemMeta().getLore();
				List<String> lore4 = player.getInventory().getBoots().getItemMeta().getLore();
			   
			   if (player.getInventory().getHelmet().getItemMeta().hasLore() && player.getInventory().getChestplate().getItemMeta().hasLore() && player.getInventory().getLeggings().getItemMeta().hasLore() && player.getInventory().getBoots().getItemMeta().hasLore()) {
					
					if(lore.toString().contains("of the Flash Set") && lore2.toString().contains("of the Flash Set") && lore3.toString().contains("of the Flash Set") && lore4.toString().contains("of the Flash Set")) {
						
						MetadataValue FlashTime = new FixedMetadataValue(plugin, true);
						player.setMetadata("Flash", FlashTime);
						
					}
					
			   } 
			   
			   else {
				   
				   player.removeMetadata("Flash", plugin);
				   
			   }
				
			if(player.hasMetadata("Flash")) {
					
				PotionEffect FlashEffect = new PotionEffect(PotionEffectType.SPEED, 60, 10);
				player.addPotionEffect(FlashEffect);
				PotionEffect FlashEffect2 = new PotionEffect(PotionEffectType.FAST_DIGGING, 60, 10);
				player.addPotionEffect(FlashEffect2);
					
				}	
				
		}
			   
	}*/
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		
		new PlayerTaskThing(event.getPlayer()).runTaskTimer(plugin, 2L, 2L);
		
	}
		
}
	
