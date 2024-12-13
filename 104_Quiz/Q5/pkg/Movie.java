package pkg;

public class Movie{
    String movieName;
    double rating;
    int numRatings;
    int revenue;
    
    public Movie(){
        movieName = "Avengers";
        rating = 8.0;
        numRatings = 33;
        revenue = 623357910;
    }
        
    
    
    public Movie(String a, double b, int c, int d){
        movieName = a;
        rating = b;
        numRatings = c;
        revenue = d;
    }
    
    
    public void movieToString(){
        System.out.println("Movie: " + movieName);
        System.out.println("Rating: " + rating);
        System.out.println("Number of Ratings: " + numRatings);
        System.out.println("Revenue: " + revenue);
        System.out.println();
        
        return;
    }
    
    
    
    public String getMovieName(){
        return movieName;
        
    }
    
    public int getRevenue(){
        return revenue;
    }
    
    public void addRating(double rating){
        
        this.rating = (this.rating * numRatings + rating)/(this.numRatings+1);
        this.numRatings+=1;
        
        
    }
    
    public double getRating(){
        return rating;
    }
    
    public boolean compareRatings(Movie a){
        double x = a.getRating();
        double y = this.rating;
        
        if (y > x){
            return true;
        }
        else{
            return false;
        }
    }
        
    public String revenueToString(){
    
        String stringRevenue = "";
        while (revenue > 0){
            stringRevenue = ((revenue%1000) + ",") + stringRevenue;
            revenue = revenue/1000;
            
        }
        
        return stringRevenue;
       
       
    }
    
    public Movie pirateMovie(){
        movieName = this.movieName;
        rating = this.rating;
        numRatings = this.numRatings;
        revenue = this.revenue;
        return new Movie(movieName, rating, numRatings, revenue);
        
    }
    
    
    
        
}



