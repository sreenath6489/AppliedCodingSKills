class Solution {
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(toDays(date1) - toDays(date2));
    }

    private int toDays(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));

        int[] days = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        int total = 0;

        // Days from previous years
        total += 365 * year;

        // Add leap years
        total += (year - 1) / 4;
        total -= (year - 1) / 100;
        total += (year - 1) / 400;

        // Days from previous months
        for (int i = 0; i < month - 1; i++) {
            total += days[i];
        }

        // Add leap day if necessary
        if (month > 2 && isLeap(year)) {
            total++;
        }

        total += day;

        return total;
    }

    private boolean isLeap(int year) {
        return (year % 400 == 0) ||
               (year % 4 == 0 && year % 100 != 0);
    }
}