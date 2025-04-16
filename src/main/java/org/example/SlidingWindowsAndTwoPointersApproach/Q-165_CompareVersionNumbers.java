class CompareVersionNumbers{
    // Time complexity: O(n)
    // Space complexity: O(1)
    // The idea is to split the version strings by '.' and compare the individual parts.
    // We split the version strings by '.' and store the parts in two arrays.
    // We iterate through the parts of both arrays and compare them.
    // If the part in version1 is less than the part in version2, we return -1.
    // If the part in version1 is greater than the part in version2, we return 1.
    // If the parts are equal, we continue to the next part.
    // If we reach the end of both arrays and all parts are equal, we return 0.
    // If we reach the end of one array and the other array has more parts, we compare the remaining parts with 0.
    // If the remaining parts are less than 0, we return -1.
    public static int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        // Compare the individual parts of the version strings
        for(int i=0;i<Math.max(v1.length,v2.length);i++){
            int num1 = i<v1.length ? Integer.parseInt(v1[i]) : 0;
            int num2 = i<v2.length ? Integer.parseInt(v2[i]) : 0;

            // If num1 is less than num2, return -1
            if(num1<num2){
                return -1;
            }
            // If num1 is greater than num2, return 1
            if(num1>num2){
                return 1;
            }
        }

        // If all parts are equal, return 0
        return 0;
    }

    // Main method to test the solution
    public static void main(String[] args) {
        // Test cases to validate the solution
        System.out.println(compareVersion("1.01", "1.001")); // Expected output: 0
        System.out.println(compareVersion("1.0", "1.0.0")); // Expected output: 0
        System.out.println(compareVersion("1.0.1", "1")); // Expected output: 1
        System.out.println(compareVersion("0.1", "1.1")); // Expected output: -1
        System.out.println(compareVersion("1.0.1", "1.0")); // Expected output: 1
    }
}