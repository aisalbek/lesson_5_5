public class Main {
    public static void main(String[] args) {
     Boss boss = new Boss();
     boss.setHealth(500);
     boss.setDamage(50);
     boss.setBron("magic");
        System.out.println("Boss health :" + boss.getHealth()
                + "\nBoss Damage :"+ boss.getDamage()+"\nBoss Bron :"+boss.getBron());

        for (Hero i :createHeroes()) {
            System.out.println("health :"+i.getHealth());
            System.out.println("damage :"+i.getDamage());
            System.out.println("superPower :"+i.getSuperPower());
        }
    }

  public static Hero[] createHeroes() {
       Hero mag =new Hero(300,30,"magic");
       Hero boes =new Hero(400,20);
       Hero tor =new Hero(350,25);
       Hero[] arrayHero={mag,boes,tor};
      return arrayHero;
    }
}