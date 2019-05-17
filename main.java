package KiemTraGiuaModule;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int length = 1;
        int choice;
        SinhVien listSV[] = new SinhVien[length+1];
        do {
            System.out.printf("\n");
            System.out.println("1. Add student");
            System.out.println("2. Edit student");
            System.out.println("3. Delete student");
            System.out.println("4. Sort student");
            System.out.println("5. Show student");
            System.out.println("0. Exit");
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap lua chon: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.printf("\nNhap ID: ");
                    String id = sc.nextLine();
                    System.out.printf("\nNhap Name: ");
                    String name = sc.nextLine();
                    System.out.printf("\nNhap age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.printf("\nNhap address: ");
                    String address = sc.nextLine();
                    System.out.printf("\nNhap GPA: ");
                    double gpa = sc.nextDouble();

                    SinhVien p = new SinhVien(id, name, age, address, gpa);
                    listSV[length] = new SinhVien();
                    listSV[length] = p;
                    length++;
                    break;
                case 5:
                    for (int i=1; i<length;i++){
                        System.out.printf("\nSinh vien thu ["+i+"]: \n");
                        listSV[i].HienThiSV();
                    }
            }
        }while (choice!=0);
    }
}
