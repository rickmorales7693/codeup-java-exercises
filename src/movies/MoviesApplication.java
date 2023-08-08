package movies;

import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {
        Movie movie = new Movie();
        Input input = new Input();

//        System.out.println("Welcome to the movie app!");
        System.out.println("What would you like to do?");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the sci-fi category");
        System.out.println("6 - add a movie");
        System.out.println("7 - delete a movie");
        System.out.println("8 - edit a movie");
        System.out.println("9 - search for a movie");
        System.out.println("Enter your choice: ");
        int userChoice = input.getInt(0, 9);



        switch (userChoice){
            case 0:
                movie.exit();
                break;
            case 1:
                movie.printMovies();
                break;
            case 2:
                movie.printMovies("animated");
                break;
            case 3:
                movie.printMovies("drama");
                break;
            case 4:
                movie.printMovies("horror");
                break;
            case 5:
                movie.printMovies("scifi");
                break;
            case 6:
                movie.addMovie();
                break;
            case 7:
                movie.deleteMovie();
                break;
            case 8:
                movie.editMovie();
                break;
            case 9:
                movie.searchMovie();
                break;
        }



    }


}
