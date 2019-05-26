package marathon.competitors;

public class Team {
    private String name;
    private Competitor[] competitors;
    private StringBuilder results;
    int finish = 0;

    public Team(String name, Competitor... competitors) {
        this.name = name;
        this.competitors = competitors;
        this.results = new StringBuilder();
    }
    public Competitor[] getCompetitors() {
        return competitors;
    }



    public void showResults() {
        System.out.println("Результаты команды: " + name);
        for (Competitor c : competitors)
            c.info();
        for (Competitor c : competitors)
            if(c.isOnDistance()){
        {
                if (true) finish++;
                    if (finish == 4)
                        System.out.println("Команда прошла марафон");
                    else
                        System.out.println("Команда не справилась с марафоном, пожалуйста поменяйте членов команды");
                    break;
                }
            }
        }

}


