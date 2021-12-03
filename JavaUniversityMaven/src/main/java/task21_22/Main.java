package task21_22;

public class Main {
    public static void main(String[] args)
    {
        ///Task 2
        Client client = new Client();
        Factory magic = new MagicChairFactory();
        Chair magicChair = new MagicChair();
        Factory victorian = new VictorianChairFactory();
        Chair victorianChair = new VictorianChair();
        client.Sit(magicChair);
        client.Sit(victorianChair);

        ///Task 3
        Editor textEditor = new TextEditor();
        IDocument textFile = textEditor.NewFile();
        textFile.Save();

        Editor musicEditor = new MusicEditor();
        IDocument musicFile = musicEditor.NewFile();
        musicFile.Save();
    }
}
