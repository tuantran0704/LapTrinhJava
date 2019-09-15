package Tuan1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Lab3 extends Student {
	public static Scanner sr = new Scanner(System.in);
	public static int[] array ;
	
	//Kiểm tra số nguyên tố
	public static boolean laSoNguyenTo(int number)
	{
		if (number <= 1) {
	           return false;
	       }
	       for (int i = 2; i <= Math.sqrt(number); i++) {
	           if (number % i == 0) {
	               return false;
	           }
	       }
	       return true;
	}
	
	//Xuất bảng cửu chương từ 2 -> 9
	public static void BangCuuChuong()
	{
		for(int i=2;i<10;i++)
		{
			System.out.println("Bang cuu chuong " + i);
			for(int j = 1;j<=10;j++)
			{
				System.out.printf("%d x %d = %d\n",i,j,i*j);
			}
		}
	}
	
	//Nhập mảng
	public static void nhapMang()
	{	
		System.out.print("Nhap so phan tu : ");
		int soPhanTu = sr.nextInt();
		
			array = new int[soPhanTu];
		for(int i = 0;i<soPhanTu;i++)
		{
			System.out.print("Phan tu " + i +": ");
			array[i] = sr.nextInt();
		}
		
//		for(int i=0;i<array.length;i++)
//		{
//			System.out.println("\t" + array[i]);
//		}
	}
	
	//Xuất mảng
	public static void xuatMang(int array[])
	{
		System.out.println("Array: ");
		for(int i=0;i<array.length;i++)
		{
			System.out.println("\t" + array[i]);
		}
	}
	
	//Tìm số bé nhất trong mảng
	public static int SoBeNhatCuaMang(int array[])
	{
		int min = array[0];
		for(int i=1;i<array.length;i++)
		{
			min = Math.min(min, array[i]);
		}
		return min;
	}
	
	//Tính trung bình các số chia hết cho 3 trong mảng
	public static double TrungBinhsoChiaHetCho3(int array[])
	{
		double total = 0;
		double flag = 0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i] % 3 ==0)
			{
				total += array[i]; 
				flag++;
			}
		}
		return total/flag;
	}
	
	//Nhập xuất 2 mảng họ tên và điểm, sắp xếp theo điểm tăng dần
	public static void NhapXuatStudent2()
	{
		System.out.print("Nhap so hoc sinh : ");
		int soHocSinh = sr.nextInt();
		String[] tenHocsinh = new String[soHocSinh];
		float[] diemHocSinh = new float[soHocSinh];
		
		for(int i=0;i<soHocSinh;i++)
		{
			System.out.print("Ten : ");
			sr = new Scanner(System.in);
			tenHocsinh[i] = sr.nextLine();
			
			System.out.print("Diem : ");
			diemHocSinh[i] = sr.nextFloat();
		}
		
		for(int i = 0;i<soHocSinh-1;i++)
		{
			for(int j = i+1;j<soHocSinh;j++)
			{
				if(diemHocSinh[i]>diemHocSinh[j])
				{
					float tempDiem = diemHocSinh[i];
					diemHocSinh[i] = diemHocSinh[j];
					diemHocSinh[j] = tempDiem;
					
					String tempTen = tenHocsinh[i];
					tenHocsinh[i] = tenHocsinh[j];
					tenHocsinh[j] = tempTen;
				}
			}
		}
		
		for(int i=0;i<soHocSinh;i++)
		{
			System.out.println("==================");
			System.out.println("Hoc Sinh " + (i+1));
			if(diemHocSinh[i]>=9)
			{
				System.out.println("Ten : " + tenHocsinh[i] +"\nDiem: " + diemHocSinh[i] +"\nXep Loai: Xuat Sac!!!");
			}
			else if(diemHocSinh[i] <9 && diemHocSinh[i] >=7.5)
			{
				System.out.println("Ten : " + tenHocsinh[i] +"\nDiem: " + diemHocSinh[i] +"\nXep Loai: Gioi!!!");
			}
			else if(diemHocSinh[i] <7.5 && diemHocSinh[i] >=6.5)
			{
				System.out.println("Ten : " + tenHocsinh[i] +"\nDiem: " + diemHocSinh[i] +"\nXep Loai: Kha!!!");
			}
			else if(diemHocSinh[i] <6.5 && diemHocSinh[i] >=5)
			{
				System.out.println("Ten : " + tenHocsinh[i] +"\nDiem: " + diemHocSinh[i] +"\nXep Loai: Trung binh!!!");
			}
			else
			{
				System.out.println("Ten : " + tenHocsinh[i] +"\nDiem: " + diemHocSinh[i] +"\nXep Loai: Yeu!!!");
			}
		}
	}
	public static void main(String[] args) {
		//Nhập và kiểm tra số nguyên tố
		System.out.println("Nhap so kiem tra : ");
		int number = sr.nextInt();
		 if(laSoNguyenTo(number) == true)
		 {
			 System.out.println("La so nguyen to");
		 }
		 else
		 {
			 System.out.println("Khong phai la so nguyen to");
		 }
		
		
		//Nhập mảng tìm số bé nhất và tính trung bình số chi hết cho 3 trong mảng
		nhapMang();
		Arrays.sort(array);
		xuatMang(array);
		System.out.println("So Nho Nhat: "+SoBeNhatCuaMang(array));
		System.out.println("Total: " + TrungBinhsoChiaHetCho3(array));
		
		
		//Xuất bảng cửu chương 2->9
		BangCuuChuong();
		
		//Nhập xuất mảng sinh viên với đối tượng
		Student student = new Student();
		student.inputArrayStudent();
		
		//Nhập xuất sinh viên với 2 mảng tên và điểm
		NhapXuatStudent2();
	}
}