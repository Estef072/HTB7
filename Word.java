public class Word implements Comparable<Word>{

    String english;
    String french;
    String spanish;
    String unique;

    public Word(String e, String s, String f){
        english=e;french=f;spanish=s;
    }

    public Word(String u){
        unique = u;
    }

    public String getWord(String k){
        if(unique == null) {
            if (k.equals("english")) {
                return english;
            } else if (k.equals("french")) {
                return french;
            } else if (k.equals("spanish")) {
                return spanish;
            } else return null;
        } else {
            return unique;
        }
    }

    @Override
    public int compareTo(Word o) {
        if(o.getUnique() == null){
            return getWord(Main.currentLanguage).compareTo(o.getWord(Main.currentLanguage));
        } else {
            return getWord(Main.currentLanguage).compareTo(o.getUnique());
        }

    }

    public String getUnique(){
        return unique;
    }

    @Override
    public String toString() {
        return "( " +
                english + ", " +
                french + ", " +
                spanish+
                " )\n";
    }
}
