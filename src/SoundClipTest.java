/**
 * Created by TrungNT on 3/13/2016.
 */
import javax.swing.*;
import sun.audio.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class SoundClipTest extends JFrame{
    BufferedImage sprite;

    public SoundClipTest() {
       /* try {
            sprite = ImageIO.read(new File("resource\\pokemon.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Test Sound Clip");
        this.setSize(452, 256);
        this.setVisible(true);
    }


    public void music(){
        AudioPlayer MGP = AudioPlayer.player;
        AudioStream BGM;
        AudioData MD;
        ContinuousAudioDataStream loop = null;
        try{
            //BGM = new AudioStream(new FileInputStream("resource\\pokerap.wav"));
            BGM = new AudioStream(new FileInputStream("resource\\pokerap.wav"));
            MD = BGM.getData();
            loop = new ContinuousAudioDataStream(MD);
        }catch(IOException error){
            System.out.print("file not found");
        }

        MGP.start(loop);
    }


}
