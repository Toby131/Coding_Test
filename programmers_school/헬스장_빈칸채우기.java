interface Gym {
    public int getSales(int month);
}

class Health implements Gym {
    @Override
    public int getSales(int month) {
        int totalCost = 30000 * month;

        if (month >= 3) {
            totalCost *= 0.9;
        }

        return totalCost;
    }
}

class Golf implements Gym {
    @Override
    public int getSales(int month) {
        int totalCost = 50000 * month;

        if (month >= 9) {
            totalCost *= 0.8;
        }

        return totalCost;
    }
}

class Yoga implements Gym {
    @Override
    public int getSales(int month) {
        int totalCost = 40000 * month;

        if (month >= 6) {
            totalCost *= 0.85;
        }

        return totalCost;
    }
}

class Solution {

    public int solution(int[][] registration) {
        Gym[] gym = new Gym[100];

        for (int i = 0; i < registration.length; i++) {
            if (registration[i][0] == 1) {
                gym[i] = new Health();
            }
            else if (registration[i][0] == 2) {
                gym[i] = new Golf();
            }
            else if (registration[i][0] == 3) {
                gym[i] = new Yoga();
            }
        }

        int answer = 0;
        for (int i = 0; i < registration.length; i++) {
            answer += gym[i].getSales(registration[i][1]);
        }

        return answer;
    }
}