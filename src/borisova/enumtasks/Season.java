package borisova.enumtasks;

public enum Season {
    Winter,
    Spring,
    Summer,
    Autunm;

    public Season defineSeason(Months month){
        switch (month){
            case December:
            case January:
            case February:
                return Season.Winter;
            case March:
            case April:
            case May:
                return Season.Spring;
            case June:
            case July:
            case August:
                return Season.Summer;
            case November:
            case October:
            case September:
                return Season.Autunm;
        }
        return null;
    }
}

