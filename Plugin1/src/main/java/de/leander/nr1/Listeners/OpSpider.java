package de.leander.nr1.Listeners;
import com.destroystokyo.paper.block.TargetBlockInfo;
import com.destroystokyo.paper.entity.Pathfinder;
import com.destroystokyo.paper.entity.TargetEntityInfo;
import org.bukkit.*;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.PistonMoveReaction;
import org.bukkit.entity.*;
import org.bukkit.entity.memory.MemoryKey;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.loot.LootTable;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.BoundingBox;
import org.bukkit.util.RayTraceResult;
import org.bukkit.util.Vector;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class OpSpider implements Listener {
    @EventHandler
    public void OpSüider(CreatureSpawnEvent event) {
            if (event.getEntityType() == EntityType.SPIDER) {
                Skeleton skeleton = (Skeleton) new Skeleton() {
                    @Override
                    public <T extends Projectile> T launchProjectile(Class<? extends T> projectile) {
                        return null;
                    }

                    @Override
                    public <T extends Projectile> T launchProjectile(Class<? extends T> projectile, Vector velocity) {
                        return null;
                    }

                    @Override
                    public PersistentDataContainer getPersistentDataContainer() {
                        return null;
                    }

                    @Override
                    public boolean isOp() {
                        return false;
                    }

                    @Override
                    public void setOp(boolean value) {

                    }

                    @Override
                    public boolean isPermissionSet(String name) {
                        return false;
                    }

                    @Override
                    public boolean isPermissionSet(Permission perm) {
                        return false;
                    }

                    @Override
                    public boolean hasPermission(String name) {
                        return false;
                    }

                    @Override
                    public boolean hasPermission(Permission perm) {
                        return false;
                    }

                    @Override
                    public PermissionAttachment addAttachment(Plugin plugin, String name, boolean value) {
                        return null;
                    }

                    @Override
                    public PermissionAttachment addAttachment(Plugin plugin) {
                        return null;
                    }

                    @Override
                    public PermissionAttachment addAttachment(Plugin plugin, String name, boolean value, int ticks) {
                        return null;
                    }

                    @Override
                    public PermissionAttachment addAttachment(Plugin plugin, int ticks) {
                        return null;
                    }

                    @Override
                    public void removeAttachment(PermissionAttachment attachment) {

                    }

                    @Override
                    public void recalculatePermissions() {

                    }

                    @Override
                    public Set<PermissionAttachmentInfo> getEffectivePermissions() {
                        return null;
                    }

                    @Override
                    public void setMetadata(String metadataKey, MetadataValue newMetadataValue) {

                    }

                    @Override
                    public List<MetadataValue> getMetadata(String metadataKey) {
                        return null;
                    }

                    @Override
                    public boolean hasMetadata(String metadataKey) {
                        return false;
                    }

                    @Override
                    public void removeMetadata(String metadataKey, Plugin owningPlugin) {

                    }

                    @Override
                    public void setLootTable(LootTable table) {

                    }

                    @Override
                    public LootTable getLootTable() {
                        return null;
                    }

                    @Override
                    public void setSeed(long seed) {

                    }

                    @Override
                    public long getSeed() {
                        return 0;
                    }

                    @Override
                    public String getCustomName() {
                        return null;
                    }

                    @Override
                    public void setCustomName(String name) {

                    }

                    @Override
                    public Location getLocation() {
                        return null;
                    }

                    @Override
                    public Location getLocation(Location loc) {
                        return null;
                    }

                    @Override
                    public void setVelocity(Vector velocity) {

                    }

                    @Override
                    public Vector getVelocity() {
                        return null;
                    }

                    @Override
                    public double getHeight() {
                        return 0;
                    }

                    @Override
                    public double getWidth() {
                        return 0;
                    }

                    @Override
                    public BoundingBox getBoundingBox() {
                        return null;
                    }

                    @Override
                    public boolean isOnGround() {
                        return false;
                    }

                    @Override
                    public boolean isInWater() {
                        return false;
                    }

                    @Override
                    public World getWorld() {
                        return null;
                    }

                    @Override
                    public void setRotation(float yaw, float pitch) {

                    }

                    @Override
                    public boolean teleport(Location location) {
                        return false;
                    }

                    @Override
                    public boolean teleport(Location location, PlayerTeleportEvent.TeleportCause cause) {
                        return false;
                    }

                    @Override
                    public boolean teleport(Entity destination) {
                        return false;
                    }

                    @Override
                    public boolean teleport(Entity destination, PlayerTeleportEvent.TeleportCause cause) {
                        return false;
                    }

                    @Override
                    public List<Entity> getNearbyEntities(double x, double y, double z) {
                        return null;
                    }

                    @Override
                    public int getEntityId() {
                        return 0;
                    }

                    @Override
                    public int getFireTicks() {
                        return 0;
                    }

                    @Override
                    public int getMaxFireTicks() {
                        return 0;
                    }

                    @Override
                    public void setFireTicks(int ticks) {

                    }

                    @Override
                    public void remove() {

                    }

                    @Override
                    public boolean isDead() {
                        return false;
                    }

                    @Override
                    public boolean isValid() {
                        return false;
                    }

                    @Override
                    public void sendMessage(String message) {

                    }

                    @Override
                    public void sendMessage(String[] messages) {

                    }

                    @Override
                    public void sendMessage(UUID sender, String message) {

                    }

                    @Override
                    public void sendMessage(UUID sender, String[] messages) {

                    }

                    @Override
                    public Server getServer() {
                        return null;
                    }

                    @Override
                    public String getName() {
                        return null;
                    }

                    @Override
                    public boolean isPersistent() {
                        return false;
                    }

                    @Override
                    public void setPersistent(boolean persistent) {

                    }

                    @Override
                    public Entity getPassenger() {
                        return null;
                    }

                    @Override
                    public boolean setPassenger(Entity passenger) {
                        return false;
                    }

                    @Override
                    public List<Entity> getPassengers() {
                        return null;
                    }

                    @Override
                    public boolean addPassenger(Entity passenger) {
                        return false;
                    }

                    @Override
                    public boolean removePassenger(Entity passenger) {
                        return false;
                    }

                    @Override
                    public boolean isEmpty() {
                        return false;
                    }

                    @Override
                    public boolean eject() {
                        return false;
                    }

                    @Override
                    public float getFallDistance() {
                        return 0;
                    }

                    @Override
                    public void setFallDistance(float distance) {

                    }

                    @Override
                    public void setLastDamageCause(EntityDamageEvent event) {

                    }

                    @Override
                    public EntityDamageEvent getLastDamageCause() {
                        return null;
                    }

                    @Override
                    public UUID getUniqueId() {
                        return null;
                    }

                    @Override
                    public int getTicksLived() {
                        return 0;
                    }

                    @Override
                    public void setTicksLived(int value) {

                    }

                    @Override
                    public void playEffect(EntityEffect type) {

                    }

                    @Override
                    public EntityType getType() {
                        return null;
                    }

                    @Override
                    public boolean isInsideVehicle() {
                        return false;
                    }

                    @Override
                    public boolean leaveVehicle() {
                        return false;
                    }

                    @Override
                    public Entity getVehicle() {
                        return null;
                    }

                    @Override
                    public void setCustomNameVisible(boolean flag) {

                    }

                    @Override
                    public boolean isCustomNameVisible() {
                        return false;
                    }

                    @Override
                    public void setGlowing(boolean flag) {

                    }

                    @Override
                    public boolean isGlowing() {
                        return false;
                    }

                    @Override
                    public void setInvulnerable(boolean flag) {

                    }

                    @Override
                    public boolean isInvulnerable() {
                        return false;
                    }

                    @Override
                    public boolean isSilent() {
                        return false;
                    }

                    @Override
                    public void setSilent(boolean flag) {

                    }

                    @Override
                    public boolean hasGravity() {
                        return false;
                    }

                    @Override
                    public void setGravity(boolean gravity) {

                    }

                    @Override
                    public int getPortalCooldown() {
                        return 0;
                    }

                    @Override
                    public void setPortalCooldown(int cooldown) {

                    }

                    @Override
                    public Set<String> getScoreboardTags() {
                        return null;
                    }

                    @Override
                    public boolean addScoreboardTag(String tag) {
                        return false;
                    }

                    @Override
                    public boolean removeScoreboardTag(String tag) {
                        return false;
                    }

                    @Override
                    public PistonMoveReaction getPistonMoveReaction() {
                        return null;
                    }

                    @Override
                    public BlockFace getFacing() {
                        return null;
                    }

                    @Override
                    public Pose getPose() {
                        return null;
                    }

                    @Override
                    public Spigot spigot() {
                        return null;
                    }

                    @Override
                    public Location getOrigin() {
                        return null;
                    }

                    @Override
                    public boolean fromMobSpawner() {
                        return false;
                    }

                    @Override
                    public Chunk getChunk() {
                        return null;
                    }

                    @Override
                    public CreatureSpawnEvent.SpawnReason getEntitySpawnReason() {
                        return null;
                    }

                    @Override
                    public boolean isInRain() {
                        return false;
                    }

                    @Override
                    public boolean isInBubbleColumn() {
                        return false;
                    }

                    @Override
                    public boolean isInWaterOrRain() {
                        return false;
                    }

                    @Override
                    public boolean isInWaterOrBubbleColumn() {
                        return false;
                    }

                    @Override
                    public boolean isInWaterOrRainOrBubbleColumn() {
                        return false;
                    }

                    @Override
                    public boolean isInLava() {
                        return false;
                    }

                    @Override
                    public boolean isTicking() {
                        return false;
                    }

                    @Override
                    public void damage(double amount) {

                    }

                    @Override
                    public void damage(double amount, Entity source) {

                    }

                    @Override
                    public double getHealth() {
                        return 0;
                    }

                    @Override
                    public void setHealth(double health) {

                    }

                    @Override
                    public double getAbsorptionAmount() {
                        return 0;
                    }

                    @Override
                    public void setAbsorptionAmount(double amount) {

                    }

                    @Override
                    public double getMaxHealth() {
                        return 0;
                    }

                    @Override
                    public void setMaxHealth(double health) {

                    }

                    @Override
                    public void resetMaxHealth() {

                    }

                    @Override
                    public AttributeInstance getAttribute(Attribute attribute) {
                        return null;
                    }

                    @Override
                    public double getEyeHeight() {
                        return 0;
                    }

                    @Override
                    public double getEyeHeight(boolean ignorePose) {
                        return 0;
                    }

                    @Override
                    public Location getEyeLocation() {
                        return null;
                    }

                    @Override
                    public List<Block> getLineOfSight(Set<Material> transparent, int maxDistance) {
                        return null;
                    }

                    @Override
                    public Block getTargetBlock(Set<Material> transparent, int maxDistance) {
                        return null;
                    }

                    @Override
                    public Block getTargetBlock(int maxDistance, TargetBlockInfo.FluidMode fluidMode) {
                        return null;
                    }

                    @Override
                    public BlockFace getTargetBlockFace(int maxDistance, TargetBlockInfo.FluidMode fluidMode) {
                        return null;
                    }

                    @Override
                    public TargetBlockInfo getTargetBlockInfo(int maxDistance, TargetBlockInfo.FluidMode fluidMode) {
                        return null;
                    }

                    @Override
                    public Entity getTargetEntity(int maxDistance, boolean ignoreBlocks) {
                        return null;
                    }

                    @Override
                    public TargetEntityInfo getTargetEntityInfo(int maxDistance, boolean ignoreBlocks) {
                        return null;
                    }

                    @Override
                    public List<Block> getLastTwoTargetBlocks(Set<Material> transparent, int maxDistance) {
                        return null;
                    }

                    @Override
                    public Block getTargetBlockExact(int maxDistance) {
                        return null;
                    }

                    @Override
                    public Block getTargetBlockExact(int maxDistance, FluidCollisionMode fluidCollisionMode) {
                        return null;
                    }

                    @Override
                    public RayTraceResult rayTraceBlocks(double maxDistance) {
                        return null;
                    }

                    @Override
                    public RayTraceResult rayTraceBlocks(double maxDistance, FluidCollisionMode fluidCollisionMode) {
                        return null;
                    }

                    @Override
                    public int getRemainingAir() {
                        return 0;
                    }

                    @Override
                    public void setRemainingAir(int ticks) {

                    }

                    @Override
                    public int getMaximumAir() {
                        return 0;
                    }

                    @Override
                    public void setMaximumAir(int ticks) {

                    }

                    @Override
                    public int getArrowCooldown() {
                        return 0;
                    }

                    @Override
                    public void setArrowCooldown(int ticks) {

                    }

                    @Override
                    public int getArrowsInBody() {
                        return 0;
                    }

                    @Override
                    public void setArrowsInBody(int count) {

                    }

                    @Override
                    public int getMaximumNoDamageTicks() {
                        return 0;
                    }

                    @Override
                    public void setMaximumNoDamageTicks(int ticks) {

                    }

                    @Override
                    public double getLastDamage() {
                        return 0;
                    }

                    @Override
                    public void setLastDamage(double damage) {

                    }

                    @Override
                    public int getNoDamageTicks() {
                        return 0;
                    }

                    @Override
                    public void setNoDamageTicks(int ticks) {

                    }

                    @Override
                    public Player getKiller() {
                        return null;
                    }

                    @Override
                    public void setKiller(Player killer) {

                    }

                    @Override
                    public boolean addPotionEffect(PotionEffect effect) {
                        return false;
                    }

                    @Override
                    public boolean addPotionEffect(PotionEffect effect, boolean force) {
                        return false;
                    }

                    @Override
                    public boolean addPotionEffects(Collection<PotionEffect> effects) {
                        return false;
                    }

                    @Override
                    public boolean hasPotionEffect(PotionEffectType type) {
                        return false;
                    }

                    @Override
                    public PotionEffect getPotionEffect(PotionEffectType type) {
                        return null;
                    }

                    @Override
                    public void removePotionEffect(PotionEffectType type) {

                    }

                    @Override
                    public Collection<PotionEffect> getActivePotionEffects() {
                        return null;
                    }

                    @Override
                    public boolean hasLineOfSight(Entity other) {
                        return false;
                    }

                    @Override
                    public boolean getRemoveWhenFarAway() {
                        return false;
                    }

                    @Override
                    public void setRemoveWhenFarAway(boolean remove) {

                    }

                    @Override
                    public EntityEquipment getEquipment() {
                        return null;
                    }

                    @Override
                    public void setCanPickupItems(boolean pickup) {

                    }

                    @Override
                    public boolean getCanPickupItems() {
                        return false;
                    }

                    @Override
                    public boolean isLeashed() {
                        return false;
                    }

                    @Override
                    public Entity getLeashHolder() throws IllegalStateException {
                        return null;
                    }

                    @Override
                    public boolean setLeashHolder(Entity holder) {
                        return false;
                    }

                    @Override
                    public boolean isGliding() {
                        return false;
                    }

                    @Override
                    public void setGliding(boolean gliding) {

                    }

                    @Override
                    public boolean isSwimming() {
                        return false;
                    }

                    @Override
                    public void setSwimming(boolean swimming) {

                    }

                    @Override
                    public boolean isRiptiding() {
                        return false;
                    }

                    @Override
                    public boolean isSleeping() {
                        return false;
                    }

                    @Override
                    public void setAI(boolean ai) {

                    }

                    @Override
                    public boolean hasAI() {
                        return false;
                    }

                    @Override
                    public void attack(Entity target) {

                    }

                    @Override
                    public void swingMainHand() {

                    }

                    @Override
                    public void swingOffHand() {

                    }

                    @Override
                    public void setCollidable(boolean collidable) {

                    }

                    @Override
                    public boolean isCollidable() {
                        return false;
                    }

                    @Override
                    public Set<UUID> getCollidableExemptions() {
                        return null;
                    }

                    @Override
                    public <T> T getMemory(MemoryKey<T> memoryKey) {
                        return null;
                    }

                    @Override
                    public <T> void setMemory(MemoryKey<T> memoryKey, T memoryValue) {

                    }

                    @Override
                    public EntityCategory getCategory() {
                        return null;
                    }

                    @Override
                    public void setInvisible(boolean invisible) {

                    }

                    @Override
                    public boolean isInvisible() {
                        return false;
                    }

                    @Override
                    public int getArrowsStuck() {
                        return 0;
                    }

                    @Override
                    public void setArrowsStuck(int arrows) {

                    }

                    @Override
                    public int getShieldBlockingDelay() {
                        return 0;
                    }

                    @Override
                    public void setShieldBlockingDelay(int delay) {

                    }

                    @Override
                    public ItemStack getActiveItem() {
                        return null;
                    }

                    @Override
                    public void clearActiveItem() {

                    }

                    @Override
                    public int getItemUseRemainingTime() {
                        return 0;
                    }

                    @Override
                    public int getHandRaisedTime() {
                        return 0;
                    }

                    @Override
                    public boolean isHandRaised() {
                        return false;
                    }

                    @Override
                    public boolean isJumping() {
                        return false;
                    }

                    @Override
                    public void setJumping(boolean jumping) {

                    }

                    @Override
                    public void playPickupItemAnimation(Item item, int quantity) {

                    }

                    @Override
                    public float getHurtDirection() {
                        return 0;
                    }

                    @Override
                    public void setHurtDirection(float hurtDirection) {

                    }

                    @Override
                    public Pathfinder getPathfinder() {
                        return null;
                    }

                    @Override
                    public boolean isInDaylight() {
                        return false;
                    }

                    @Override
                    public void setTarget(LivingEntity target) {

                    }

                    @Override
                    public LivingEntity getTarget() {
                        return null;
                    }

                    @Override
                    public void setAware(boolean aware) {

                    }

                    @Override
                    public boolean isAware() {
                        return false;
                    }

                    @Override
                    public void rangedAttack(LivingEntity target, float charge) {

                    }

                    @Override
                    public void setChargingAttack(boolean raiseHands) {

                    }

                    @Override
                    public SkeletonType getSkeletonType() {
                        return null;
                    }

                    @Override
                    public void setSkeletonType(SkeletonType type) {

                    }
                };
                Spider spider = (Spider) event.getEntity();
                spider.addPotionEffect(PotionEffectType.INVISIBILITY.createEffect(1000000, 1));
                spider.addPassenger(skeleton);

            }
        }
    }
