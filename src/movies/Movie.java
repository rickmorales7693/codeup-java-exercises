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


    public static Movie[] getMovies() {
        return movies;
    }

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







}
