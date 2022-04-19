package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {

        boolean running = true;

        while (running) {
            printMenu();
            int userChoice = Input.getInt(0, 5);
            running = executeUserChoice(userChoice);
        }
    }
        
    public static void printMenu() {
        System.out.println("What would you like to do?");

        System.out.println("0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n");
    }

    public static void printMovieByCategory(Movie[] movies, String category){
        for (Movie movie : movies) {
            if (movie.getCategory().equalsIgnoreCase(category)) {
                System.out.println(movie.getName() + "--" + movie.getCategory());
            }
        }
    }
        
    public static void printAllMovies(Movie[] movies) {
        for (Movie movie : movies) {
            System.out.println(movie.getName() + "--" + movie.getCategory());
        }
    }
        
    public static boolean executeUserChoice(int userChoice) {
        switch (userChoice) {
            case 0:
                System.out.println("See ya!");
                return false;
            case 1:
                printAllMovies(MoviesArray.findAll());
                break;
            case 2:
                printMovieByCategory(MoviesArray.findAll(), "animated");
                break;
            case 3:
                printMovieByCategory(MoviesArray.findAll(), "drama");
                break;
            case 4:
                printMovieByCategory(MoviesArray.findAll(), "horror");
                break;
            case 5:
                printMovieByCategory(MoviesArray.findAll(), "scifi");
                break;
        }
         return true;   
    }
}
