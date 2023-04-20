package borisova.interfacetask;

public class Book implements Comparable<Book>{
    String name;
    String author;
    int countOfPages;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public String getAuthor(){
        return this.author;
    }
    public void setCountOfPages(int countOfPages){
        this.countOfPages=countOfPages;
    }
    public int getCountOfPages(){
        return this.countOfPages;
    }

    public Book(String name, String author, int countOfPages) {
        this.name = name;
        this.author = author;
        this.countOfPages = countOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", countOfPages=" + countOfPages +
                '}';
    }

    @Override
    public int compareTo(Book book) {
        int differenceName=this.name.compareTo(book.name);
        int differenceAuthor=this.author.compareTo(book.author);
        int differencePages=this.countOfPages-book.countOfPages;

        if(differencePages!=0){
            return differencePages;
        }
        return differenceAuthor & differenceName;
    }

}
