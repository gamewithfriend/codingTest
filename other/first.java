class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        for(int i=0; i<schedules.length; i++){
            for(int j=0; j<7; j++){
                if(timelogs[i][j] > addMinutes(schedules[i], 10) ){
                    if((startday + j - 1) % 7 + 1 <= 5){
                        break;
                    }
                }

                if(j == 6){
                    answer = answer +1;
                }

            }
        }
        return answer;
    }

    private int addMinutes(int time, int minutes) {
        int hour = time / 100;
        int min = time % 100;

        min += minutes;
        if(min >= 60) {
            hour += min / 60;
            min = min % 60;
        }

        return hour * 100 + min;
    }
}