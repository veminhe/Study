import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Objects;

public class DecimalTest {
    public static void main(String[] args) {
        BigDecimal value = new BigDecimal(2.13);
        BigDecimal valueNew = new BigDecimal(2.13);
        if(compare(value, valueNew)==0){
            System.out.println("ggggg");
        }
//        if(value!=null && valueNew!=null){
//            if(value.compareTo(valueNew)==0){
//                System.out.println("aaaaaa");
//            }
//            if(value==valueNew){
//                System.out.println("bbbbb");
//            }
//        }
//        BigDecimal value = new BigDecimal(2.13);
//        BigDecimal bd = new BigDecimal(10000.0000);
//        value = value.multiply(bd);
//        System.out.println(value);
        //Integer month = null;
//        int aa = month;
//        System.out.println(aa);

//        Integer month22 = 2;
//        System.out.println(2==month22);
//        System.out.println(2==month);
//        Calendar calendar = Calendar.getInstance();
//        int year = calendar.get(Calendar.YEAR);
//        int month = calendar.get(Calendar.MONTH)+1;
//        System.out.println(year);
//        System.out.println(month);
        //BigDecimal num1 = new BigDecimal(0.005);
        //BigDecimal num2 = new BigDecimal(1000000);
        //num1 = num1.add(num2);
        //System.out.println(num1);
        /**BigDecimal dealPrice = new BigDecimal(1);
        BigDecimal dealBuildingArea = new BigDecimal(3);
        if (!Objects.isNull(dealPrice) && !Objects.isNull(dealBuildingArea)) {
            BigDecimal dealUnitPrice =
                    divideMethod(dealPrice, dealBuildingArea).setScale(2, BigDecimal.ROUND_HALF_UP);
            System.out.println(dealUnitPrice);
        }*/
    }

    public static int compare(BigDecimal d1,BigDecimal d2) {
        if (d1 == null){
            d1 = BigDecimal.ZERO;
        }
        if (d2 == null){
            d2 = BigDecimal.ZERO;
        }
        if (d1.compareTo(d2) > 0){
            return 1;
        }
        if (d1.compareTo(d2) == 0){
            return 0;
        }
        return -1;
    }

    private static BigDecimal divideMethod(BigDecimal obj1, BigDecimal obj2){
        if(null==obj1 || null==obj2 || obj2.compareTo(BigDecimal.ZERO)==0){
            return BigDecimal.ZERO;
        }
        return obj1.divide(obj2);
    }
}
