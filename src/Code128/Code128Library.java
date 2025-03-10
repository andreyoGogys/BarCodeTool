package Code128;

//всё необходимое для создания штрих кода code128


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Code128Library{
    static HashMap<String,String> code128A = new HashMap<String,String>();
    static HashMap<String,String> code128B = new HashMap<String,String>();
    static HashMap<String,String> code128C = new HashMap<String,String>();
    static char[] smallSymbol = {
        'a','b','c','d','e','f','g','h','i','j','k','l','m',
        'n','o','p','q','r','s','t','u','v','w','x','y','z'};
    char[] numbers = {'0','1','2','3','4','5','6','7','8','9'};
    String[] unicodes = {
        "1","2","3","4","5","6","7","8","9","a","b","c","d","e","f",
        "11","12","13","14","15","16","17","18","19","1a","1b","1c","1d","1e","1f"
    };
    public Code128Library(){
        code128A.put(" ","11011001100");
        code128A.put("!","11001101100");
        code128A.put("\"", "11001100110");
        code128A.put("#","10010011000");
        code128A.put("$","10010001100");
        code128A.put("%","10001001100");
        code128A.put("&","10011001000");
        code128A.put("\'","10011000100");
        code128A.put("(","10001100100");
        code128A.put(")","11001001000");
        code128A.put("*","11001000100");
        code128A.put("+","11000100100");
        code128A.put(",","10110011100");
        code128A.put("-","10011011100");
        code128A.put(".","10011001110");
        code128A.put("/","10111001100");
        code128A.put("0","10011101100");
        code128A.put("1","10011100110");
        code128A.put("2","11001110010");
        code128A.put("3","11001011100");
        code128A.put("4","11001001110");
        code128A.put("5","11011100100");
        code128A.put("6","11001110100");
        code128A.put("7","11101101110");
        code128A.put("8","11101001100");
        code128A.put("9","11100101100");
        code128A.put(":","11100100110");
        code128A.put(";","11101100100");
        code128A.put("<","11100110100");
        code128A.put("=","11100110010");
        code128A.put(">","11011011000");
        code128A.put("?","11011000110");
        code128A.put("@","11000110110");
        code128A.put("A","10100011000");
        code128A.put("B","10001011000");
        code128A.put("C","10001000110");
        code128A.put("D","10110001000");
        code128A.put("E","10001101000");
        code128A.put("F","10001100010");
        code128A.put("G","11010001000");
        code128A.put("H","11000101000");
        code128A.put("I","11000100010");
        code128A.put("J","10110111000");
        code128A.put("K","10110001110");
        code128A.put("L","10001101110");
        code128A.put("M","10111011000");
        code128A.put("N","10111000110");
        code128A.put("O","10001110110");
        code128A.put("P","11101110110");
        code128A.put("Q","11010001110");
        code128A.put("R","11000101110");
        code128A.put("S","11011101000");
        code128A.put("T","11011100010");
        code128A.put("U","11011101110");
        code128A.put("V","11101011000");
        code128A.put("W","11101000110");
        code128A.put("X","11100010110");
        code128A.put("Y","11101101000");
        code128A.put("Z","11101100010");
        code128A.put("[","11100011010");
        code128A.put(" ","11101111010");
        code128A.put("]","11001000010");
        code128A.put("^","11110001010");
        code128A.put("_","10100110000");
        code128A.put("00","10100001100");
        code128A.put("01","10010110000");
        code128A.put("02","10010000110");
        code128A.put("03","10000101100");
        code128A.put("04","10000100110");
        code128A.put("05","10110010000");
        code128A.put("06","10110000100");
        code128A.put("07","10011010000");
        code128A.put("08","10011000010");
        code128A.put("09","10000110100");
        code128A.put("0A","10000110010");
        code128A.put("0B","11000010010");
        code128A.put("0C","11001010000");
        code128A.put("00D","11110111010");
        code128A.put("0E","11000010100");
        code128A.put("0F","10001111010");
        code128A.put("10","10100111100");
        code128A.put("11","10010111100");
        code128A.put("12","10010011110");
        code128A.put("13","10111100100");
        code128A.put("14","10011110100");
        code128A.put("15","10011110010");
        code128A.put("16","11110100100");
        code128A.put("17","11110010100");
        code128A.put("18","11110010010");
        code128A.put("19","11011011110");
        code128A.put("1A","11011110110");
        code128A.put("1B","11110110110");
        code128A.put("1C","10101111000");
        code128A.put("1D","10100011110");
        code128A.put("1E","10001011110");
        code128A.put("1F","10111101000");
        code128A.put("FNC 3","10111100010");
        code128A.put("FNC 2","11110101000");
        code128A.put("Shift B","11110100010");
        code128A.put("Code C","10111011110");
        code128A.put("Code B","10111101110");
        code128A.put("FNC 4","11101011110");
        code128A.put("FNC 1","11110101110");
        code128A.put("Start Code A","11010000100");
        code128A.put("Start Code B","11010010000");
        code128A.put("Start Code C","11010011100");
        code128A.put("Stop","11000111010");
        code128A.put("Reverse Stop","11010111000");
        code128A.put("Stop pattern","1100011101011");
        code128B.put(" ","11011001100");
        code128B.put("!","11001101100");
        code128B.put("\"","11001100110");
        code128B.put("#","10010011000");
        code128B.put("$","10010001100");
        code128B.put("%","10001001100");
        code128B.put("&","10011001000");
        code128B.put("'","10011000100");
        code128B.put("(","10001100100");
        code128B.put(")","11001001000");
        code128B.put("*","11001000100");
        code128B.put("+","11000100100");
        code128B.put(",","10110011100");
        code128B.put("-","10011011100");
        code128B.put(".","10011001110");
        code128B.put("/","10111001100");
        code128B.put("0","10011101100");
        code128B.put("1","10011100110");
        code128B.put("2","11001110010");
        code128B.put("3","11001011100");
        code128B.put("4","11001001110");
        code128B.put("5","11011100100");
        code128B.put("6","11001110100");
        code128B.put("7","11101101110");
        code128B.put("8","11101001100");
        code128B.put("9","11100101100");
        code128B.put(":","11100100110");
        code128B.put(";","11101100100");
        code128B.put("<","11100110100");
        code128B.put("=","11100110010");
        code128B.put(">","11011011000");
        code128B.put("?","11011000110");
        code128B.put("@","11000110110");
        code128B.put("A","10100011000");
        code128B.put("B","10001011000");
        code128B.put("C","10001000110");
        code128B.put("D","10110001000");
        code128B.put("E","10001101000");
        code128B.put("F","10001100010");
        code128B.put("G","11010001000");
        code128B.put("H","11000101000");
        code128B.put("I","11000100010");
        code128B.put("J","10110111000");
        code128B.put("K","10110001110");
        code128B.put("L","10001101110");
        code128B.put("M","10111011000");
        code128B.put("N","10111000110");
        code128B.put("O","10001110110");
        code128B.put("P","11101110110");
        code128B.put("Q","11010001110");
        code128B.put("R","11000101110");
        code128B.put("S","11011101000");
        code128B.put("T","11011100010");
        code128B.put("U","11011101110");
        code128B.put("V","11101011000");
        code128B.put("W","11101000110");
        code128B.put("X","11100010110");
        code128B.put("Y","11101101000");
        code128B.put("Z","11101100010");
        code128B.put("[","11100011010");
        code128B.put("\"","11101111010");
        code128B.put("]","11001000010");
        code128B.put("^","11110001010");
        code128B.put("_","10100110000");
        code128B.put("`","10100001100");
        code128B.put("a","10010110000");
        code128B.put("b","10010000110");
        code128B.put("c","10000101100");
        code128B.put("d","10000100110");
        code128B.put("e","10110010000");
        code128B.put("f","10110000100");
        code128B.put("g","10011010000");
        code128B.put("h","10011000010");
        code128B.put("i","10000110100");
        code128B.put("j","10000110010");
        code128B.put("k","11000010010");
        code128B.put("l","11001010000");
        code128B.put("m","11110111010");
        code128B.put("n","11000010100");
        code128B.put("o","10001111010");
        code128B.put("p","10100111100");
        code128B.put("q","10010111100");
        code128B.put("r","10010011110");
        code128B.put("s","10111100100");
        code128B.put("t","10011110100");
        code128B.put("u","10011110010");
        code128B.put("v","11110100100");
        code128B.put("w","11110010100");
        code128B.put("x","11110010010");
        code128B.put("y","11011011110");
        code128B.put("z","11011110110");
        code128B.put("{","11110110110");
        code128B.put("|","10101111000");
        code128B.put("}","10100011110");
        code128B.put("~","10001011110");
        code128B.put("7f","10111101000");
        code128B.put("FNC 3","10111100010");
        code128B.put("FNC 2","11110101000");
        code128B.put("Shift A","11110100010");
        code128B.put("Code C","10111011110");
        code128B.put("FNC 4","10111101110");
        code128B.put("Code A","11101011110");
        code128B.put("FNC 1","11110101110");
        code128B.put("Start Code A","11010000100");
        code128B.put("Start Code B","11010010000");
        code128B.put("Start Code C","11010011100");
        code128B.put("Stop","11000111010");
        code128B.put("Reverse Stop","11010111000");
        code128B.put("Stop pattern","1100011101011");
        code128C.put("00","11011001100");
        code128C.put("01","11001101100");
        code128C.put("02","11001100110");
        code128C.put("03","10010011000");
        code128C.put("04","10010001100");
        code128C.put("05","10001001100");
        code128C.put("06","10011001000");
        code128C.put("07","10011000100");
        code128C.put("08","10001100100");
        code128C.put("09","11001001000");
        code128C.put("10","11001000100");
        code128C.put("11","11000100100");
        code128C.put("12","10110011100");
        code128C.put("13","10011011100");
        code128C.put("14","10011001110");
        code128C.put("15","10111001100");
        code128C.put("16","10011101100");
        code128C.put("17","10011100110");
        code128C.put("18","11001110010");
        code128C.put("19","11001011100");
        code128C.put("20","11001001110");
        code128C.put("21","11011100100");
        code128C.put("22","11001110100");
        code128C.put("23","11101101110");
        code128C.put("24","11101001100");
        code128C.put("25","11100101100");
        code128C.put("26","11100100110");
        code128C.put("27","11101100100");
        code128C.put("28","11100110100");
        code128C.put("29","11100110010");
        code128C.put("30","11011011000");
        code128C.put("31","11011000110");
        code128C.put("32","11000110110");
        code128C.put("33","10100011000");
        code128C.put("34","10001011000");
        code128C.put("35","10001000110");
        code128C.put("36","10110001000");
        code128C.put("37","10001101000");
        code128C.put("38","10001100010");
        code128C.put("39","11010001000");
        code128C.put("40","11000101000");
        code128C.put("41","11000100010");
        code128C.put("42","10110111000");
        code128C.put("43","10110001110");
        code128C.put("44","10001101110");
        code128C.put("45","10111011000");
        code128C.put("46","10111000110");
        code128C.put("47","10001110110");
        code128C.put("48","11101110110");
        code128C.put("49","11010001110");
        code128C.put("50","11000101110");
        code128C.put("51","11011101000");
        code128C.put("52","11011100010");
        code128C.put("53","11011101110");
        code128C.put("54","11101011000");
        code128C.put("55","11101000110");
        code128C.put("56","11100010110");
        code128C.put("57","11101101000");
        code128C.put("58","11101100010");
        code128C.put("59","11100011010");
        code128C.put("60","11101111010");
        code128C.put("61","11001000010");
        code128C.put("62","11110001010");
        code128C.put("63","10100110000");
        code128C.put("64","10100001100");
        code128C.put("65","10010110000");
        code128C.put("66","10010000110");
        code128C.put("67","10000101100");
        code128C.put("68","10000100110");
        code128C.put("69","10110010000");
        code128C.put("70","10110000100");
        code128C.put("71","10011010000");
        code128C.put("72","10011000010");
        code128C.put("73","10000110100");
        code128C.put("74","10000110010");
        code128C.put("75","11000010010");
        code128C.put("76","11001010000");
        code128C.put("77","11110111010");
        code128C.put("78","11000010100");
        code128C.put("79","10001111010");
        code128C.put("80","10100111100");
        code128C.put("81","10010111100");
        code128C.put("82","10010011110");
        code128C.put("83","10111100100");
        code128C.put("84","10011110100");
        code128C.put("85","10011110010");
        code128C.put("86","11110100100");
        code128C.put("87","11110010100");
        code128C.put("88","11110010010");
        code128C.put("89","11011011110");
        code128C.put("90","11011110110");
        code128C.put("91","11110110110");
        code128C.put("92","10101111000");
        code128C.put("93","10100011110");
        code128C.put("94","10001011110");
        code128C.put("95","10111101000");
        code128C.put("96","10111100010");
        code128C.put("97","11110101000");
        code128C.put("98","11110100010");
        code128C.put("99","10111011110");
        code128C.put("Code B","10111101110");
        code128C.put("Code A","11101011110");
        code128C.put("FNC 1","11110101110");
        code128C.put("Start Code A","11010000100");
        code128C.put("Start Code B","11010010000");
        code128C.put("Start Code C","11010011100");
        code128C.put("Stop","11000111010");
        code128C.put("Reverse Stop","11010111000");
        code128C.put("Stop pattern","1100011101011");
    }

    static boolean containtsACode(String a){
        Code128Library Code128Library = new Code128Library();
        String b = Code128Library.code128A.get(String.valueOf(a));
        boolean c=b!=null;
        return c;
    }

    static boolean containtsBCode(char a){
        Code128Library Code128Library = new Code128Library();
        String b = Code128Library.code128B.get(String.valueOf(a));
        return b != null;
    }
    
    static boolean containtsCCode(char a){
        Code128Library Code128Library = new Code128Library();
        String b = Code128Library.code128C.get(String.valueOf(a));
        boolean c=b!=null;
        return c;
    }

    static int getValueOfCharacterCode128A(String character){
        Code128Library Code128Library = new Code128Library();
        ArrayList<String> a = new ArrayList<>(Code128Library.code128A.keySet());
        String symbol = a.get(a.indexOf(character));
        int cp = symbol.codePointAt(0);
        return cp+49-32;
    }
    static int getValueOfCharacterCode128B(char character){
        Code128Library Code128Library = new Code128Library();
        ArrayList<String> a = new ArrayList<>(Code128Library.code128B.keySet());
        String symbol = a.get(a.indexOf(String.valueOf(character)));
        int cp = symbol.codePointAt(0);
        return cp-32;
    }
    static int getValueOfCharacterCode128C(String character){
        Code128Library Code128Library = new Code128Library();
        ArrayList<String> a = new ArrayList<>(Code128Library.code128B.keySet());
        return a.indexOf(character);
    }
    static String getPatternOfDigits(String checksum){
        Code128Library Code128Library = new Code128Library();
        int a = Integer.parseInt(checksum);
        checksum = String.valueOf(a);
        if(checksum.length()==1)checksum="0"+String.valueOf(checksum.charAt(0));
        String pattern = Code128Library.code128C.get(checksum);
        return pattern;
    }
    public static String getSymbolFromPattern(char type,String pattern){
        Code128Library library = new Code128Library(); 
        String symbol=null;
        switch (type) {
            case 'A':
                for(Map.Entry<String,String> entry:library.code128A.entrySet()){
                    if(entry.getValue().equals(pattern)){
                        symbol = entry.getKey();
                        break;
                    }
                }
                return symbol;

            case 'B':
                for(Map.Entry<String,String> entry:library.code128B.entrySet()){
                    if(entry.getValue().equals(pattern)){
                        symbol = entry.getKey();
                        break;
                    }
                }
                return symbol;

            case 'C':
                for(Map.Entry<String,String> entry:library.code128C.entrySet()){
                    if(entry.getValue().equals(pattern)){
                        symbol = entry.getKey();
                        break;
                    }
                }
                
                return symbol;
        
            default:
                break;
        }
        
        return symbol;
    }
}

