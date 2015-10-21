package br.com.sample.output;

public class People {

    private final long id;
    private final String name;

    public People(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
