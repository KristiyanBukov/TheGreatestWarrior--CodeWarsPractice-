package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Warrior {

    private int level;
    private int experience;
    private List<String> achievements;
    private String rank;
    private static List<String> ranks;  // = Arrays.asList("Pushover", "Novice", "Fighter", "Warrior", "Veteran", "Sage", "Elite", "Conqueror", "Champion", "Master", "Greatest");
    static  {
        ranks = Arrays.asList("Pushover", "Novice", "Fighter", "Warrior", "Veteran", "Sage", "Elite", "Conqueror", "Champion", "Master", "Greatest");
    }

    public Warrior() {
        this.level = 1;
        this.experience = 100;
        this.rank = ranks.get(0);
        this.achievements = new ArrayList<>();

    }


    public int level() {
        if (this.experience > 10000) {
            this.experience = 10000;
        }
        return level;
    }

    public int experience() {
        if (this.experience > 10000)
            this.experience = 10000;
        return experience;
    }


    public String rank() {
        return rank;
    }


    public List<String> achievements() {
        return achievements;
    }


    public String battle(int enemyLevel) {

        if (!(enemyLevel >= 1 && enemyLevel <= 100))
            return "Invalid level";


        if (enemyLevel == this.level) {
            this.experience += 10;
            this.level = calculateLevel(experience);
            this.rank = ranks.get(findIndexOfRank(this.level));
            return "A good fight";
        } else if (enemyLevel + 1 == this.level) {
            this.experience += 5;
            this.level = calculateLevel(experience);
            this.rank = ranks.get(findIndexOfRank(this.level));
            return "A good fight";
        } else if (enemyLevel + 2 <= this.level) {
            return "Easy fight";
        }  else  if ((this.level + 5 <= enemyLevel) && (findIndexOfRank(this.level) < findIndexOfRank(enemyLevel))) {
        return "You've been defeated";
    }

        if (this.level < enemyLevel) {

        this.experience += 20 * (enemyLevel - this.level) * (enemyLevel - this.level);
        this.level = calculateLevel(experience);
        this.rank = ranks.get(findIndexOfRank(this.level));
        return "An intense fight";

    }
        if (this.experience > 10000) {
            this.experience = 10000;
        }

        return null;
    }

    public String training(String description, int expPoints, int minLevel) {

        if (this.level >= minLevel) {
            this.experience += expPoints;
            this.level = calculateLevel(experience);
            this.rank = ranks.get(findIndexOfRank(this.level));
           this.achievements.add(description);


            if (this.experience > 10000) {
                this.experience = 10000;
            }

            return description;
        }



        return "Not strong enough";
    }

    private static int calculateLevel(int exp) {
        if (exp >= 100 && exp < 1000)
          return exp/100;


        if (exp >= 1000 && exp < 10000)
            return exp/100;


        if (exp == 10000)
        return exp/100;

        if (exp > 10000)
            return 100;


        return -1;

    }

    private static int findIndexOfRank(int level) {
        if (level >= 1 && level < 10) {
            return 0;
        } else if (level >= 10 && level < 20) {
            return 1;
        } else if (level >= 20 && level < 30) {
            return 2;
        } else if (level >= 30 && level < 40) {
            return 3;
        } else if (level >= 40 && level < 50) {
            return 4;
        } else if (level >= 50 && level < 60) {
            return 5;
        } else if (level >= 60 && level < 70) {
            return 6;
        } else if (level >= 70 && level < 80) {
            return 7;
        } else if (level >= 80 && level < 90) {
            return 8;
        } else if (level >= 90 && level < 100) {
            return 9;
        }
        return 10;
    }


}
