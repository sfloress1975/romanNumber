public class RomanNumber {

    public static String getRomanNumber(Integer number) {

        if (number < 10) {
            return RomanNumber.getLessThanTen(number);
        } else if ( number >= 10 && number < 20 ) {
            return "X" + getLessThanTen(number - 10);
        } else if ( number >= 20 && number < 30 ) {
            return "XX" + getLessThanTen(number - 20);
        } else if ( number >= 30 && number < 40 ) {
            return "XXX" + getLessThanTen(number - 30);
        } else if ( number >= 40 && number < 50 ) {
            return "XL" + getLessThanTen(number - 40);
        } else if ( number >= 50 && number < 60 ) {
            return "L" + getLessThanTen(number - 50);
        } else if ( number >= 60 && number < 70 ) {
            return "LX" + getLessThanTen(number - 60);
        } else if ( number >= 70 && number < 80 ) {
            return "LXX" + getLessThanTen(number - 70);
        } else if ( number >= 80 && number < 90 ) {
            return "LXXX" + getLessThanTen(number - 80);
        }  else if ( number >= 90 && number < 100 ) {
            return "XC" + getLessThanTen(number - 90);
        } else if ( number == 100 ) {
            return "C";
        }


        return "not defined";
    }

    private static String getLessThanTen(Integer number) {
        switch(number) {
            case 1: return "I";
            case 2: return "II";
            case 3: return "III";
            case 4: return "IV";
            case 5: return "V";
            case 6: return "VI";
            case 7: return "VII";
            case 8: return "VIII";
            case 9: return "IX";
            default: return "";
        }
    }

    public static void main(String[] args) {
        System.out.println(RomanNumber.getRomanNumber(74));
        System.out.println(RomanNumber.getRomanNumber(99));
        System.out.println(RomanNumber.getRomanNumber(28));
        System.out.println(RomanNumber.getRomanNumber(19));
    }
}
