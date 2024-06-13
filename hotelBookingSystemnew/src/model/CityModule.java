package model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CityModule {
    private static final Map<String, List<String>> stateCitiesMap = new HashMap<>();

    static {
        stateCitiesMap.put("Andaman and Nicobar Islands", List.of("Port Blair", "South Andaman", "North Andaman", "Middle Andaman", "Little Andaman", "Car Nicobar", "Nancowry", "Great Nicobar"));
        stateCitiesMap.put("Andhra Pradesh", List.of("Visakhapatnam", "Vijayawada", "Guntur", "Nellore", "Kurnool", "Rajahmundry", "Tirupati", "Kakinada", "Anantapur", "Vizianagaram", "Tenali"));
        stateCitiesMap.put("Arunachal Pradesh", List.of("Itanagar", "Tawang", "Ziro", "Naharlagun", "Bomdila", "Along", "Pasighat", "Roing", "Tezu", "Namsai"));
        stateCitiesMap.put("Assam", List.of("Guwahati", "Silchar", "Dibrugarh", "Jorhat", "Nagaon", "Tinsukia", "Tezpur", "Karimganj", "Hailakandi", "Bongaigaon", "Dhubri"));
        stateCitiesMap.put("Bihar", List.of("Patna", "Gaya", "Bhagalpur", "Muzaffarpur", "Purnia", "Darbhanga", "Bihar Sharif", "Arrah", "Begusarai", "Katihar", "Munger"));
        stateCitiesMap.put("Chandigarh", List.of("Chandigarh"));
        stateCitiesMap.put("Chhattisgarh", List.of("Raipur", "Bhilai", "Korba", "Bilaspur", "Durg", "Rajnandgaon", "Raigarh", "Jagdalpur", "Ambikapur", "Chirmiri", "Dhamtari"));
        stateCitiesMap.put("Dadra and Nagar Haveli and Daman and Diu", List.of("Daman", "Diu", "Silvassa"));
        stateCitiesMap.put("Delhi", List.of("New Delhi", "Delhi", "Noida", "Gurugram", "Faridabad", "Ghaziabad"));
        stateCitiesMap.put("Goa", List.of("Panaji", "Margao", "Vasco da Gama", "Mapusa", "Ponda", "Bicholim", "Curchorem", "Sanquelim", "Cuncolim", "Valpoi"));
        stateCitiesMap.put("Gujarat", List.of("Ahmedabad", "Surat", "Vadodara", "Rajkot", "Bhavnagar", "Jamnagar", "Junagadh", "Gandhinagar", "Gandhidham", "Nadiad", "Anand"));
        stateCitiesMap.put("Haryana", List.of("Faridabad", "Gurgaon", "Panipat", "Ambala", "Hisar", "Karnal", "Sonipat", "Yamunanagar", "Rohtak", "Panchkula", "Bhiwani"));
        stateCitiesMap.put("Himachal Pradesh", List.of("Shimla", "Mandi", "Solan", "Dharamshala", "Palampur", "Hamirpur", "Kullu", "Nahan", "Chamba", "Una"));
        stateCitiesMap.put("Jammu and Kashmir", List.of("Srinagar", "Jammu", "Anantnag", "Baramulla", "Kathua", "Rajouri", "Pulwama", "Kupwara", "Udhampur", "Ganderbal"));
        stateCitiesMap.put("Jharkhand", List.of("Ranchi", "Jamshedpur", "Dhanbad", "Bokaro Steel City", "Deoghar", "Hazaribagh", "Dumka", "Giridih", "Koderma", "Chatra", "Gumla"));
        stateCitiesMap.put("Karnataka", List.of("Bangalore", "Mysore", "Hubli", "Mangalore", "Belgaum", "Davanagere", "Bellary", "Shimoga", "Tumkur", "Udupi", "Gulbarga"));
        stateCitiesMap.put("Kerala", List.of("Thiruvananthapuram", "Kochi", "Kozhikode", "Kollam", "Thrissur", "Kannur", "Alappuzha", "Palakkad", "Malappuram", "Pathanamthitta"));
        stateCitiesMap.put("Ladakh", List.of("Leh", "Kargil"));
        stateCitiesMap.put("Lakshadweep", List.of("Kavaratti", "Agatti", "Amini", "Andrott", "Kalpeni", "Minicoy"));
        stateCitiesMap.put("Madhya Pradesh", List.of("Bhopal", "Indore", "Jabalpur", "Gwalior", "Ujjain", "Sagar", "Dewas", "Satna", "Ratlam", "Rewa", "Morena"));
        stateCitiesMap.put("Maharashtra", List.of("Mumbai", "Pune", "Nagpur", "Thane", "Nashik", "Kalyan-Dombivli", "Vasai-Virar", "Aurangabad", "Navi Mumbai", "Solapur", "Mira-Bhayandar"));
        stateCitiesMap.put("Manipur", List.of("Imphal", "Thoubal", "Kakching", "Ukhrul", "Churachandpur", "Bishnupur", "Senapati", "Tamenglong", "Jiribam", "Kangpokpi"));
        stateCitiesMap.put("Meghalaya", List.of("Shillong", "Tura", "Jowai", "Nongstoin", "Baghmara", "Williamnagar", "Nongpoh", "Resubelpara", "Khliehriat", "Mairang"));
        stateCitiesMap.put("Mizoram", List.of("Aizawl", "Lunglei", "Saiha", "Champhai", "Serchhip", "Kolasib", "Lawngtlai", "Mamit", "Saitual", "Hnahthial"));
        stateCitiesMap.put("Nagaland", List.of("Kohima", "Dimapur", "Mokokchung", "Tuens"));
    }

    public static List<String> getCitiesByStateName(String stateName) {
        return stateCitiesMap.getOrDefault(stateName, List.of());
    }
}
