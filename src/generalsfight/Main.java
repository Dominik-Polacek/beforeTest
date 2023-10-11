package generalsfight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        General general = new General("Maximus", 35);
//        General otherGeneral = new General ("Achiles", 30);
//        general.toString();
//        otherGeneral.toString();
//        general.punch(otherGeneral);

        List<General> generals = new ArrayList<>();
        generals.add(new GreekGeneral("Leonidas", 42));
        generals.add(new GreekGeneral("Themistocles", 55));
        generals.add(new GreekGeneral("Pericles", 30));

        generals.add(new RomeEmpireGeneral("Nero", 45));
        generals.add(new RomeEmpireGeneral("Julius Caesar", 50));
        generals.add(new RomeEmpireGeneral("Marcus Antonius", 35));

        Fight fight = new Fight(generals);
        fight.startFight();
        //print report
        //bojují pouze generálové 2 úrovně

        List<RomeEmpireGeneral> romeGenerals = fight.forTheEmpire();
        List<GreekGeneral> greekGenerals = new ArrayList<>();

        //každej generál bojuje s každým
        for (General g : generals) {
            if (g instanceof GreekGeneral) {
                greekGenerals.add((GreekGeneral) g);
            }
        }

        System.out.println();
        System.out.println();
        //bojují pouze well motivated:
        System.out.println("Attacker Team Alfa: " + greekGenerals);
        System.out.println("Attacked Team Beta: " + romeGenerals);
        System.out.println();

        for (RomeEmpireGeneral romeGeneral : romeGenerals) {
            for (GreekGeneral greekGeneral : greekGenerals) {
                System.out.println(romeGeneral.getName() + " punches " + greekGeneral.getName() + ",");
                romeGeneral.punch(greekGeneral);
                System.out.println("but before moving on to " + greekGeneral.getName() + ",");
                greekGeneral.punch(romeGeneral);
                System.out.println(romeGeneral.getName() + " punches " + greekGeneral.getName() + ",");
                romeGeneral.punch(greekGeneral);
                System.out.println("and " + greekGeneral.getName() + " punches back " + romeGeneral.getName() + ".");
                System.out.println();
            }
        }
    }
}
