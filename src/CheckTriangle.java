public class CheckTriangle {

    public static String CheckTriangle(int side1, int side2, int side3){
        String result = "";
        if (side1 == side3 && side2 == side3){
            result += "tam giác đều";
        }else if (side2 < side3 && side1 == side2)
            result += "tam giác cân";
        else if (side1 < side2 && side2 < side3)
            result += "tam giác thường";
        else
            result += "không phải tam giác";
        return result;
    }

    public static void main(String[] args) {
        System.out.println(CheckTriangle(8, 2, 3));
    }
}