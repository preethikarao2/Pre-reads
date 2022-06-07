
class RnaTranscription {
     String transcribe(String dnaStrand) {
        String newStr = "";
        for (char c : dnaStrand.toCharArray()) {
            newStr += translateRna(c);
        }
        return newStr;
    }
     char translateRna(char c) {
        switch(c) {
            case 'G':
                return 'C';
            case 'C':
                return 'G';
            case 'T':
                return 'A';
            case 'A':
                return 'U';
            default:
                return 'X';
        }
    }
}
