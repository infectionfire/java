package Archive;

public class UnPackMain {
    public static void main(String[] args) {
        // location and archive name
        String nameJar = "example.jar";
        // directory to which the files will be unpacked
        String destinationPath = "c:\\tmp\\";
        new UnPackJar().unpack(destinationPath, nameJar);
    }
}