package base;

import java.util.Map;

public class GlobalTestData {
    public static String GLOBAL_CUSTOMER_FIRST_NAME;
    public static String GLOBAL_CUSTOMER_LAST_NAME;
    public static String GLOBAL_ALT_CUSTOMER_FIRST_NAME;
    public static String GLOBAL_ALT_CUSTOMER_LAST_NAME;
    public static String GLOBAL_CUSTOMER_EMAIL;
    public static String GLOBAL_EXISTING_CUSTOMER_EMAIL;
    public static String GLOBAL_CUSTOMER_PASSWORD = "Test$1234";
    public static String GLOBAL_CUSTOMER_DIFFERENT_PASSWORD = "QA12345";
    public static String GLOBAL_CUSTOMER_BRAND_NEW_EMAIL;
    public static String GLOBAL_CUSTOMER_BRAND_NEW_EMAIL_USER_ID;
    public static String GLOBAL_CUSTOMER_BRAND_NEW_EMAIL_DOMAIN;
    public static String GLOBAL_CUSTOMER_PHONE_NUMBER = "(213) 621 0002";
    public static String GLOBAL_KLARNA_SSN_INPUT = "1111";
    public static String GLOBAL_KLARNA_SSN_DOB = "12/12/1990";
    
    public static String[] GLOBAL_STATES_INSEARCHORDER = {"NY", "NJ", "CA", "TX", "HI"};
    public static Map<String, String> ZIPCODES = Map.of("NY","11416", "NJ", "08048", "CA", "94111", "TX", "75023", "HI", "96816");
    public static Map<String, String> ADDRESS = Map.of("NY","97-30 80TH STREET", "NJ", "36 Amaryllis Ln", "CA", "52 California Street", "TX", "1104 Cherokee Trl", "HI", "1252 Arron Smith Drive");
    public static Map<String, String> CITY = Map.of("NY","QUEENS", "NJ", "Lumberton", "CA", "San Francisco", "TX", "PLANO", "HI", "HONOLULU");
    public static Map<String, String> STATE = Map.of("NY","NEW YORK", "NJ", "NEW JERSEY", "CA", "CALIFORNIA", "TX", "TEXAS", "HI", "HAWAII");
    public static Map<String, String> ALTERNATE_ADDRESS = Map.of("NY","76-40 170th St", "NJ", "101 Stonebrook Dr", "CA", "511 1/2 Capp St", "TX", "920 Cross Bend Rd", "HI", "801 Kaheka St");
    
   
    // Product
    public static String OMV_Subscription;
    public static String OMV_Non_Subscription;
    public static String OMD_HE_Innovel;
    public static String OMD_HE_Non_Innovel;
    public static String OMD_HA_Innovel;
    public static String OMD_HA_Non_Innovel;
    public static String OMD_KLARNA;
    public static String VISA_CARD_NO;
    public static String VISA_EXP_NO;
    public static String VISA_CVV;
    public static String MASTER_CARD_NO;
    public static String MASTER_EXP_NO;
    public static String MASTER_CVV;
    public static String AMEX_CARD_NO;
    public static String AMEX_EXP_NO;
    public static String AMEX_CVV;
    public static String OMV_Non_Subscription_With_Accessories;
    public static String HA_OMD_KLARNA;
    public static String HE_OMD_KLARNA;

    //PromoCode
    public static String PROMO_CODE = "SPRINGS";


}
