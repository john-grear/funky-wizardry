package yhw.FunkyWizards.plugin;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Main extends JavaPlugin {

	  	@Override
	    public void onEnable() {
	  		//Plugin Test = Bukkit.getPluginManager().getPlugin("FunkyWizardry");
	  		new FunkyWizardryGUIs(this);
	  		new CustomArmor(this);  		
	  		
	  		/*Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
	  			public void run() {
	  				
	  				
	  				
	  			}
	  			
	  		}, 60, 100);*/
	  		
	  	}
	    @Override
	    public void onDisable() {
	    }
	    
	    
	    @Override
	    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {   	
	    	
	    	if(cmd.getName().equalsIgnoreCase("fw") || cmd.getName().equalsIgnoreCase("funkywizardry")) {
	    		Player player = (Player) sender;
	    		Inventory spellbookGUI = Bukkit.createInventory(player, 45, ChatColor.DARK_AQUA + "Main Spell Branch");
	    		
	    		//PotionEffect manaa = PotionBrewer.createEffect​(PotionEffectType.LUCK, 1, 100);
	    		PotionEffect mana = new PotionEffect(PotionEffectType.LUCK, 100, 100);
	    		//PotionEffect pp = PotionEffectType.registerPotionEffect(mana);
	    		player.addPotionEffect(mana);
	    		
	    		
	    		ItemStack ManaPot = new ItemStack(Material.POTION);
	    			ItemMeta ManaPotMeta = ManaPot.getItemMeta();
	    			ManaPotMeta.setDisplayName(ChatColor.AQUA.toString() + ChatColor.BOLD + "Mana Potion");
	    			ManaPot.setItemMeta(ManaPotMeta);
	    			//registerPotionEffect(mana);
	    			//ManaPotMeta.setCustomModelData();
	    			
	    		//Space Filler
	    		ItemStack Air = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
	    			ItemMeta AirMeta = Air.getItemMeta();
	    			AirMeta.setDisplayName(" ");
	    			Air.setItemMeta(AirMeta);
	    		
	    		//Stage 1 Spells Start Here
				ItemStack Ignis = new ItemStack(Material.BLAZE_POWDER);
					ItemMeta IgnisMeta = Ignis.getItemMeta();
					IgnisMeta.setDisplayName(ChatColor.DARK_RED.toString() + ChatColor.BOLD + "Ignis");
					ArrayList<String> IgnisLore = new ArrayList<String>();
					IgnisLore.add(ChatColor.DARK_RED + "Left Click to Open the Ignis Menu");
					IgnisMeta.setLore(IgnisLore);
					Ignis.setItemMeta(IgnisMeta);
					
				ItemStack Aqua = new ItemStack(Material.WATER_BUCKET);
					ItemMeta AquaMeta = Aqua.getItemMeta();
					AquaMeta.setDisplayName(ChatColor.AQUA.toString() + ChatColor.BOLD + "Aqua");
					ArrayList<String> AquaLore = new ArrayList<String>();
					AquaLore.add(ChatColor.AQUA + "Left Click to Open the Aqua Menu");
					AquaMeta.setLore(AquaLore);
					Aqua.setItemMeta(AquaMeta);
					
				ItemStack Aer = new ItemStack(Material.FEATHER);
					ItemMeta AerMeta = Aer.getItemMeta();
					AerMeta.setDisplayName(ChatColor.GRAY.toString() + ChatColor.BOLD + "Aer");
					ArrayList<String> AerLore = new ArrayList<String>();
					AerLore.add(ChatColor.GRAY + "Left Click to Open the Aer Menu");
					AerMeta.setLore(AerLore);
					Aer.setItemMeta(AerMeta);
					
				ItemStack Flora = new ItemStack(Material.POPPY);
					ItemMeta FloraMeta = Flora.getItemMeta();
					FloraMeta.setDisplayName(ChatColor.DARK_GREEN.toString() + ChatColor.BOLD + "Flora");
					ArrayList<String> FloraLore = new ArrayList<String>();
					FloraLore.add(ChatColor.DARK_GREEN + "Left Click to Open the Flora Menu");
					FloraMeta.setLore(FloraLore);
					Flora.setItemMeta(FloraMeta);
					
				//Stage 2 Spells Start Here
				ItemStack Terra = new ItemStack(Material.DIRT);
					ItemMeta TerraMeta = Terra.getItemMeta();
					TerraMeta.setDisplayName(ChatColor.DARK_GRAY.toString() + ChatColor.BOLD + "Terra");
					ArrayList<String> TerraLore = new ArrayList<String>();
					TerraLore.add(ChatColor.DARK_GRAY + "Left Click to Open the Terra Menu");
					TerraMeta.setLore(TerraLore);
					Terra.setItemMeta(TerraMeta);
					
				ItemStack Fulgur = new ItemStack(Material.FIREWORK_STAR);
					ItemMeta FulgurMeta = Fulgur.getItemMeta();
					FulgurMeta.setDisplayName(ChatColor.YELLOW.toString() + ChatColor.BOLD + "Fulgur");
					ArrayList<String> FulgurLore = new ArrayList<String>();
					FulgurLore.add(ChatColor.YELLOW + "Left Click to Open the Fulgur Menu");
					FulgurMeta.setLore(FulgurLore);
					Fulgur.setItemMeta(FulgurMeta);
					
				ItemStack Sonus = new ItemStack(Material.NOTE_BLOCK);
					ItemMeta SonusMeta = Sonus.getItemMeta();
					SonusMeta.setDisplayName(ChatColor.GREEN.toString() + ChatColor.BOLD + "Sonus");
					ArrayList<String> SonusLore = new ArrayList<String>();
					SonusLore.add(ChatColor.GREEN + "Left Click to Open the Sonus Menu");
					SonusMeta.setLore(SonusLore);
					Sonus.setItemMeta(SonusMeta);
	    		
				ItemStack Metallum = new ItemStack(Material.IRON_INGOT);
					ItemMeta MetallumMeta = Metallum.getItemMeta();
					MetallumMeta.setDisplayName(ChatColor.GRAY.toString() + ChatColor.BOLD + "Metallum");
					ArrayList<String> MetallumLore = new ArrayList<String>();
					MetallumLore.add(ChatColor.GRAY + "Left Click to Open the Metallum Menu");
					MetallumMeta.setLore(MetallumLore);
					Metallum.setItemMeta(MetallumMeta);
					
				ItemStack Lux = new ItemStack(Material.GLOWSTONE);
					ItemMeta LuxMeta = Lux.getItemMeta();
					LuxMeta.setDisplayName(ChatColor.YELLOW.toString() + ChatColor.BOLD + "Lux");
					ArrayList<String> LuxLore = new ArrayList<String>();
					LuxLore.add(ChatColor.YELLOW + "Left Click to Open the Lux Menu");
					LuxMeta.setLore(LuxLore);
					Lux.setItemMeta(LuxMeta);
					
				ItemStack Venenum = new ItemStack(Material.FERMENTED_SPIDER_EYE);
					ItemMeta VenenumMeta = Venenum.getItemMeta();
					VenenumMeta.setDisplayName(ChatColor.DARK_PURPLE.toString() + ChatColor.BOLD + "Venenum");
					ArrayList<String> VenenumLore = new ArrayList<String>();
					VenenumLore.add(ChatColor.DARK_PURPLE + "Left Click to Open the Venenum Menu");
					VenenumMeta.setLore(VenenumLore);
					Venenum.setItemMeta(VenenumMeta);
					
				//Stage 3 Spells Start Here
				ItemStack Tempus = new ItemStack(Material.CLOCK);
					ItemMeta TempusMeta = Tempus.getItemMeta();
					TempusMeta.setDisplayName(ChatColor.GOLD.toString() + ChatColor.BOLD + "Tempus");
					ArrayList<String> TempusLore = new ArrayList<String>();
					TempusLore.add(ChatColor.GOLD + "Left Click to Open the Tempus Menu");
					TempusMeta.setLore(TempusLore);
					Tempus.setItemMeta(TempusMeta);
					
				ItemStack MonsIgneus = new ItemStack(Material.MAGMA_CREAM);
					ItemMeta MonsIgneusMeta = MonsIgneus.getItemMeta();
					MonsIgneusMeta.setDisplayName(ChatColor.DARK_RED.toString() + ChatColor.BOLD + "Mons Igneus");
					ArrayList<String> MonsIgneusLore = new ArrayList<String>();
					MonsIgneusLore.add(ChatColor.DARK_RED + "Left Click to Open the Mons Igenus Menu");
					MonsIgneusMeta.setLore(MonsIgneusLore);
					MonsIgneus.setItemMeta(MonsIgneusMeta);
					
				ItemStack IanuaeMagicae = new ItemStack(Material.ENDER_PEARL);
					ItemMeta IanuaeMagicaeMeta = IanuaeMagicae.getItemMeta();
					IanuaeMagicaeMeta.setDisplayName(ChatColor.LIGHT_PURPLE.toString() + ChatColor.BOLD + "Ianuae Magicae");
					ArrayList<String> IanuaeMagicaeLore = new ArrayList<String>();
					IanuaeMagicaeLore.add(ChatColor.LIGHT_PURPLE + "Left Click to Open the Ianuae Magicae Menu");
					IanuaeMagicaeMeta.setLore(IanuaeMagicaeLore);
					IanuaeMagicae.setItemMeta(IanuaeMagicaeMeta);
					
				ItemStack Sana = new ItemStack(Material.GOLDEN_APPLE);
					ItemMeta SanaMeta = Sana.getItemMeta();
					SanaMeta.setDisplayName(ChatColor.RED.toString() + ChatColor.BOLD + "Sana");
					ArrayList<String> SanaLore = new ArrayList<String>();
					SanaLore.add(ChatColor.RED + "Left Click to Open the Sana Menu");
					SanaMeta.setLore(SanaLore);
					Sana.setItemMeta(SanaMeta);
					
					
					
	    		spellbookGUI.setItem(0, new ItemStack(Air));
	    		spellbookGUI.setItem(1, new ItemStack(Air));
	    		spellbookGUI.setItem(2, new ItemStack(Air));
	    		spellbookGUI.setItem(3, new ItemStack(Air));
	    		spellbookGUI.setItem(4, new ItemStack(Air));
	    		spellbookGUI.setItem(5, new ItemStack(Air));
	    		spellbookGUI.setItem(6, new ItemStack(Air));
	    		spellbookGUI.setItem(7, new ItemStack(Air));
	    		spellbookGUI.setItem(8, new ItemStack(Air));
	    		
	    		spellbookGUI.setItem(9, new ItemStack(Air));
	    		spellbookGUI.setItem(10, new ItemStack(Ignis));
	    		spellbookGUI.setItem(11, new ItemStack(Air));
	    		spellbookGUI.setItem(12, new ItemStack(Aqua));
	    		spellbookGUI.setItem(13, new ItemStack(Air));
	    		spellbookGUI.setItem(14, new ItemStack(Aer));
	    		spellbookGUI.setItem(15, new ItemStack(Air));
	    		spellbookGUI.setItem(16, new ItemStack(Flora));
	    		spellbookGUI.setItem(17, new ItemStack(Air));
	    		
	    		spellbookGUI.setItem(18, new ItemStack(Air));
	    		spellbookGUI.setItem(19, new ItemStack(Terra));
	    		spellbookGUI.setItem(20, new ItemStack(Fulgur));
	    		spellbookGUI.setItem(21, new ItemStack(Sonus));
	    		spellbookGUI.setItem(22, new ItemStack(ManaPot));
	    		spellbookGUI.setItem(23, new ItemStack(Metallum));
	    		spellbookGUI.setItem(24, new ItemStack(Lux));
	    		spellbookGUI.setItem(25, new ItemStack(Venenum));
	    		spellbookGUI.setItem(26, new ItemStack(Air));
	    		
	    		spellbookGUI.setItem(27, new ItemStack(Air));
	    		spellbookGUI.setItem(28, new ItemStack(Tempus));
	    		spellbookGUI.setItem(29, new ItemStack(Air));
	    		spellbookGUI.setItem(30, new ItemStack(MonsIgneus));
	    		spellbookGUI.setItem(31, new ItemStack(Air));
	    		spellbookGUI.setItem(32, new ItemStack(IanuaeMagicae));
	    		spellbookGUI.setItem(33, new ItemStack(Air));
	    		spellbookGUI.setItem(34, new ItemStack(Sana));
	    		spellbookGUI.setItem(35, new ItemStack(Air));
	    		
	    		spellbookGUI.setItem(36, new ItemStack(Air));
	    		spellbookGUI.setItem(37, new ItemStack(Air));
	    		spellbookGUI.setItem(38, new ItemStack(Air));
	    		spellbookGUI.setItem(39, new ItemStack(Air));
	    		spellbookGUI.setItem(40, new ItemStack(Air));
	    		spellbookGUI.setItem(41, new ItemStack(Air));
	    		spellbookGUI.setItem(42, new ItemStack(Air));
	    		spellbookGUI.setItem(43, new ItemStack(Air));
	    		spellbookGUI.setItem(44, new ItemStack(Air));
	    		
	    		player.openInventory(spellbookGUI);
	    		return true;
	    	}
	    	
	    
	    if(cmd.getName().equalsIgnoreCase("ignisgui")) {
	    	Player player = (Player) sender;
	    	Inventory ignisGUI = Bukkit.createInventory(player, 27, ChatColor.GOLD + "✦ " + ChatColor.DARK_RED.toString() + ChatColor.BOLD + "Ignis Spells" + ChatColor.GOLD + " ✦");
	    		
    		//Space Filler
    		ItemStack Air = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
    			ItemMeta AirMeta = Air.getItemMeta();
    			AirMeta.setDisplayName(" ");
    			Air.setItemMeta(AirMeta);
    			
    		ItemStack Ignis1 = new ItemStack(Material.BLAZE_POWDER);
				ItemMeta Ignis1Meta = Ignis1.getItemMeta();
				Ignis1Meta.setDisplayName(ChatColor.DARK_RED.toString() + ChatColor.BOLD + "Fireball");
				ArrayList<String> Ignis1Lore = new ArrayList<String>();
				Ignis1Lore.add(ChatColor.DARK_RED + "Left Click to Select the Fireball Spell");
				Ignis1Lore.add(ChatColor.DARK_RED + "Items to Unlock: ");
				Ignis1Lore.add(ChatColor.GOLD + "");
				Ignis1Meta.setLore(Ignis1Lore);
				Ignis1.setItemMeta(Ignis1Meta);
				
	    	ItemStack Ignis2 = new ItemStack(Material.FIRE_CHARGE);
				ItemMeta Ignis2Meta = Ignis2.getItemMeta();
				Ignis2Meta.setDisplayName(ChatColor.DARK_RED.toString() + ChatColor.BOLD + "Blazing Blast");
				ArrayList<String> Ignis2Lore = new ArrayList<String>();
				Ignis2Lore.add(ChatColor.DARK_RED + "Left Click to Select the Blazing Blast Spell");
				Ignis2Lore.add(ChatColor.DARK_RED + "Items to Unlock: ");
				Ignis2Lore.add(ChatColor.GOLD + "");
				Ignis2Meta.setLore(Ignis2Lore);
				Ignis2.setItemMeta(Ignis2Meta);
		    	
			ItemStack Ignis3 = new ItemStack(Material.BLAZE_POWDER);
				ItemMeta Ignis3Meta = Ignis3.getItemMeta();
				Ignis3Meta.setDisplayName(ChatColor.DARK_RED.toString() + ChatColor.BOLD + "Flamethrower");
				ArrayList<String> Ignis3Lore = new ArrayList<String>();
				Ignis3Lore.add(ChatColor.DARK_RED + "Left Click to Select the Flamethrower Spell");
				Ignis3Lore.add(ChatColor.DARK_RED + "Items to Unlock: ");
				Ignis3Lore.add(ChatColor.GOLD + "");
				Ignis3Meta.setLore(Ignis3Lore);
				Ignis3.setItemMeta(Ignis3Meta);
				
			ItemStack Ignis4 = new ItemStack(Material.FIRE_CHARGE);
				ItemMeta Ignis4Meta = Ignis4.getItemMeta();
				Ignis4Meta.setDisplayName(ChatColor.DARK_RED.toString() + ChatColor.BOLD + "Fire Wall");
				ArrayList<String> Ignis4Lore = new ArrayList<String>();
				Ignis4Lore.add(ChatColor.DARK_RED + "Left Click to Select the Fire Wall Spell");
				Ignis4Lore.add(ChatColor.DARK_RED + "Items to Unlock: ");
				Ignis4Lore.add(ChatColor.GOLD + "");
				Ignis4Meta.setLore(Ignis4Lore);
				Ignis4.setItemMeta(Ignis4Meta);
				
			ItemStack Ignis5 = new ItemStack(Material.BLAZE_POWDER);
				ItemMeta Ignis5Meta = Ignis5.getItemMeta();
				Ignis5Meta.setDisplayName(ChatColor.DARK_RED.toString() + ChatColor.BOLD + "Infernal Meltdown");
				ArrayList<String> Ignis5Lore = new ArrayList<String>();
				Ignis5Lore.add(ChatColor.DARK_RED + "Left Click to Select the Infernal Meltdown Spell");
				Ignis5Lore.add(ChatColor.DARK_RED + "Items to Unlock: ");
				Ignis5Lore.add(ChatColor.GOLD + "");
				Ignis5Meta.setLore(Ignis5Lore);
				Ignis5.setItemMeta(Ignis5Meta);
	    	
	    	ignisGUI.setItem(0, new ItemStack(Air));
	    	ignisGUI.setItem(1, new ItemStack(Air));
	    	ignisGUI.setItem(2, new ItemStack(Air));
	    	ignisGUI.setItem(3, new ItemStack(Air));
	    	ignisGUI.setItem(4, new ItemStack(Air));
	    	ignisGUI.setItem(5, new ItemStack(Air));
	    	ignisGUI.setItem(6, new ItemStack(Air));
	    	ignisGUI.setItem(7, new ItemStack(Air));
	    	ignisGUI.setItem(8, new ItemStack(Air));
	    	
	    	ignisGUI.setItem(9, new ItemStack(Air));
	    	ignisGUI.setItem(10, new ItemStack(Air));
	    	ignisGUI.setItem(11, new ItemStack(Ignis1));
	    	ignisGUI.setItem(12, new ItemStack(Ignis2));
	    	ignisGUI.setItem(13, new ItemStack(Ignis3));
	    	ignisGUI.setItem(14, new ItemStack(Ignis4));
	    	ignisGUI.setItem(15, new ItemStack(Ignis5));
	    	ignisGUI.setItem(16, new ItemStack(Air));
	    	ignisGUI.setItem(17, new ItemStack(Air));
	    	
	    	ignisGUI.setItem(18, new ItemStack(Air));
	    	ignisGUI.setItem(19, new ItemStack(Air));
	    	ignisGUI.setItem(20, new ItemStack(Air));
	    	ignisGUI.setItem(21, new ItemStack(Air));
	    	ignisGUI.setItem(22, new ItemStack(Air));
	    	ignisGUI.setItem(23, new ItemStack(Air));
	    	ignisGUI.setItem(24, new ItemStack(Air));
	    	ignisGUI.setItem(25, new ItemStack(Air));
	    	ignisGUI.setItem(26, new ItemStack(Air));
	    		
    		player.openInventory(ignisGUI);
    		return true;
	   	}
	    	
	            // If this hasn't happened the value of false will be returned.
	    	return false; 
	    }


	    
	    
}
