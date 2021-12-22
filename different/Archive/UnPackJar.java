package Archive;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
public class UnPackJar {
    private Path destinationPath;
    // buffer size when unpacking
    public static final int BUFFER = 2_048;
    public void unpack(String destinationDirectory, String nameJar) {
        try (JarFile jarFile = new JarFile(nameJar)) {
            jarFile.stream().forEach(entry -> {
                String entryname = entry.getName();
                System.out.println("Extracting: " + entry);
                destinationPath = Paths.get(destinationDirectory, entryname);
                // create directory structure
                destinationPath.getParent().toFile().mkdirs();
                // unpack the record, if it is not a directory
                if (!entry.isDirectory()) {
                    writeFile(jarFile, entry);
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }}
    private void writeFile(JarFile jar, JarEntry entry) {
        int currentByte;
        byte data[] = new byte[BUFFER];
        try (BufferedInputStream bufferedInput =
                     new BufferedInputStream(jar.getInputStream(entry));
             FileOutputStream fileOutput =
                     new FileOutputStream(destinationPath.toString());
             BufferedOutputStream bufferedOutput =
                     new BufferedOutputStream(fileOutput, BUFFER)) {
            // write the file to disk
            while ((currentByte = bufferedInput.read(data, 0, BUFFER)) > 0) {
                bufferedOutput.write(data, 0, currentByte);
            }
            bufferedOutput.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}