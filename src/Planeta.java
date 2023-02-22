public enum Planeta {
    MARS("Кундон эн алыскы тортунчу планета"),
    SATURN("Юпитерден кийинки экинчи чон планета"),
    EARTH("Чон планеталардын ичинен бешинчи орунда турат"),
    JUPITER("Кун системасындагы эн чон планета"),
    MERCURY("Кун системасындагы эн кичине планета"),
    VENUS("Жер планетасына абдан окшош ");

    private String similar;

    Planeta(String similar) {
        this.similar = similar;
    }

    public String getSimilar() {
        return similar;
    }
}
