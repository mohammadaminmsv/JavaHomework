package Test.model.Book;

public class Book {
    private String nameB;
    private String writer;
    private String publisher;
    private String circulation;
    private int published_year;
    private String type;
    private int layout;
    private int price;
    private int dateofIN;
    private int code;
    private String nameofresponsible;


    public Book(){};

    public Book(String nameB, String writer, String publisher, String circulation, int published_year, String type, int layout, int price, int dateofIN, int code, String nameofresponsible) {
        this.nameB = nameB;
        this.writer = writer;
        this.publisher = publisher;
        this.circulation = circulation;
        this.published_year = published_year;
        this.type = type;
        this.layout = layout;
        this.price = price;
        this.dateofIN = dateofIN;
        this.code = code;
        this.nameofresponsible = nameofresponsible;
    }



    @Override
    public  String toString() {
        return "Book{" +
                "nameB='" + nameB + '\'' +
                ", writer='" + writer + '\'' +
                ", publisher='" + publisher + '\'' +
                ", circulation='" + circulation + '\'' +
                ", published_year=" + published_year +
                ", type='" + type + '\'' +
                ", layout=" + layout +
                ", price=" + price +
                ", dateofIN=" + dateofIN +
                ", code=" + code +
                ", nameofresponsible='" + nameofresponsible + '\'' +
                '}';
    }

    public String getNameB() {
        return nameB;
    }

    public Book setNameB(String nameB) {
        this.nameB = nameB;
        return this;
    }

    public String getWriter() {
        return writer;
    }

    public Book setWriter(String writer) {
        this.writer = writer;
        return this;
    }

    public String getPublisher() {
        return publisher;
    }

    public Book setPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    public String getCirculation() {
        return circulation;
    }

    public Book setCirculation(String circulation) {
        this.circulation = circulation;
        return this;
    }

    public int getPublished_year() {
        return published_year;
    }

    public Book setPublished_year(int published_year) {
        this.published_year = published_year;
        return this;
    }

    public String getType() {
        return type;
    }

    public Book setType(String type) {
        this.type = type;
        return this;
    }

    public int getLayout() {
        return layout;
    }

    public Book setLayout(int layout) {
        this.layout = layout;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public Book setPrice(int price) {
        this.price = price;
        return this;
    }

    public int getDateofIN() {
        return dateofIN;
    }

    public Book setDateofIN(int dateofIN) {
        this.dateofIN = dateofIN;
        return this;
    }

    public int getCode() {
        return code;
    }

    public Book setCode(int code) {
        this.code = code;
        return this;
    }

    public String getNameofresponsible() {
        return nameofresponsible;
    }

    public Book setNameofresponsible(String nameofresponsible) {
        this.nameofresponsible = nameofresponsible;
        return this;
    }
}
