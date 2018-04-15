public class Code05_ReplaceSpaces {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("We are the world");
        System.out.println(replaceSpaces(stringBuffer));
    }

    public static String replaceSpaces(StringBuffer stringBuffer) {
        int spaceCount = 0;
        for (int i = 0; i < stringBuffer.length(); i++) {
            if (stringBuffer.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        int index1 = stringBuffer.length() - 1;
        int index2 = stringBuffer.length() + spaceCount*2 - 1;
        stringBuffer.setLength(index2+1);
        while (index1 >= 0 && index2 >= 0) {
            if (stringBuffer.charAt(index1) == ' ') {
                stringBuffer.setCharAt(index2--,'0');
                stringBuffer.setCharAt(index2--,'2');
                stringBuffer.setCharAt(index2--,'%');
            } else {
                stringBuffer.setCharAt(index2--,stringBuffer.charAt(index1));
            }
            index1--;
        }

        return stringBuffer.toString();
    }
}
