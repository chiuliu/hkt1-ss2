import ra.bussines.Book;

import java.util.Scanner;

public class Main {
    private static Book[] books = new Book[100];

    static {
        books[1] = new Book(1, "Sách 1", "Tác giả 1", "Mô tả 1", 10, 20, true);
        books[2] = new Book(2, "Sách 2", "Tác giả 2", "Mô tả 2", 15, 22, true);
        books[1] = new Book(1, "Sách 1", "Tác giả 1", "Mô tả 1", 18, 25, false);

    }

    private static int length = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(
                    "1.Nhập số lượng sách thêm mới và nhập thông tin cho từng cuốn sách." +
                            "2.Hiển thị thông tin tất cả sản phẩm sạch trong thư viện." +
                            "3. Sắp xếp sách theo lợi nhuận tăng dần" +
                            "4. Xóa sách theo mã sách" +
                            "5. Tìm kiếm tương đối sách theo tên sách hoặc mô tả" +
                            "6. Thay đổi thông tin theo mã sách" +
                            "7. Thoát."
            );
            System.out.println("Moi lua chon");

            }

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    creatBook();
                    break;
//                case 2:
//                    showAllBook();
//                    break;
//                case 3:
//                    deleteBook();
//
//                case 4:
//                    selectionSort();
//                    break;
//                case 5:
//                    findBook();
//                    break;
//                case 6:
//                    chanceBook();
//                    break;
//                case 7:
//                    searchBookName();
//                    break;

//            }
//
//
//        } while (true);
////    }
//////    public static void creatBook(){
//////        Scanner scanner = new Scanner(System.in);
//////        System.out.println("Muốn nhập thêm mấy cuốn sách :");
//////        int n = Integer.parseInt(scanner.nextLine());
//////        for (int i = 0; i < n; i++) {
//////            boolean checkID = false;
//////            do {
//////                System.out.println("Nhập mã sách : ");
//////                String inputProductId = scanner.nextLine();
//////                if (inputProductId.length() == 4 && inputProductId.charAt(0) == 'P') {
////////                    boolean checkNewID = false;
////////
////                    }
////                    if (!checkNewID) {
////                        checkID = true;
////                        products[length] = new Product();
////                        products[length].inputData(scanner);
////                        products[length].setProductID(inputProductId);
////                        length++;
////                    }else {
////                        System.out.println("Mã sản phẩm đã tồn tại. Vui lòng nhập lại.");
////                    }
////                } else {
////                    System.out.println("Mã sản phẩm không hợp lệ. Vui lòng nhập lại.");
////                }
////            } while (!checkID);
//////        }
//////    }
//////
////    }