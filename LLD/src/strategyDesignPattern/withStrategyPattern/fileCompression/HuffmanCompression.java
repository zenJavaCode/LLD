package strategyDesignPattern.withStrategyPattern.fileCompression;

public class HuffmanCompression implements CompressionStrategy{
    @Override
    public byte[] compress(String data) {
        System.out.println("Compressing data using Huffman coding");
        // Huffman compression implementation...
        return new byte[0]; // Placeholder
    }
    @Override
    public String decompress(byte[] data) {
        System.out.println("Decompressing data using Huffman coding");
        // Huffman decompression implementation...
        return ""; // Placeholder
    }
}
