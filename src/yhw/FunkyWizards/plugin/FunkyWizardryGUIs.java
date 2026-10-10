package yhw.FunkyWizards.plugin;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.entity.WanderingTrader;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;

public class FunkyWizardryGUIs implements Listener {
	
	//Registering the events with the plugin
	public Plugin plugin;
	 
	public FunkyWizardryGUIs(Plugin plugin){
	        this.plugin = plugin;
	    }
	
	public FunkyWizardryGUIs(Main plugin) {
		
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
				
		}
	
	//Spellboard
	public static Scoreboard Spellboard() {
		//ScoreboardManager m = Bukkit.getScoreboardManager();
	  	return Bukkit.getScoreboardManager().getNewScoreboard();
		
	}
	
	/*public static Objective CreateObjective() {
		
		return Spellboard().registerNewObjective("test", "", ChatColor.AQUA + "Funky" + ChatColor.LIGHT_PURPLE + "Wizardry");
	}*/
	
	
	int spellNum = 0;		
		
		//Player Clicks inside the Main Branch GUI
		@EventHandler
		public void onClick(InventoryClickEvent event) {
			
			InventoryHolder invholder = event.getInventory().getHolder();
			int size = event.getInventory().getSize();
			Player player = (Player) event.getWhoClicked();
			ClickType type = event.getClick();
			
			if(invholder.equals(player)) {
				if(size == 45) {
					event.setCancelled(true);
					
					if(type.isLeftClick()) {
						
						//Stage 1 Spells Start
							//Ignis
							if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED.toString() + ChatColor.BOLD + "Ignis")) {
								player.performCommand("ignisGUI");
							}
							
							//Aer
							if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GRAY.toString() + ChatColor.BOLD + "Aer")) {
								player.sendMessage(ChatColor.AQUA + "This is something");
							}
							
							//Aqua
							if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.AQUA.toString() + ChatColor.BOLD + "Aqua")) {
								player.sendMessage(ChatColor.AQUA + "This is something");
							}
							
							//Flora
							if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.DARK_GREEN.toString() + ChatColor.BOLD + "Flora")) {
								//player.performCommand("fw");
								player.closeInventory();
							}
						
						//Stage 2 Spells Start
							//Terra
							if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.DARK_GRAY.toString() + ChatColor.BOLD + "Terra")) {
								//player.performCommand("fw");
								player.sendMessage(ChatColor.AQUA + "This is something");
							}
							
							//Fulgur
							if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.YELLOW.toString() + ChatColor.BOLD + "Fulgur")) {
								//player.performCommand("fw");
								player.sendMessage(ChatColor.AQUA + "This is something");
							}
							
							//Sonus
							if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GREEN.toString() + ChatColor.BOLD + "Sonus")) {
								//player.performCommand("fw");
								player.sendMessage(ChatColor.AQUA + "This is something");
							}
							
							//Mana
							if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.AQUA.toString() + ChatColor.BOLD + "Mana Potion")) {
								//player.performCommand("fw");
								player.sendMessage(ChatColor.AQUA + "This is something");
							}
							
							//Metallum
							if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GRAY.toString() + ChatColor.BOLD + "Metallum")) {
								//player.performCommand("fw");
								player.sendMessage(ChatColor.AQUA + "This is something");
							}
							
							//Lux
							if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.YELLOW.toString() + ChatColor.BOLD + "Lux")) {
								//player.performCommand("fw");
								player.sendMessage(ChatColor.AQUA + "This is something");
							}
							
							//Venenum
							if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE.toString() + ChatColor.BOLD + "Venenum")) {
								//player.performCommand("fw");
								player.sendMessage(ChatColor.AQUA + "This is something");
							}
							
						//Stage 3 Spells Start
							//Tempus
							if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GOLD.toString() + ChatColor.BOLD + "Tempus")) {
								//player.performCommand("fw");
								player.sendMessage(ChatColor.AQUA + "This is something");
							}
							
							//Mons Igneus
							if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED.toString() + ChatColor.BOLD + "Mons Igneus")) {
								//player.performCommand("fw");
								player.sendMessage(ChatColor.AQUA + "This is something");
							}
							
							//Ianuae Magicae
							if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE.toString() + ChatColor.BOLD + "Ianuae Magicae")) {
								//player.performCommand("fw");
								player.sendMessage(ChatColor.AQUA + "This is something");
							}
							
							//Sana
							if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.RED.toString() + ChatColor.BOLD + "Sana")) {
								//player.performCommand("fw");
								player.sendMessage(ChatColor.AQUA + "This is something");
							}
							
					}
				}
			}		
		}
		
		
		@EventHandler
		public void onIgnisClick(InventoryClickEvent event)  {
			
			InventoryHolder invholder = event.getInventory().getHolder();
			int size = event.getInventory().getSize();
			Player player = (Player) event.getWhoClicked();
			ClickType type = event.getClick();
			
			//Spellboard();
			
			if(invholder.equals(player)) {
				if(size == 27) {
					event.setCancelled(true);
					if(type.isLeftClick()) {
						
						//Ignis1
						if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED.toString() + ChatColor.BOLD + "Fireball")) {
							player.performCommand("fw");
							//player.setMetadata(player.getName(), new FixedMetadataValue(plugin, "Fireball"));
							player.sendMessage(ChatColor.AQUA + "It works!");
						}
						
						//Ignis2
						if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED.toString() + ChatColor.BOLD + "Blazing Blast")) {
							player.performCommand("fw");
							//player.setMetadata(player.getName(), new FixedMetadataValue(plugin, "Blazing Blast"));
							player.sendMessage(ChatColor.AQUA + "It works!");
						}
						
						//Ignis3
						if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED.toString() + ChatColor.BOLD + "Flamethrower")) {
							player.performCommand("fw");
							spellNum = 3;
							player.sendMessage(ChatColor.AQUA + "It works!");
						}
						
						//Ignis4
						if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED.toString() + ChatColor.BOLD + "Fire Wall")) {
							player.performCommand("fw");
							spellNum = 4;
							player.sendMessage(ChatColor.AQUA + "It works!");
						}
						
						//Ignis5
						if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED.toString() + ChatColor.BOLD + "Infernal Meltdown")) {
							player.performCommand("fw");
							spellNum = 5;
							player.sendMessage(ChatColor.AQUA + "It works!");
						}
						
					}
				}
			}
		}
		
		
		
		
		//Making the spellbook
	    @EventHandler
	    public void onClick(PlayerInteractEntityEvent event) {
	    	
	        if(event.getRightClicked() instanceof WanderingTrader)
	        {
	            Player player = event.getPlayer(); 
	        		ItemStack item = player.getInventory().getItemInMainHand();
	        		if(item.getType().equals(Material.BOOK)) {
	        			player.sendMessage(ChatColor.GOLD + "Here, take this!! Remember, don't use it outside of Hogwarts");
	        			ItemStack spellBook = new ItemStack(Material.ENCHANTED_BOOK);
	        			ItemMeta spellBookMeta = spellBook.getItemMeta();
	        			spellBookMeta.setDisplayName(ChatColor.DARK_RED + "Spell Book");
	        			
	        			ArrayList<String> lore = new ArrayList<String>();
	        			lore.add(ChatColor.GREEN + "Right-Click to Start Your Wizardry Adventure!");
	        			lore.add(ChatColor.AQUA + "Mastering spells requires patience, remember that");
	        			spellBookMeta.setLore(lore);
	        			
	        			spellBookMeta.addEnchant(Enchantment.BINDING_CURSE, 1, true);
	        			//AttributeModifier modifier = new AttributeModifier("Name", 2, AttributeModifier.Operation.ADD_NUMBER);
	        			//spellBookMeta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, modifier);
	        			//spellBookMeta.setUnbreakable(true);
	        			spellBookMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	        			spellBookMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
	        			
	        			spellBook.setItemMeta(spellBookMeta);
	        			
	        			player.getInventory().setItemInMainHand(new ItemStack(spellBook));
	        		}
	        }
	    }
	    
	    //Spellbook OpenGUI
	    @EventHandler
	    public void onRightClick(PlayerInteractEvent e) {
	    	 Player player = e.getPlayer();
	    	 if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK){
	    		 ItemStack SpellBook = (player.getInventory().getItemInMainHand());
	    		 if(SpellBook.getType().equals(Material.ENCHANTED_BOOK)){
	    			 if(SpellBook.containsEnchantment(Enchantment.BINDING_CURSE)){
	    			 	player.performCommand("fw"); 
	    			 }
	    		 }
	    	 }
	    } 
	    
	    
	    //Infirocket
	    @EventHandler
	    public void onRocket(PlayerInteractEvent event) {
	    	Player p = event.getPlayer();
	    	ItemStack maybeARocket = p.getInventory().getItemInMainHand();
	    	if(event.getAction() == Action.RIGHT_CLICK_AIR) {
	    		if(maybeARocket.getType().equals(Material.FIREWORK_ROCKET)) {
	    			if(!maybeARocket.hasItemMeta()) {
	    				ItemStack Rocket = new ItemStack(Material.FIREWORK_ROCKET, 2);
	    				p.getInventory().setItemInMainHand(Rocket);
	    			}
	    		}
	    	}
	    }
	    
	    
	    //Eggs
	    /*@EventHandler
	    public void onThrow(PlayerEggThrowEvent event) {
	    	int SpellNum = 3;
		    Player player = event.getPlayer();
		    if(SpellNum == 3) {
		    	player.sendMessage("Simple");
		    	SpellNum = 4;
		    	if(SpellNum == 4) {
		    		player.sendMessage("Nuggets");
		    	}
		    }
	    }*/
	    
	    
	    
	    
	    /*@EventHandler
	    public void onInventoryClick(InventoryClickEvent event) {
	    	
	    	String title = event.getView().getTitle();
	    	Player player = (Player) event.getWhoClicked();
	    	Inventory inventory = event.getInventory();
	    	
	    	if(title.equals(SpellBookGUI."Main Spell Branch") && event.getSlotType() != SlotType.OUTSIDE) {
	    		event.setCancelled(true);
	    		if(event.getCurrentItem() == null) {
	    			return;
	    		}
	    		if(title.equals(SpellBookGUI."Main Spell Branch") {
	    			SpellBookGUI.clicked((Player) event.getWhoClicked(), event.getSlot(), event.getCurrentItem(), event.getInventory());
	    		}
	    		ItemStack clicked = event.getCurrentItem();
	    		Material clickedType = clicked.getType();
	    		
	    			
	    		
	    	}
	    	
	    	event.setCancelled(true);
	    	player.closeInventory();
	    	
	    	
	    }*/
	    	    //if(((e.getAction() == Action.RIGHT_CLICK_AIR) &&
	    	      //(player.getInventory().getItemInMainHand().getType().equals(Material.ENCHANTED_BOOK)))) {
	    	  //openGUI(player);
	    	    //}
	    
	    
	    /*@EventHandler
	    public void Interact(PlayerInteractEvent e) {
	    	if((e.getAction() == Action.LEFT_CLICK_BLOCK)) {
	    		e.setCancelled(true);
	    		Player player = e.getPlayer();
	    			player.sendMessage(ChatColor.BLUE + "Watch out!!");
		    		player.playSound(player.getLocation(), Sound.ENTITY_CREEPER_PRIMED, 2F, 1F);
		    		player.playSound(player.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 2F, 1F);
	    		}

	    	}
	    		@EventHandler
	    		public void onGhs(PlayerItemHeldEvent event) {
	        		player.sendMessage(ChatColor.GOLD + "Ooh, that tickles!");
	    		}
	    }*/

	    //Looking for the spell type
	    @EventHandler
	    public void onInvClose(InventoryCloseEvent event) {
	    	
	    	Player player = (Player) event.getPlayer();
	    	//SpellboardManager();
	    	Spellboard();
	    	//CreateObjective();
	    	
	    	
	    	//Objective o = Spellboard().getObjective("test");
	    	Objective o = Spellboard().registerNewObjective("test", "hi", ChatColor.AQUA + "Funky" + ChatColor.LIGHT_PURPLE + "Wizardry");
	    	o.setDisplaySlot(DisplaySlot.SIDEBAR);
	    	//Spellboard().registerNewTeam("spell");
	    	//Spellboard().getTeam("spell").addEntry(player.getName());
	    	//Spellboard().getTeam("spell").removeEntry(player.getName());
	    	//Spellboard().getTeam("spell").addEntry(player.getName());

	    	
	    	/*ScoreboardManager m = Bukkit.getScoreboardManager();
			Scoreboard b = m.getNewScoreboard();
			Objective o = b.registerNewObjective("test", "", ChatColor.AQUA + "Funky" + ChatColor.LIGHT_PURPLE + "Wizardry");
			o.setDisplaySlot(DisplaySlot.SIDEBAR);
			b.registerNewTeam("spell");
			b.getTeam("spell").addEntry(player.getName());*/
	    	
	    	
			
			
			
			
	    		//b.getTeam("spell").addPlayer(player);
	    		
	    		
	    	//String string = "spellNum";
	    	/*spellType = new int 0;
	    	MetadataValue spell = spellType;
	    	List<MetadataValue> SNum = getMetadata(player);
	    			player.setMetadata("no spell", 0);*/
	    			//player.setMetadata(player.getName(), new MetadataValue(plugin, "spellNum"));
	    	
	    	
	    		if(Spellboard().getTeam("spell").hasEntry(player.getName())) {
	    			player.sendMessage("hi");
	    			Score s = o.getScore(ChatColor.GOLD + "spellNum");
	    			s.setScore(1);
	    		}
	    		
	    		/*if(Spellboard().getTeam("fireball").hasEntry(player.getName())) {
	    			player.sendMessage("I wonder");
	    			Score s = CreateObjective().getScore(ChatColor.DARK_RED + "Fireball");
	    	    	s.setScore(1);
	    			//String string = "metadata";
	    			
	    			//event.getPlayer().setMetadata(string, arg1);
	    			
	    			
	    		}*/
	    	
			/*if(Spellboard().getTeam("spell").hasEntry(player.getName())) {
    				Score s = CreateObjective().getScore(ChatColor.DARK_RED + "Blazing Blast");
    	    		s.setScore(1);
    			}
    			
	    	
	    		if(spellNum == 2) {
	    			Score s = CreateObjective().getScore(ChatColor.DARK_RED + "Blazing Blast");
	    	    	s.setScore(1);
	    		}
	    		
	    		if(spellNum == 3) {
	    			Score s = CreateObjective().getScore(ChatColor.DARK_RED + "Flamethrower");
	    	    	s.setScore(1);
	    		}
	    		
	    		if(spellNum == 4) {
	    			Score s = CreateObjective().getScore(ChatColor.DARK_RED + "Fire Wall");
	    	    	s.setScore(1);
	    		}
	    		
	    		if(spellNum == 5) {
	    			Score s = CreateObjective().getScore(ChatColor.DARK_RED + "Infernal Meltdown");
	    	    	s.setScore(1);
	    		}*/
	    	
	    		
	    	player.setScoreboard(Spellboard());
	    	
	    }
	    
	    
}


