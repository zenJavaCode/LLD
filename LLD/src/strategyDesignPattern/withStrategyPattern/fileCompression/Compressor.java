package strategyDesignPattern.withStrategyPattern.fileCompression;

public class Compressor {

    private CompressionStrategy compressionStrategy;

    public void setCompressionStrategy(CompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }

    public byte[] compress(String data) {
        return compressionStrategy.compress(data);
    }

    public String decompress(byte[] data) {
        return compressionStrategy.decompress(data);
    }
}
