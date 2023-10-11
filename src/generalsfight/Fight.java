package generalsfight;

import java.util.ArrayList;
import java.util.List;

public class Fight {
    List<General> generalList;

    public Fight (List <General> generalList) {
        this.generalList = generalList;
    }

    public List<RomeEmpireGeneral> forTheEmpire() {
        List<RomeEmpireGeneral> highestMotivationGenerals = new ArrayList<>();

        for(General g : generalList) {
            int motivationLevel = g.getMotivationLevel();
            if (g instanceof RomeEmpireGeneral && motivationLevel == 2) {
                RomeEmpireGeneral empireGeneral = (RomeEmpireGeneral) g;
                highestMotivationGenerals.add(empireGeneral);
            }
        }
        return highestMotivationGenerals;
    }

    public void startFight() {
        List<RomeEmpireGeneral> empireGeneralList;
        empireGeneralList = forTheEmpire();

       List<GreekGeneral> greekGeneralList = new ArrayList<>();

        for (General general : generalList) {
            if (general instanceof GreekGeneral) {
                greekGeneralList.add((GreekGeneral) general);
            }
        }
        for (RomeEmpireGeneral romeGeneral: empireGeneralList) {
            for (GreekGeneral greekGeneral: greekGeneralList) {
                romeGeneral.punch(greekGeneral);
            }
        }

    }

}
