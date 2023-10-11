package generalsfight;

public class RomeEmpireGeneral extends General{

    public RomeEmpireGeneral(String name) {
        super(name, 40);
    }

    public RomeEmpireGeneral(String name, int motivation) {
        super(name, motivation);
    }

    @Override
    public void punch(General otherGeneral) {
        if (motivation < 1) {
            System.out.println("Sorry, I don't have enought motivation to fight.");
        }
        if (otherGeneral instanceof RomeEmpireGeneral) {
            System.out.println("Greek General cannot fight another Greek General!");
        }
        double damage = Math.ceil(this.motivation / 1.5);
        otherGeneral.bePunched(10);
    }

}
