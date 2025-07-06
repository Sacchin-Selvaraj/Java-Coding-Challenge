package Contest;

import java.util.*;
import java.util.stream.Collectors;

public class CouponValidator {

    public static List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
//        Map<String,String> map=new TreeMap<>();
//        for (int i = 0; i < code.length; i++) {
//            if (isActive[i] && isValids(code[i],businessLine[i])){
//                map.put(businessLine[i],code[i]);
//            }
//        }
//
//        return map.values().stream().toList();
//    }
//
//    private static boolean isValids(String code, String business) {
//        for (int i = 0; i < code.length(); i++) {
//            if ( code.charAt(i)=='_'){
//               continue;
//            }else if (!Character.isLetterOrDigit(code.charAt(i))){
//                return false;
//            }
//        }
//       return !business.equals("invalid");
//    }
        Map<String, Integer> businessPriority = new HashMap<>();
        businessPriority.put("electronics", 0);
        businessPriority.put("grocery", 1);
        businessPriority.put("pharmacy", 2);
        businessPriority.put("restaurant", 3);

        // Collect valid coupons
        List<Coupon> validCoupons = new ArrayList<>();
        for (int i = 0; i < code.length; i++) {
            if (isActive[i] && isValid(code[i], businessLine[i], businessPriority)) {
                validCoupons.add(new Coupon(code[i], businessLine[i]));
            }
        }

        // Sort according to requirements
        validCoupons.sort(Comparator
                .comparingInt((Coupon c) -> businessPriority.get(c.businessLine))
                .thenComparing(c -> c.code));

        return validCoupons.stream().map(c -> c.code).collect(Collectors.toList());
    }

    private static boolean isValid(String code, String business, Map<String, Integer> businessPriority) {
        // Check code validity
        if (code == null || code.isEmpty()) {
            return false;
        }

        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if (!Character.isLetterOrDigit(c) && c != '_') {
                return false;
            }
        }

        // Check business line validity
        return businessPriority.containsKey(business);
    }

    static class Coupon {
        String code;
        String businessLine;

        Coupon(String code, String businessLine) {
            this.code = code;
            this.businessLine = businessLine;
        }
    }

    public static void main(String[] args) {
        String[] code={"GROCERY15","ELECTRONICS_50","DISCOUNT10"};
        String[] businessLine={"grocery","electronics","invalid"};
        boolean[] isActive={false,true,true};
        System.out.println(validateCoupons(code,businessLine,isActive));
    }
}
