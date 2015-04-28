

import mc.alk.arena.BattleArena;
import mc.alk.arena.objects.events.ArenaEventHandler;
import mc.alk.arena.objects.modules.ArenaModule;

import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType.SlotType;

/**
 * 
 * @author Nikolai
 */
public class EuroArmorLock extends ArenaModule {
    
    String name = "euro.ArmorLock";
    String version = "1.0";
    String author = "Europia79";
    
    @ArenaEventHandler
    public void onInventoryClick(InventoryClickEvent e) {
        
        if (e.getSlotType() == SlotType.ARMOR) {
            e.setCancelled(true);
        }
        
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getVersion() {
        return this.version;
    }

}
