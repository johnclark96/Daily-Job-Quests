package me.delphidevelopment.minecraft.dailyjobquests.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.event.inventory.InventoryPickupItemEvent;

import static me.delphidevelopment.minecraft.dailyjobquests.quests.Quest.QuestType;
import static me.delphidevelopment.minecraft.dailyjobquests.quests.Quest.QuestType.GATHER;
import static me.delphidevelopment.minecraft.dailyjobquests.quests.Quest.QuestType.KILL;
import static me.delphidevelopment.minecraft.dailyjobquests.quests.Quest.QuestType.WALK;

public class QuestGenerateEvent implements Listener {

    public enum gatheringItems {

    }

    public enum killingMobs {

    }

    @EventHandler
    public void onPickup(EntityPickupItemEvent event){
        event.getItem();
        event.getItem().getItemStack();


    }
    
    @EventHandler
    public void onPickupAgain(InventoryPickupItemEvent event) {
    }

    @EventHandler
    public void gatheringQuest(EntityPickupItemEvent event) {
    }

    public abstract class Quest {
        private QuestType type;

        public Quest(QuestType type) {
            this.type = type;
        }
    }

    public class GatherQuest extends Quest {

        public GatherQuest() {
            super(GATHER);
        }
    }

    public class KillQuest extends Quest{

        public KillQuest(){
            super(KILL);
        }
    }

    public class WalkQuest extends Quest{

        public WalkQuest(){
            super(WALK);
        }
    }
}
