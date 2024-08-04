package strategyDesignPattern.withStrategyPattern.fileCompression;

public class Main {
    public static void main(String[] args) {
        Compressor compressor = new Compressor();

        String data = "this is a test for compression.";

        CompressionStrategy gzipStrategy = CompressionStrategyFactory.getCompressionStrategy("gzip");
        compressor.setCompressionStrategy(gzipStrategy);
        byte[] compressedData = compressor.compress(data);
        String decompressedData = compressor.decompress(compressedData);

        // Change strategy
        CompressionStrategy lzwStrategy = CompressionStrategyFactory.getCompressionStrategy("lzw");
        compressor.setCompressionStrategy(lzwStrategy);
        compressedData = compressor.compress(data);
        decompressedData = compressor.decompress(compressedData);



        // Change strategy again
        CompressionStrategy huffmanStrategy = CompressionStrategyFactory.getCompressionStrategy("huffman");
        compressor.setCompressionStrategy(huffmanStrategy);
        compressedData = compressor.compress(data);
        decompressedData = compressor.decompress(compressedData);
    }
}
