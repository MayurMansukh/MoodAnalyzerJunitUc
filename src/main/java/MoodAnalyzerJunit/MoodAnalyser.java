package MoodAnalyzerJunit;
public class MoodAnalyser {
    private String message;

    public MoodAnalyser(String message)
    {
        this.message=message;
    }

    public String analyseMood()
    {
        try {

            if (message.contains("sad")) {
                return "Sad";
            } else {
                return "Happy";
            }
        }catch (NullPointerException e){
            return "Happy";
        }
    }
}