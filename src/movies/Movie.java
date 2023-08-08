package movies;

import java.util.Scanner;

public class Movie {
    private Scanner scanner;
    public Movie() {
        this.scanner = new Scanner(System.in);
    }

    private static Movie[] movies = MoviesArray.findAll();

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    private String name;
    private String category;


    public static void setMovies(Movie[] movies) {
        Movie.movies = movies;
    }

    public String getName() {
        return name;
    }

    public String getCategory(){
        return category;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public void printMovies(){
        for (Movie movie : movies){
            System.out.println(movie.getName() + " -- " + movie.getCategory());
        }
    }

    public void printMovies(String category){
        for (Movie movie : movies){
            if (movie.getCategory().equalsIgnoreCase(category)){
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

    public void addMovie(){
        System.out.println("Enter the name of the movie: ");
        String name = scanner.nextLine();
        System.out.println("Enter the category of the movie: ");
        String category = scanner.nextLine();
        Movie newMovie = new Movie(name, category);
    }

    public void deleteMovie(){
        System.out.println("Enter the name of the movie you would like to delete: ");
        String name = scanner.nextLine();
        System.out.println("Enter the category of the movie you would like to delete: ");
        String category = scanner.nextLine();
        Movie newMovie = new Movie(name, category);
    }

    public void editMovie(){
        System.out.println("Enter the name of the movie you would like to edit: ");
        String name = scanner.nextLine();
        System.out.println("Enter the category of the movie you would like to edit: ");
        String category = scanner.nextLine();
        Movie newMovie = new Movie(name, category);
    }

    public void searchMovie(){
        System.out.println("Enter the name of the movie you would like to search for: ");
        String name = scanner.nextLine();
        System.out.println("Enter the category of the movie you would like to search for: ");
        String category = scanner.nextLine();
        Movie newMovie = new Movie(name, category);
    }

    public void exit(){
        System.out.println("Goodbye!");
    }

    public void manageMovies() {
        Movie movie = new Movie();
        boolean keepRunning = true;
        while (keepRunning) {
            displayMenu();
            int userInput = scanner.nextInt();
            scanner.nextLine();

            switch (userInput){
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

    private void displayMenu() {
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
        System.out.print("Enter your choice: ");
    }



}
