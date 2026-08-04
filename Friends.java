package SplitWise;

public class Friends {
    private static int lastId = 0;
    private final int id;
    private  String name;

    public  Friends(String name)
    {
        lastId++;
        this.id = lastId;
        this.name=name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

}
