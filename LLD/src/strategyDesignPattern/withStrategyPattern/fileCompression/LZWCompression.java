package strategyDesignPattern.withStrategyPattern.fileCompression;
public class LZWCompression implements CompressionStrategy{
    @Override
    public byte[] compress(String data) {
        System.out.println("`Compressing data using LZW");
        // LZW compression implementation...
        return new byte[0]; // Placeholder
    }
    @Override
    public String decompress(byte[] data) {
        System.out.println("Decompressing data using LZW");
        // LZW decompression implementation...
        return ""; // Placeholder
    }
}
