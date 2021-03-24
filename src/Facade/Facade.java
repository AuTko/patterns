package Facade;

import Facade.Classes.Filters;
import Facade.Classes.Upscale;
import Facade.Classes.VideoFile;

public class Facade {

    public void upgradeVideo(String fileName) {
        VideoFile file = new VideoFile(fileName);
        Upscale.upscale(file);
        Filters.secFilter(file);
    }
}
