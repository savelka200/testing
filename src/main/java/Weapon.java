class Weapon {
    public void shot() {

    }

}
class BigGun extends Weapon{
    @Override
    public void shot() {
        System.out.println("Бабах!");
        super.shot();
    }
}
class WaterPistol extends Weapon{
    @Override
    public void shot() {
        System.out.println("пиу!");
        super.shot();
    }
}

