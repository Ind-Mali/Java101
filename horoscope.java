import java.util.Scanner;

public class horoscope {
    public static void main(String[] args) {
        // Create variables
        int month, day;

        // take the value from keybord

        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter your month of birthday  as a number between 1 and 12: ");
        month = inp.nextInt();

        System.out.print("Please enter your day of birthday between 1 and 31: ");
        day = inp.nextInt();

        /** I do not like this code but Patika.dev gives us to learn if statements. 
         * There are lots of if statements and this is not good to see. 
        */


        if ((month >= 1) || (month <= 12)) {
            if (month == 1) {
                if ((day >= 1) && (day <= 31)) {
                    if (day >= 22) {
                        System.out.println("Your horoscope is : Aquarius");
                    } else {
                        System.out.println("Your horoscope is : Capricorn");
                    }
                } else {
                    System.out.print("Out of number for day!!! Please enter valid number");
                }
            } else if (month == 2) {
                if ((day >= 1) && (day <= 28)) {
                    if (day >= 20) {
                        System.out.println("Your horoscope is : Pisces");
                    } else {
                        System.out.println("Your horoscope is : Aquarius");
                    }
                } else {
                    System.out.print("Out of number for day!!! Please enter valid number");
                }
            } else if (month == 3) {
                if ((day >= 1) && (day <= 31)) {
                    if (day >= 21) {
                        System.out.println("Your horoscope is : Aries");
                    } else {
                        System.out.println("Your horoscope is : Pisces");
                    }
                } else {
                    System.out.print("Out of number for day!!! Please enter valid number");
                }
            } else if (month == 4) {
                if ((day >= 1) && (day <= 30)) {
                    if (day >= 21) {
                        System.out.println("Your horoscope is : Taurus");
                    } else {
                        System.out.println("Your horoscope is : Aries");
                    }
                } else {
                    System.out.print("Out of number for day!!! Please enter valid number");
                }
            }else if (month == 5) {
                if ((day >= 1) && (day <= 31)) {
                    if (day >= 22) {
                        System.out.println("Your horoscope is : Gemini");
                    } else {
                        System.out.println("Your horoscope is : Taurus");
                    }
                } else {
                    System.out.print("Out of number for day!!! Please enter valid number");
                }
            }else if (month == 6) {
                if ((day >= 1) && (day <= 30)) {
                    if (day >= 23) {
                        System.out.println("Your horoscope is : Cancer");
                    } else {
                        System.out.println("Your horoscope is : Gemini");
                    }
                } else {
                    System.out.print("Out of number for day!!! Please enter valid number");
                }
            }else if (month == 7) {
                if ((day >= 1) && (day <= 31)) {
                    if (day >= 23) {
                        System.out.println("Your horoscope is : Leo");
                    } else {
                        System.out.println("Your horoscope is : Cancer");
                    }
                } else {
                    System.out.print("Out of number for day!!! Please enter valid number");
                }
            }else if (month == 8) {
                if ((day >= 1) && (day <= 31)) {
                    if (day >= 23) {
                        System.out.println("Your horoscope is : Virgo");
                    } else {
                        System.out.println("Your horoscope is : Leo");
                    }
                } else {
                    System.out.print("Out of number for day!!! Please enter valid number");
                }
            }else if (month == 9) {
                if ((day >= 1) && (day <= 30)) {
                    if (day >= 23) {
                        System.out.println("Your horoscope is : Libra");
                    } else {
                        System.out.println("Your horoscope is : Virgo");
                    }
                } else {
                    System.out.print("Out of number for day!!! Please enter valid number");
                }
            }else if (month == 10) {
                if ((day >= 1) && (day <= 31)) {
                    if (day >= 23) {
                        System.out.println("Your horoscope is : Scorpio");
                    } else {
                        System.out.println("Your horoscope is : Libra");
                    }
                } else {
                    System.out.print("Out of number for day!!! Please enter valid number");
                }
            }else if (month == 11) {
                if ((day >= 1) && (day <= 30)) {
                    if (day >= 22) {
                        System.out.println("Your horoscope is : Sagittarius");
                    } else {
                        System.out.println("Your horoscope is : Scorpio");
                    }
                } else {
                    System.out.print("Out of number for day!!! Please enter valid number");
                }
            }else{
                if ((day >= 1) && (day <= 31)) {
                    if (day >= 22) {
                        System.out.println("Your horoscope is : Capricorn");
                    } else {
                        System.out.println("Your horoscope is : Sagittarius");
                    }
                } else {
                    System.out.print("Out of number for day!!! Please enter valid number");
                }
            }
        } else {
            System.out.println("Out of number for month! Please restart app and enter valid number");
        }
    }
}
