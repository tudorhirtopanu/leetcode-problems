
// 2469. Convert the Temperature

public class ConvertTheTemperature {

public static void main(String[] args) {
		
		Solution solution = new Solution();
		
		// Example celsiusArray (you should use your actual data)
        double celsius = 122.11;

        // Call the convertTemperature method and store the result
        double[] result = solution.convertTemperature(celsius);
        
        
        // Print the result
        for (double temperature : result) {
        	System.out.println(temperature);
        }
	}

}

class Solution {
    public double[] convertTemperature(double celsius) {
        
        double kelvin = celsius + 273.15;
        double farenheit = (celsius * 1.8) + 32;

        double[] ans = {kelvin, farenheit};
        
        return ans;
    }
}
