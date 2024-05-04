public class SuperBoss {

    private static SuperBoss INSTANCE;
    String name;

    private SuperBoss(String name) {
        this.name =name;
    }
    public static SuperBoss getSuperBoss(String name) {
        if (INSTANCE == null) {
            INSTANCE = new SuperBoss(name);
        }
        return INSTANCE;
    }
}
