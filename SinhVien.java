package KiemTraGiuaModule;

import com.sun.source.tree.NewArrayTree;

import java.util.Scanner;

public class SinhVien {
    private String id;
    private String name;
    private int age;
    private String address;
    private double gpa;

    SinhVien(){}
    SinhVien(String id, String name, int age, String address, double gpa){
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }

    public String getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getAddress(){
        return this.address;
    }
    public double getGpa(){
        return this.gpa;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setGpa(float gpa){
        this.gpa = gpa;
    }
    public void NhapSV(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap ID: ");
        String id = sc.nextLine();
        System.out.printf("Nhap Name: ");
        String name = sc.nextLine();
        System.out.printf("Nhap age: ");
        int age = sc.nextInt();
        System.out.printf("Nhap address: ");
        String address = sc.nextLine();
        System.out.printf("Nhap GPA: ");
        double gpa = sc.nextDouble();
        SinhVien sv = new SinhVien(id, name, age, address, gpa);
    }

    public void HienThiSV(){
        System.out.printf("ID: "+getId());
        System.out.printf("\nNAME: "+getName());
        System.out.printf("\nAGE: "+getAge());
        System.out.printf("\nADDRESS: "+getAddress());
        System.out.printf("\nGPA: "+getGpa());
    }

    public void addStuden(SinhVien sv){
        int length = 1;
        SinhVien sv1 = new SinhVien();
        sv1.NhapSV();
        SinhVien listSV[] = new SinhVien[length];
        listSV[length] = sv1;
        length++;

    }
}
