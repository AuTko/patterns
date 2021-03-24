package Facade.Classes;

public class Upscale {

    public static VideoFile upscale(VideoFile file) {
        System.out.println("File " + file.getName() + " got better resolution");
        return file;
    }
}
