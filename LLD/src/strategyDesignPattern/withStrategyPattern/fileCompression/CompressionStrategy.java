package strategyDesignPattern.withStrategyPattern.fileCompression;

public interface CompressionStrategy {

    byte[] compress(String data);
    String decompress(byte[] data);
}
