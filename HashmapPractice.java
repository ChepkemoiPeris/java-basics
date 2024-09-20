import java.util.HashMap;
class HashmapPractice {
    public static void main(String[] args) {
        HashMap<String,Integer> examScores = new HashMap<String,Integer>();
        examScores.put("Math", 90);
        examScores.put("English", 100);
        examScores.put("Computer", 87);
        examScores.replace("Math", 70);
        examScores.remove("Computer");
        examScores.forEach((subject,score)->{
            examScores.replace(subject, score - 10);
           
        });
        System.out.println(examScores.toString());
    }
}
