/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3_hanghoa;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HangThucPham {
     int id;
     String name;
     double price;
     int day1,month1,year1,day2,month2,year2;

    public HangThucPham() {
    }
    
    
     
    public HangThucPham(int id, String name, double price, int day1, int month1, int year1, int day2, int month2, int year2) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.day1 = day1;
        this.month1 = month1;
        this.year1 = year1;
        this.day2 = day2;
        this.month2 = month2;
        this.year2 = year2;
    }

    public void inputInfo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ID:");
        while(true){
            int idInput = Integer.parseInt(input.nextLine());
            boolean check = setId(idInput);
            if(check){
                break;
            }
        }
        System.out.println("Nhap ten hang:");
        while(true){
            String nameInput = input.nextLine();
            boolean check = setName(nameInput);
            if(check){
                break;
            }
        }
        System.out.println("Nhap gia ca:");
        while(true){
            Double priceInput = Double.parseDouble(input.nextLine());
            boolean check = setPrice(priceInput);
            if(check){
                break;
            }
        }
        System.out.println("Nhap ngay san xuat:");
        while(true){
            int day1Input = Integer.parseInt(input.nextLine());
            boolean check = setDay1(day1Input);
            if(check){
                break;
            }
        }
        System.out.println("Nhap thang san xuat:");
        while(true){
            int month1Input = Integer.parseInt(input.nextLine());
            boolean check = setMonth1(month1Input);
            if(check){
                break;
            }
        }
        System.out.println("Nhap nam san xuat:");
        while(true){
            int year1Input = Integer.parseInt(input.nextLine());
            boolean check = setYear1(year1Input);
            if(check){
                break;
            }
        }
        System.out.println("Nhap ngay het han:");
        while(true){
            int day2Input = Integer.parseInt(input.nextLine());
            boolean check = setDay2(day2Input);
            if(check){
                break;
            }
        }
        System.out.println("Nhap thang het han:");
        while(true){
            int month2Input = Integer.parseInt(input.nextLine());
            boolean check = setMonth2(month2Input);
            if(check){
                break;
            }
        }
        System.out.println("Nhap nam het han:");
        while(true){
            int year2Input = Integer.parseInt(input.nextLine());
            boolean check = setYear2(year2Input);
            if(check){
                break;
            }
        }
    }

    public void showInfo(){
        System.out.println("Id:"+id+", ten hang:"+name+",gia ca:"+price+",ngay san xuat:"+day1+"/"+month1+"/"+year1+",ngay het han:"+day2+"/"+month2+"/"+year2);
    }

    public HangThucPham(int id) {
        this.id = id;
    }

    public boolean setId(int id) {
        if(id != 0){
            this.id = id;
            return true;
        }else{
            System.err.println("Moi ban nhap lai id");
            return false;
        }
    }

    public boolean setName(String name) {
        if(name != null){
            this.name = name;
            return true;
        }else{
            System.err.println("khong de trong ten");
            return false;
        }
    }

    public boolean setPrice(double price) {
        if(price>0){
            this.price = price;
            return true;
        }else{
            System.err.println("gia phai lon hon 0");
            return false;
        }
    }

    public boolean setDay1(int day1) {
        if(day1 > 0 && day1 < 31){
            this.day1 = day1;
            return true;
        }else{
            System.err.println("Khong de trong");
            return false;
        }
    }

    public boolean setMonth1(int month1) {
        if(month1 > 0 && month1 <13){
            this.month1 = month1;
            return true;
        }else{
            System.err.println("Khong de trong");
            return false;
        }
    }

    public boolean setYear1(int year1) {
        if(year1 > 0){
            this.year1 = year1;
            return true;
        }else{
            System.err.println("Khong de trong");
            return false;
        }
    }

    public boolean setDay2(int day2) {
        if(day2 >= day1){
            this.day2 = day2;
            return true;
        }else{
            System.err.println("Khong de trong");
            return false;
        }
    }

    public boolean setMonth2(int month2) {
        if(month2 >= month1){
            this.month2 = month2;
            return true;
        }else{
            System.err.println("Khong de trong");
            return false;
        }
    }

    public boolean setYear2(int year2) {
        if(year2 >= year1){
            this.year2 = year2;
            return true;
        }else{
            System.err.println("Khong de trong");
            return false;
        }
    }
     @Override
    public String toString(){
        return "\nMa hang:"+this.id+"\nTen hang:"+this.name+"\nGia:"+this.price+"\nNgay san xuat:"+this.day1+"/"+this.month1+"/"+this.year1+"\nNgay het han:"+this.day2+"/"+this.month2+"/"+this.year2;
    }
}
