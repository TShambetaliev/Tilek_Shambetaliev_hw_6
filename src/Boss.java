public class Boss extends GameEntity {
private WeaponType WeaponType;

    public WeaponType getWeaponType() {
        return WeaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.WeaponType = weaponType;
    }

    public String printInfo (){
return "Boss Health: " + this.getHealth() + ",Boss Hit: " + this.getHit() + "Boss Weapon: " + this.WeaponType;
}
}
