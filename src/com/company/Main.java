package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	ProgrammingBook[] programmingBook = new ProgrammingBook[5];
    programmingBook[0] = new ProgrammingBook(112,"Cuộc sống Nhật Bản",50,"Nguyễn Văn A","Java","JSF");
    programmingBook[1] = new ProgrammingBook(113,"Những khó khăn",100,"Nguyễn Văn B","JavaScrips","Struts");
    programmingBook[2] = new ProgrammingBook(114,"Những điều vui vẻ",150,"Nguyễn Văn C","Java","Hibernate");
    programmingBook[3] = new ProgrammingBook(115,"Cuộc sống màu hồng",200,"Nguyễn Văn D","Java","GWT");
    programmingBook[4] = new ProgrammingBook(116,"Con người Nhật Bản",300,"Nguyễn Văn E","C++","Vaadin");

    FictionBook[] fictionBook = new FictionBook[5];
    fictionBook[0] = new FictionBook(221,"Sách hay mỗi ngày",45,"Hoàng Thị B","Sách đời sống");
    fictionBook[1] = new FictionBook(222,"Những món ăn ngon",75,"Hoàng Thị C","Sách nấu ăn");
    fictionBook[2] = new FictionBook(223,"Nơi thú vị",100,"Hoàng Thị D","Sách du lịch");
    fictionBook[3] = new FictionBook(224,"Đồ vật thông minh",120,"Hoàng Thị E","Sách đời sống");
    fictionBook[4] = new FictionBook(225,"Kiến thức thú vị",200,"Hoàng Thị F","Sách kến thức");

        implementCode(programmingBook, fictionBook);
    }
    private static void implementCode(ProgrammingBook[] programmingBook, FictionBook[] fictionBook) {
        int totalPriceProgrammingBook = 0;
        int totalFictionBook = 0;
        int count = 0;
        System.out.println("programmingBook: ");
        for (ProgrammingBook pro: programmingBook) {
            System.out.println(pro);
            totalPriceProgrammingBook += pro.getPrice();
        }

        System.out.println("fictionBook:  ");
        for (FictionBook fic: fictionBook) {
            System.out.println(fic);
            totalFictionBook += fic.getPrice();
        }
        System.out.println(" Tổng tiền 10 cuốn sách là =" + (totalFictionBook + totalPriceProgrammingBook));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ngôn ngữ cần đếm sách");
        String input = scanner.next();
        for (ProgrammingBook pro: programmingBook) {
            if (pro.getLanguage().equalsIgnoreCase(input)){
                count++;
            }
        }
        System.out.println("Số cuốn sách ProgrammingBook có language là Java là " + count+ " cuốn");
    }

}
