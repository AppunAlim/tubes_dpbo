package Produk;

public class PCGaming extends Produk{
    private String processor;
    private String gpu;
    private int ram;
    private String storage;

    public PCGaming(String id, String nama, int harga, String kategori, int stok,
                    String processor, String gpu, int ram, String storage) {
        super(id, nama, harga, kategori, stok);
        this.processor = processor;
        this.gpu = gpu;
        this.ram = ram;
        this.storage = storage;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override
    public String[] getSpesifikasi() {
        return new String[] {
            "Processor: " + processor,
            "GPU: " + gpu,
            "RAM: " + ram + "GB",
            "Storage: " + storage
        };
    }

    public double hitungHarga() {
        return getHarga() * 1.10;
    }
}
