public class Book {
    private String  name;
    private String author;
    private double price;
    private int num_of_pages;
    Book(String name,String author,double price,int num_of_pages){
        this.name = name;
        this.author = author;
        this.price = price;
        this.num_of_pages = num_of_pages;
    }
    String getName(){
        return this.name;
    }
    String getAuthor(){
        return this.author;
    }
    double getPrice(){
        return this.price;
    }
    int getNum_of_pages(){
        return this.num_of_pages;
    }
    void setName(String name){
        this.name = name;
    }
    void setAuthor(String author){
        this.author = author;
    }
    void setPrice(double price){
        this.price = price;
    }
    void setNum_of_pages(int num_of_pages){
        this.num_of_pages = num_of_pages;
    }
    @Override
    public String toString(){
        return "Name :" + getName() + "\n"
                + "Author :" + getAuthor()+"\n"
                + "Price :" + getPrice() + "\n"
                + "Number of pages :" + getNum_of_pages() + "\n" ;
    }
}
