public class Kitchen {
    private String cooker;
    private String refrigerator;
    private String table;
    private String oven;
    private String sink;
    private String dishwasher;

    public Kitchen(String cooker, String refrigerator, String table, String oven, String sink, String dishwasher) {
        this.cooker = cooker;
        this.refrigerator = refrigerator;
        this.table = table;
        this.oven = oven;
        this.sink = sink;
        this.dishwasher = dishwasher;
    }

    public String getCooker() {
        return cooker;
    }

    public String getRefrigerator() {
        return refrigerator;
    }

    public String getTable() {
        return table;
    }

    public String getOven() {
        return oven;
    }

    public String getSink() {
        return sink;
    }

    public String getDishwasher() {
        return dishwasher;
    }
}
