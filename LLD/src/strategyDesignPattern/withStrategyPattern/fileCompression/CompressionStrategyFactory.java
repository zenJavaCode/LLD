package strategyDesignPattern.withStrategyPattern.fileCompression;

public class CompressionStrategyFactory {
    public static CompressionStrategy getCompressionStrategy(String strategyType) {

        switch (strategyType.toLowerCase()) {
            case "gzip":
                return new GZipCompression();
            case "lzw":
                return new LZWCompression();
            case "huffman":
                return new HuffmanCompression();
            default:
                throw new IllegalArgumentException("Unknown compression strategy");
        }
    }
}
