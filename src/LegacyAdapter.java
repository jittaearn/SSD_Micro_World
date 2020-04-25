public class LegacyAdapter implements IUnit{

    private LegacyUnit legacyUnit;

    public LegacyAdapter(LegacyUnit legacyUnit) {
        this.legacyUnit = legacyUnit;
    }

    @Override
    public void move() {
        legacyUnit.walk();
    }

    @Override
    public int getX() {
        return legacyUnit.getPositionX();
    }

    @Override
    public int getY() {
        return legacyUnit.getPositionY();
    }

    @Override
    public String getName() {
        return "Legacy Unit";
    }

    @Override
    public int getHealth() {
        return 100;
    }

    @Override
    public boolean dead() {
        return false;
    }
}
