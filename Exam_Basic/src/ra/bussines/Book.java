package ra.bussines;

import java.util.Scanner;

public class Book {
    private int bookId;
    private String bookName;
    private String author;
    private String descriptions;
    private double importPrice;
    private double exportPrice;
    private double interrest;
    private boolean bookStatus = true;

    public Book() {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.descriptions = descriptions;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
//        this.interrest = interrest;
        this.bookStatus = bookStatus;




    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public double getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(double importPrice) {
        this.importPrice = importPrice;
    }

    public double getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(double exportPrice) {
        this.exportPrice = exportPrice;
    }

    public double getInterrest() {
        return interrest;
    }

    public void setInterrest(double interrest) {
        this.interrest = interrest;
    }

    public boolean isBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }

// inputData()
    public void inputData(Scanner scanner, Book[] books){
        System.out.println("Nhập mã sách : " );
        bookId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sách : "  );
        bookName = scanner.nextLine();
        System.out.println("Nhập tên tác giả : " );
        author = scanner.nextLine();
        System.out.println("Mô tả về sách : ");
        descriptions= scanner.nextLine();
        System.out.println("Nhập giá nhập : ");
        importPrice=Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập giá xuất : ");
        exportPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("Trạng thái SP : ");
        bookStatus = Boolean.parseBoolean((scanner.nextLine()));


    }

    //displayData()
    public void displayData(){
        System.out.println("Book : {"
                +"Mã Id:" + bookId
                +" Tên sách :" + bookName
                +" Tên tác giả :"+ author
                +" Mô tả về sách :" + descriptions
                + " Giá nhập :" + importPrice
                + " Giá xuất :" + exportPrice
                + " Trạng thái SP" +(bookStatus? " Đang bán":" Không bán")


        );
        System.out.println("=============================================================================================");
    }
    public void interest(){interrest = exportPrice - importPrice;}


}

