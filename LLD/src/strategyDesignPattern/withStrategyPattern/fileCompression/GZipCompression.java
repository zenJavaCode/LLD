package strategyDesignPattern.withStrategyPattern.fileCompression;
public class GZipCompression implements CompressionStrategy{
    @Override
    public byte[] compress(String data) {
        System.out.println("Compressing data using GZip");
        // GZip compression implementation...
        return new byte[0];
    }

    @Override
    public String decompress(byte[] data) {
        System.out.println("Decompressing data using GZip");
        // GZip decompression implementation...
        return "";
    }
}
