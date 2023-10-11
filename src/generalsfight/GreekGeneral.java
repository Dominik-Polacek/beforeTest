package generalsfight;

public class GreekGeneral extends General {

    public GreekGeneral(String name) {
        super(name, 45);
    }
    public GreekGeneral(String name, int motivation) {
        super(name, motivation);
    }

    @Override
    public void punch(General otherGeneral) {
        if (motivation < 1) {
            System.out.println("Sorry, I don't have enought motivation to fight.");
        }
        if (otherGeneral instanceof GreekGeneral) {
            System.out.println("Greek General cannot fight another Greek General!");
        }
        double damage = Math.ceil(this.motivation / 1.5);
        otherGeneral.bePunched(10);
    }
}
