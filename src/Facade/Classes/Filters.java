package Facade.Classes;

public class Filters {
    public static VideoFile firstFilter(VideoFile file) {
        System.out.println("File " + file.getName() + " got first filter");
        return file;
    }

    public static VideoFile secFilter(VideoFile file) {
        System.out.println("File " + file.getName() + " got second filter");
        return file;
    }
}
