package optional.get;

public class Username {

    private String name;

    public Username(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        Username usernameOther = (Username) o;

        return this.name.equals(usernameOther.name);
    }
}
