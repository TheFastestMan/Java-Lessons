package beginning.enumiration;

public enum Animal {
    CAT("кот"), DOG("собака"), HORSE("лошадь"), SPIDER("паук"), ELEPHANT("слон");
    private String translation;

    Animal(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
}
