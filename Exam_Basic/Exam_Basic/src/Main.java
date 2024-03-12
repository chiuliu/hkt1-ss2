import ra.bussines.Book;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    private static final Book[] books = new Book[100];

    static int choise;
    static int bookCount = 0;
    private static int bookID;

    public static void main(String[] args) {
        while (true) {
            System.out.println(
                    "1.Nhập số lượng sách thêm mới và nhập thông tin cho từng cuốn sách.\n" +
                            "2.Hiển thị thông tin tất cả sản phẩm sạch trong thư viện.\n" +
                            "3. Sắp xếp sách theo lợi nhuận tăng dần\n" +
                            "4. Xóa sách theo mã sách\n" +
                            "5. Tìm kiếm tương đối sách theo tên sách hoặc mô tả\n" +
                            "6. Thay đổi thông tin theo mã sách \n" +
                            "7. Thoát."
            );
            System.out.println("Moi lua chon");
            choise = Integer.parseInt(scanner.nextLine());

            switch (choise) {
                case 1:
                    System.out.println("Mời bạn nhập số lượng sách muốn thêm : ");
                    int creatBook = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < creatBook; i++) {
                        System.out.println("Mời bạn nhập số lượng sách thứ :" + (i + 1));
                        Book newBook = new Book();
                        newBook.inputData(scanner, books);
                        books[bookCount] = newBook;
                        bookCount++;
                        bookID++;

                    }
                    break;
                case 2:
                    if (bookCount <= 0){
                        System.out.println("Hiện không có mục sách nào hiển thị");
                        break;
                    }
                    for (int i = 0; i < bookCount; i++){
                        books[i] .displayData();
                    }
                    break;
                case 3:
                    if (bookCount <= 0) {
                        System.out.println("Hiện không có mục sách nào hiển thị");
                        break;
                    }

                    for (int i = 0; i < bookCount -1; i++){
                        Book arrange = books[i];
                        for (int j = i + 1; j < bookCount ; j++) {
                            if (arrange.getInterrest() > books[j+1].getInterrest()){
                                books[j-1] = books[j];
                                books[j] = arrange;
                            }
                            else {
                                books[j-1] = books[j];
                            }

                        }


                    }
                    for (Book p : books){
                        p.displayData();
                    }
                    break;
                case 4:

                    System.out.println("Mời bạn nhập ID của sách muốn xóa :");
                    int deleteNum = Integer.parseInt(scanner.nextLine());

                    boolean isExit = false;
                    for (int i = 0; i < bookCount; i++) {
                        if (books[i].getBookId() == deleteNum) {
                            for (int j = i; j < bookCount - 1; j++) {
                                books[j] = books[j + 1];
                            }
                            books[bookCount - 1] = null;
                            bookCount--;
                            isExit = true;
                            break;
                        }
                    }
                    if (!isExit)
                        System.out.println("Id không tồn tại");
                    break;
                case 7:
                    System.exit(7);
                    break;






            }

        }
    }
}

