public class RomanNumber {

    private static Integer sumTotal = 0;
    public static String getRomanNumber(Integer number) {
        char[] numberAsString = new StringBuilder(number.toString()).reverse().toString().toCharArray();
        StringBuilder finalString = new StringBuilder();
        String thousand = "", hundred = "", moreThanTen = "", lessThanTen = "";
        for(int position = 0; position < numberAsString.length; position++) {
            if(position == 0) {
                lessThanTen = getLessThanTen(numberAsString[position]);
            } else if(position == 1) {
                moreThanTen = getMoreThanTen(numberAsString[position]);
            } else if(position == 2) {
                hundred = getHundreds(numberAsString[position]);
            } else if(position == 3) {
                thousand = getThousands(numberAsString[position]);
            }
        }

        return finalString.append(thousand).append(hundred).append(moreThanTen).append(lessThanTen).toString();
    }

    private static String getThousands(Character number) {
        switch (number) {
            case '1' : return "M";
            case '2' : return "MM";
            case '3' : return "MMM";
            default : return "";
        }
    }

    private static String getHundreds(Character number) {
        switch(number) {
            case '1' : return "C";
            case '2' : return "CC";
            case '3' : return "CCC";
            case '4' : return "CD";
            case '5' : return "D";
            case '6' : return "DC";
            case '7' : return "DCC";
            case '8' : return "DCCC";
            case '9' : return "CM";
            default: return "";
        }
    }

    private static String getMoreThanTen(Character number) {
        switch (number) {
            case '1' : return "X";
            case '2' : return "XX";
            case '3' : return "XXX";
            case '4' : return "XL";
            case '5' : return "L";
            case '6' : return "LX";
            case '7' : return "LXX";
            case '8' : return "LXXX";
            case '9' : return "XC";
            default: return "";
        }
    }

    private static String getLessThanTen(Character number) {
        switch(number) {
            case '1': return "I";
            case '2': return "II";
            case '3': return "III";
            case '4': return "IV";
            case '5': return "V";
            case '6': return "VI";
            case '7': return "VII";
            case '8': return "VIII";
            case '9': return "IX";
            default: return "";
        }
    }

    public static void main(String[] args) {
        System.out.println(RomanNumber.getRomanNumber(5));
        System.out.println(RomanNumber.getRomanNumber(15));
        System.out.println(RomanNumber.getRomanNumber(20));
        System.out.println(RomanNumber.getRomanNumber(150));
        System.out.println(RomanNumber.getRomanNumber(1000));
    }
}
