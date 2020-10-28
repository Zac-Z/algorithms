package builder.simplebuilder;

public class Demo {
    public static void main(String[] args) {
        // 这段代码会抛出IllegalArgumentException，因为minIdle>maxIdle
        ResourcePoolConfig config = new ResourcePoolConfig.Builder()
                .setName("dbconnectionpool")
                .setMaxTotal(16)
                .setMaxIdle(13)
                .setMinIdle(12)
                .build();
    }
}
