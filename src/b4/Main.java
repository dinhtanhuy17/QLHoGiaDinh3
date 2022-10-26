package b4;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KhuPho khuPho = new KhuPho();
        HoGiaDinh hoGiaDinh1 = new HoGiaDinh();

        System.out.println("Nhap vao so ho dan:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vao dia chi:");
            sc.nextLine();
            String diaChi = sc.nextLine();

            List<ConNguoi> conNguois = new ArrayList<>();
            System.out.println("Nhap vao so thanh vien:");
            int soThanhVien = sc.nextInt();

            for (int j = 0; j < soThanhVien; j++) {
                System.out.println("Nhap vao ten:");
                sc.nextLine();
                String ten = sc.nextLine();
                System.out.println("Nhap vao tuoi:");
                String tuoi = sc.nextLine();
                System.out.println("Nhap vao nghe nghiep:");
                String ngheNghiep = sc.nextLine();
                System.out.println("Nhap vao CMND:");
                String CMND = sc.nextLine();

            }
            khuPho.themGiaDinh(new HoGiaDinh(conNguois, diaChi));


        }

        khuPho.hienThi();

    }
}
