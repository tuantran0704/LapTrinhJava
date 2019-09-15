package Tuan1;

import java.util.ArrayList;
import java.util.Scanner;

public class Product {
	public Scanner sr = new Scanner(System.in);
	private String TenSanPham;//Tên sản phẩm
	private double DonGia;//Đơn giá
	private double GiamGia;//giảm giá
	
	//Hàm dựng 3 tham số
	public Product(String TenSanPham, double DonGia, double GiamGia) {
		this.TenSanPham = TenSanPham;
		this.DonGia = DonGia;
		this.GiamGia = GiamGia;
	}

	//Hàm dựng 2 tham số - sản phẩm không giảm giá
	public Product(String TenSanPham, double DonGia) {
		this.TenSanPham = TenSanPham;
		this.DonGia = DonGia;
	}

	//Hàm dựng rỗng
	public Product() {
	}

	//Get tên sản phẩm
	public String getTenSanPham() {
		return TenSanPham;
	}
	
	//Set tên sản phẩm
	public void setTenSanPham(String TenSanPham) {
		this.TenSanPham = TenSanPham;
	}

	//Get đơn giá
	public double getDonGia() {
		return DonGia;
	}

	//Set đơn giá
	public void setDonGia(double DonGia) {
		this.DonGia = DonGia;
	}

	//Get giá giảm
	public double getGiamGia() {
		return GiamGia;
	}

	//Set giá giảm
	public void setGiamGia(double GiamGia) {
		this.GiamGia = GiamGia;
	}

	//Lấy thuế nhập
	private double getThue()
	{
		return this.DonGia * 0.1;
	}
	
	//Nhập thông tin sản phẩm
	public void input()
	{
		System.out.print("Nhap ten san pham : ");
		String TenSanPham = sr.nextLine();
		this.setTenSanPham(TenSanPham);
		
		System.out.print("Nhap Don Gia : ");
		double DonGia =  sr.nextDouble();
		this.setDonGia(DonGia);
		
		System.out.print("Nhap Giam Gia : ");
		double GiamGia =  sr.nextDouble();
		this.setGiamGia(GiamGia);
	}
	
	//Tạo và xuất mảng sản phẩm
	public void NhapMangSanPham()
	{
		System.out.print("Nhap So San Pham : ");
		int SoSanPham = sr.nextInt();
		Product[] MangSanPham = new Product[SoSanPham];
		
		for(int i=0;i<SoSanPham;i++)
		{
			Product product = new Product();
			product.input();
			MangSanPham[i] = product;
		}
		for(Product product: MangSanPham)
		{
			System.out.println("Ten San Pham: " + product.getTenSanPham() +"\nDon gia: " + product.getDonGia() +"\nGiam Gia: " + product.getGiamGia() + "\nThue: " +product.getThue());
		}
	}
	
	//Xuất thông tin 1 sản phẩm
	public void output()
	{
		System.out.println("Ten San Pham: " + this.getTenSanPham() +"\nDon gia: " + this.getDonGia() +"\nGiam Gia: " + this.getGiamGia() + "\nThue: " +this.getThue());
	}
	
	public static void main(String[] args) {
		Product product1 = new Product();
		product1.input();
		product1.output();
		System.out.println(product1.getThue());
		
		Product product2 = new Product("Product 2",200000);
		product2.output();
		
		Product product3 = new Product("Product 3",300000,3000);
		product3.output();
		
		ArrayList<Product> productArray = new ArrayList<>();
		productArray.add(product1);
		productArray.add(product2);
		productArray.add(product3);
		
		for(Product product: productArray)
		{
			System.out.println("Ten San Pham: " + product.getTenSanPham() +"\nDon gia: " + product.getDonGia() +"\nGiam Gia: " + product.getGiamGia() + "\nThue: " +product.getThue());
		}
		Product product = new Product();
		product.NhapMangSanPham();
	}

}