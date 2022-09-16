class Ex01TruthMarcelo {
  public static int hours(int time) {
    int timeHours = time/60;
    return timeHours;
  }
  public static int minutes(int time) {
    int timeMinutes = time%60;
    return timeMinutes;
  }
  public static void main(String[] args) {
    String cl1 = "Computer Science";
    int cl1st = 7*60+30; //in minutes since 12 midnight
    int cl1en = 9*60;
    
    String cl2 = "English";
    int cl2st = 11*60+30;
    int cl2en = 12*60+15;
    
    String cl3 = "Social Science";
    int cl3st = (12+2)*60+45;
    int cl3en = (12+4)*60+15;
    
    System.out.printf("Class 1\n");
    System.out.printf("Name: %s\n", cl1);
    System.out.printf("Start time: %d:%d\n", hours(cl1st), minutes(cl1st));
    System.out.printf("End time: %d:%d\n\n", hours(cl1en), minutes(cl1en));

    System.out.printf("Class 2\n");
    System.out.printf("Name: %s\n", cl2);
    System.out.printf("Start time: %d:%d\n", hours(cl2st), minutes(cl2st));
    System.out.printf("End time: %d:%d\n\n", hours(cl2en), minutes(cl2en));
    
    System.out.printf("Class 3\n");
    System.out.printf("Name: %s\n", cl3);
    System.out.printf("Start time: %d:%d\n", hours(cl3st), minutes(cl3st));
    System.out.printf("End time: %d:%d\n\n", hours(cl3en), minutes(cl3en));

    System.out.printf("Duration of Class 1: %d minutes\n", cl1en-cl1st);
    System.out.printf("Class 2 is longer than Class 3: %b\n", cl2en-cl2st > cl3en-cl3st);
    System.out.printf("Difference between start of Class 3 and start of Class 1: %d minutes\n", cl3st-cl1st);
  }
}
