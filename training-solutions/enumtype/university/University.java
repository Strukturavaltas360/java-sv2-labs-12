package enumtype.university;

public enum University {BME("Budapesti Műszaki és Gazdaságtudományi Egyetem"),SZTE("Szegedi Tudományegyetem"), PTE("Pécsi Tudományegyetem"),
    BGE("Budapesti Gazdasági Egyetem"), DE("Debreceni Egyetem"), ME("Miskolci Egyetem"), SZFE("Színház- és Filmművészeti Egyetem");

    private final String name;

    University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
