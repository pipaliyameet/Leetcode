class Solution {
    public int nearestDrone(int[][] drones, int[] target) {

        int nearest = Integer.MAX_VALUE;
        int nearIndex = -1;
        
        for(int i = 0; i<drones.length; i++){
            int distance = Math.abs(drones[i][0] - target[0]) + Math.abs(drones[i][1] - target[1]);

            int range = drones[i][2];
            
            if(range >= distance){
                if(distance < nearest){
                    nearest = distance;
                    nearIndex = i;
                }
            }
        }

        return nearIndex;
    }
}