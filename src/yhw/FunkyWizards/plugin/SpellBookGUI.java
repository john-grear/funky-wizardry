package yhw.FunkyWizards.plugin;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class SpellBookGUI {

	public static Inventory spellbookGUI = Bukkit.createInventory(null, 27, "Main Spell Branch");
	
	public static boolean openGUI(Player player) {
		 
		spellbookGUI.setItem(0, new ItemStack(Material.AIR, 1));
		spellbookGUI.setItem(1, new ItemStack(Material.AIR, 1));
		spellbookGUI.setItem(2, new ItemStack(Material.AIR, 1));
		spellbookGUI.setItem(3, new ItemStack(Material.AIR, 1));
		spellbookGUI.setItem(4, new ItemStack(Material.AIR, 1));
		spellbookGUI.setItem(5, new ItemStack(Material.AIR, 1));
		spellbookGUI.setItem(6, new ItemStack(Material.AIR, 1));
		spellbookGUI.setItem(7, new ItemStack(Material.AIR, 1));
		spellbookGUI.setItem(8, new ItemStack(Material.AIR, 1));
		
		spellbookGUI.setItem(9, new ItemStack(Material.AIR, 1));
		spellbookGUI.setItem(10, new ItemStack(Material.AIR, 1));
		spellbookGUI.setItem(11, new ItemStack(Material.AIR, 1));
		spellbookGUI.setItem(12, new ItemStack(Material.AIR, 1));
		spellbookGUI.setItem(13, new ItemStack(Material.AIR, 1));
		spellbookGUI.setItem(14, new ItemStack(Material.AIR, 1));
		spellbookGUI.setItem(15, new ItemStack(Material.AIR, 1));
		spellbookGUI.setItem(16, new ItemStack(Material.AIR, 1));
		spellbookGUI.setItem(17, new ItemStack(Material.AIR, 1));
		
		spellbookGUI.setItem(18, new ItemStack(Material.AIR, 1));
		spellbookGUI.setItem(19, new ItemStack(Material.AIR, 1));
		spellbookGUI.setItem(20, new ItemStack(Material.AIR, 1));
		spellbookGUI.setItem(21, new ItemStack(Material.AIR, 1));
		spellbookGUI.setItem(22, new ItemStack(Material.AIR, 1));
		spellbookGUI.setItem(23, new ItemStack(Material.AIR, 1));
		spellbookGUI.setItem(24, new ItemStack(Material.AIR, 1));
		spellbookGUI.setItem(25, new ItemStack(Material.AIR, 1));
		spellbookGUI.setItem(26, new ItemStack(Material.AIR, 1));
		
		
		
		player.openInventory(spellbookGUI);
		
		return true;
		
	}
	
}
