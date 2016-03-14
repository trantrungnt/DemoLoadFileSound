/**
 * Created by TrungNT on 3/14/2016.
 */

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.*;
import java.io.*;

public class PlayMP3 {
    public void playmp3()
    {
        try {
            File file = new File("Resource/background-music-game-main.mp3");
            FileInputStream fis = null;
            fis = new FileInputStream(file);


            Player player = null;
            try {
                player = new Player(fis);
                player.play();
            } catch (JavaLayerException e) {
                e.printStackTrace();
            }




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
