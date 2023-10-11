package generalsfight;

public class General {

    private String name;
    protected int motivation;

    public General(String name, int motivation) {
        this.name = name;
        this.motivation = motivation;
    }

    public String getName() {
        return this.name;
    }

    public int getMotivationLevel() {
        if (this.motivation < 25) {
            return 0;
        } else if (this.motivation > 25 && this.motivation < 40) {
            return 1;
        }
        return 2;
    }

    public void punch(General otherGeneral) {

        if (motivation < 1) {
            System.out.println("Sorry, I don't have enought motivation to fight.");
        }
        double damage = Math.ceil(this.motivation / 1.5);
        otherGeneral.bePunched(10);
        System.out.println(name + " with " + motivation + " motivation punches "
                + otherGeneral.name + " who has " + otherGeneral.motivation + " motivation.");
    }

    public void bePunched(int damage) {
        double newMotivation = this.motivation - Math.ceil((double) damage / ((double) this.motivation / 2));
        if (newMotivation < 0) {
            this.motivation = 0;
        }
        this.motivation = (int) newMotivation;
    }

    @Override
    public String toString() {
        if (getMotivationLevel() == 0) {
            System.out.println(this.name + " is not motivated anymore.");
        } else if (getMotivationLevel() == 1) {
            System.out.println(this.name + " is motivated.");
        }
        return this.name + " is well motivated.";
    }
}
