package _04.statics;

public class Notes {

}

//static -> keyword

//static variables
//static methods
//static nested class
//static initialzie block
//static import

class Employee {

	private static int count = 10; // static variable

	// instance degiskenler obje ile instance ile birlikte yasarlar.
	/// n tane Employee objesi olsun.
	// bu durumda her objenin kendine ait 1 tane age alani/property degeri/ instance degiskeni mevcuttur.
	
	// obje sayisindan bagimsiz olarak sadece 1 tane "count" static degiskeni mevcuttur.
	
	// static variable -> class variable
	// instance variable -> instance variable / object variable
	
	
	// java da objeler heap memoryde yasarlar.
	// instance degiskenler de heap memoryde yasar. degiskenin kendisi 
	private int age; // instace variable
	
	
	// static degiskenin kendisi permgen denilen ozel heap bolgesinde yasar.
	// eger bir objeyi gosteriyorsa , bu obje yine heap alaninda yasar.
	
	
	// her metodu her degiskeni static yapmak DOGRU bir yaklasim degildir!
	
	// static methodlarin kullanicagi noktalar ;
	// Utility diye ifade edilen yardimci/pratik siniflardir.
	
	// projede farkli siniflarin, farkli metotlarin ihtiyaci olan bir formatlama (number, date)vs, text islemi , dosya okuma islemi vs
	// bu gibi islemler icin static metotlari tercih ederiz. ve direkt className.staticMethodName seklinde cagirip kullaniirirz.
	// bu classlar Object Oriented acisindan her hangi bir hiyerarsik durum ifade etmez.
	// tamamen yardimci/utility amacli classlardir.
	

}