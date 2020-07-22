public class FakeBinary {
    public static void main(String[] args) {
        System.out.println(fakeBin("5ajbkgag1623asbkasjg61361"));
    }
    public static String fakeBin(String numberString){
        if (numberString== null || numberString.length() == 0)
            return "";
        String returnString = new String();
        for (int index = 0; index < numberString.length(); index++) {
            char c = numberString.charAt(index);
            if (!(c >= '0' && c <= '9')) {
                returnString += c;
                continue;
            }
            if (c < '5'){
                returnString+= "0";
                continue;
            }
            if (c >= '5'){
                returnString+= "1";
            }
        }
        return returnString;
    }
}
