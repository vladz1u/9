import java.util.HashMap;

public class fifthTask {
    public static void main(String[] args) {
        String sentence = "Hello, java, java and hello";
        printAr(frequencyWord(sentence));
    }

    public static HashMap<String, Integer> frequencyWord(String sentence){
        String[] splitSentence = sentence.split("\\P{L}+");
        HashMap<String, Integer> wordFrequency = new HashMap<>();

        for (String word : splitSentence) {
            word = word.toLowerCase();
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }
        return wordFrequency;
    }

    public static void printAr(HashMap<String, Integer> ar){
        for (HashMap.Entry<String, Integer> entry : ar.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
