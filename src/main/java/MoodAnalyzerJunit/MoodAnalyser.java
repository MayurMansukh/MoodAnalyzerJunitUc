package MoodAnalyzerJunit;
public class MoodAnalyser {
    private String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if (message.contains("sad")) {
            return "Sad";
        } else {
            return "Happy";
        }
    }
}