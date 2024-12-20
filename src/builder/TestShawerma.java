package builder;

import builder.shawerma.*;

public class TestShawerma {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        ShawermaBuilder chickenShawermaBuilder = new ChickenShawermaBuilder();
        ShawermaBuilder beefShawermaBuilder = new BeefShawermaBuilder();

        waiter.setBuilder(chickenShawermaBuilder);
        Shawerma chickenShawerma = waiter.constructShawerma();
        System.out.println(chickenShawerma);

        waiter.setBuilder(beefShawermaBuilder);
        Shawerma beefShawerma = waiter.constructShawerma();
        System.out.println(beefShawerma);
    }
}
