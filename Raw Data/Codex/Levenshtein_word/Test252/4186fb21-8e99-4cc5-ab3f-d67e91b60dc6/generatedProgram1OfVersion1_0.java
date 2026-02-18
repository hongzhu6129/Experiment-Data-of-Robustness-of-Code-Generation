import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupPercussionInstruments {

    public static void main(String[] args) {
        String[] instruments = {"clarinet", "flute", "oboe", "bassoon", "trumpet", "trombone", "timpani", "snare drum", "cymbal"};
        List<String> percussionInstruments = Arrays.stream(instruments)
                .filter(i -> i.contains("drum") || i.contains("cymbal"))
                .collect(Collectors.toList());

        System.out.println("Percussion Instruments: " + percussionInstruments);
    }
}
