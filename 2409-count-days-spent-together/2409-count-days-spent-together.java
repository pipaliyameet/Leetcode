class Solution {

    private int getDay(String date, int[] lastDates) {
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));

        return (month == 1 ? 0 : lastDates[month - 2]) + day;
    }

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        
        int lastDates[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for(int i =1; i < 12; i++){
            lastDates[i] += lastDates[i-1];
        }

        int as = getDay(arriveAlice, lastDates);
        int ae = getDay(leaveAlice, lastDates);
        int bs = getDay(arriveBob, lastDates);
        int be = getDay(leaveBob, lastDates);

        int ans = Math.min(ae, be) - Math.max(as, bs) + 1;

        return Math.max(0, ans);
    }
}